/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sysrpg;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author arnon
 */
public class Mestre {
    private int id;
    private String nome;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Mestre(String nome) {
        this.id = count.incrementAndGet();
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
    public String narrar(String mensagem){return ("O mestre narra: " + mensagem);}
}
