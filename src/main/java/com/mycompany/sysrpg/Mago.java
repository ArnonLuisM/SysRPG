/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sysrpg;

/**
 *
 * @author arnon
 */
public class Mago extends Personagem implements Atacante{
    private int inteligencia;

    public Mago(String nome, int nivel, int vida, int inteligencia) {
        super(nome, nivel, vida);
        this.inteligencia = inteligencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    

    @Override
    public String atacar() {
        return (this.getNome() + " o(a) mago(a) ataca!");
    }
    
    
}
