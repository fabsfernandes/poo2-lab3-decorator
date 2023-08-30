/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab3.decorator.pizza2;

/**
 *
 * @author fabiola
 */
public class MassaEspessaPizza implements Pizza {

    @Override
    public double custo() {
        return 60.0;
    }

    @Override
    public String getDescricao() {
        return "Pizza massa espessa";
    }
    
}
