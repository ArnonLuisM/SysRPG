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
        setData(data);
        setDescricao(descricao);
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return new Date(data.getTime());
    }

    public void setData(Date data) {
        if (data == null) {
            System.out.println("Data nao pode ser vazia.");
        }
        this.data = new Date(data.getTime());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        validarTexto(descricao, "Descricao");
        this.descricao = descricao;
    }
    
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            System.out.println(campo + " nao pode ser vazio.");
        }
    }
    
}
    
