
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
        setNome(nome);
        setTipo(tipo);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validarTexto(nome, "Nome");
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        validarTexto(tipo, "Tipo");
        this.tipo = tipo;
    }
    
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            System.out.println(campo + " nao pode ser vazio.");
        }
    }
    
}
