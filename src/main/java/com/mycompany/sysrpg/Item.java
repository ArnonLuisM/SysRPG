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
public class Item {
    private int id;
    private String nome;
    private String tipo;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Item(String nome, String tipo) {
        this.id = count.incrementAndGet();
        this.nome = nome;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
