
package com.mycompany.sysrpg;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author arnon
 */
public class Jogador {
    private int id;
    private String nome;
    private ArrayList<Personagem> personagens;
    private static final AtomicInteger count = new AtomicInteger(0); //para ID incremental sem BD 
    
    
    public Jogador(String nome) {
        this.id = count.incrementAndGet();
        setNome(nome);
        this.personagens = new ArrayList<>();
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
    
    public void adicionarPersonagem(Personagem personagem){
        if (personagem == null) {
            System.out.println("Personagem nao pode ser nulo.");
        }
        personagens.add(personagem);
    }
    
    public Personagem buscarPersonagem(int id){
        validarId(id);
        for(Personagem personagem : personagens){
            if(personagem.getId() == id) return personagem;
            
                    
        }
        
        System.out.println("Não existe personagem com esse ID registrado a este jogador!");
        return null;
    }
    
    public ArrayList<Personagem> listarPersonagens(){
        return new ArrayList<>(personagens);
    }
    
    public boolean removerPersonagem(int id){
        validarId(id);
        for(Personagem personagem : personagens){
            if(personagem.getId() == id){
                personagens.remove(personagem);
                System.out.println("Personagem removido!");
                return true;        
            }
        }
        
        System.out.println("Não existe personagem com esse ID registrado a este jogador!");
        return false;
    }

    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            System.out.println(campo + " nao pode ser vazio.");
        }
    }

    private void validarId(int id) {
        if (id <= 0) {
            System.out.println("ID deve ser maior que zero.");
        }
    }
}
