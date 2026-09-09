/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sysrpg;

/**
 *
 * @author arnon
 */
public class Guerreiro extends Personagem implements Atacante{
    
    private int forca;

    public Guerreiro(String nome, int nivel, int vida, int forca) {
        super(nome, nivel, vida);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
    

    @Override
    public String atacar() {
        return (this.getNome() + " o(a) guerreiro(a) ataca!");
    }
    
}
