
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
        setNome(nome);
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
    
    public String narrar(String mensagem){
        validarTexto(mensagem, "Mensagem");
        return ("O mestre narra: " + mensagem);
    }

    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            System.out.println(campo + " nao pode ser vazio.");
        }
    }
}
