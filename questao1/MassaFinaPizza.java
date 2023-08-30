/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab3.decorator.pizza2;

/**
 *
 * @author fabiola
 */
public class MassaFinaPizza implements Pizza {

    @Override
    public double custo() {
        return 50.00;
    }

    @Override
    public String getDescricao() {
        return "Pizza massa fina";
    }
    
}
