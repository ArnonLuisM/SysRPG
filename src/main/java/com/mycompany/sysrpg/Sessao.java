/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sysrpg;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author arnon
 */
public class Sessao {
    private int id;
    private Date data;
    private String descricao;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Sessao(Date data, String descricao) {
        this.id = count.incrementAndGet();
        this.data = data;
        this.descricao = descricao;      
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
    

