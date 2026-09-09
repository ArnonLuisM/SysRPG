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
public class Personagem{
    private int id;
    private String nome;
    private int nivel;
    private int vida;
    private Personagem mentor;
    private ArrayList<Item> itens;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Personagem(String nome, int nivel, int vida) {
        this.id = count.incrementAndGet();
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void receberDano(int dano){
        vida = (vida - dano);
        
        System.out.println(this.getNome() + " sofreu " + dano + " de dano!");
        
        if(vida <= 0){
            System.out.println(this.getNome() + " Morreu!");
        }
    }
    
    public void curar(int valor){
        vida = (vida + valor);
        
        System.out.println(this.getNome() + " curou " + valor + " de HP!");
    }
    
    public void adicionarItem(Item item){
        itens.add(item);
    }
    
    public Item buscarItem(int id){
        for(Item item : itens){
            if(item.getId() == id) return item;
            
                    
        }
        
        System.out.println("Não existe um item com esse ID registrado a este Personagem!");
        return null;
    }
    
    public ArrayList<Item> listaritens(){
        return itens;
    }
    
    public boolean removerItem(int id){
        for(Item item : itens){
            if(item.getId() == id){
                itens.remove(item);
                System.out.println("Item removido!");
                return true;        
            }
        }
        
        System.out.println("Não existe item com esse ID registrado a este personagem!");
        return false;
    }
    
    
    public void definirMentor(Personagem mentor){
        this.mentor = mentor;
        System.out.println(mentor + " agora mentora " + this.getNome());
    }

    public Personagem getMentor() {
        return mentor;
    }

   
    
    
}
