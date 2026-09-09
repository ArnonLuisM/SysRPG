/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    public void adicionarPersonagem(Personagem personagem){
        personagens.add(personagem);
    }
    
    public Personagem buscarPersonagem(int id){
        for(Personagem personagem : personagens){
            if(personagem.getId() == id) return personagem;
            
                    
        }
        
        System.out.println("Não existe personagem com esse ID registrado a este jogador!");
        return null;
    }
    
    public ArrayList<Personagem> listarPersonagens(){
        return personagens;
    }
    
    public boolean removerPersonagem(int id){
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
}
