/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab3.decorator.pizza2;

/**
 *
 * @author fabiola
 */
public class Ovo extends ToppingDecorator {
    
    public Ovo(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public double custo() {
        return pizza.custo() + 10.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com ovo";
    }
    
}
