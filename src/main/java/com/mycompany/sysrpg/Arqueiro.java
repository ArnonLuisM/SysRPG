/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sysrpg;

/**
 *
 * @author arnon
 */
public class Arqueiro extends Personagem implements Atacante{
    private int precisao;

    public Arqueiro(int precisao, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.precisao = precisao;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }
    

    @Override
    public String atacar() {
        return(this.getNome() + " o(a) arqueiro(a) ataca!");
    }
    
    
}
