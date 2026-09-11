
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
        setNome(nome);
        setNivel(nivel);
        setVida(vida);
        this.itens = new ArrayList<>();
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel <= 0) {
            System.out.println("Nivel deve ser maior que zero.");
        }
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            System.out.println("Vida nao pode ser negativa.");
        }
        this.vida = vida;
    }

    public void receberDano(int dano){
        if (dano <= 0) {
            System.out.println("Dano deve ser maior que zero.");
        }
        vida = Math.max(0, vida - dano);
        
        System.out.println(this.getNome() + " sofreu " + dano + " de dano!");
        
        if(vida <= 0){
            System.out.println(this.getNome() + " Morreu!");
        }
    }
    
    public void curar(int valor){
        if (valor <= 0) {
            System.out.println("Valor de cura deve ser maior que zero.");
        }
        vida = (vida + valor);
        
        System.out.println(this.getNome() + " curou " + valor + " de HP!");
    }
    
    public void adicionarItem(Item item){
        if (item == null) {
            System.out.println("Item nao pode ser nulo.");
        }
        itens.add(item);
    }
    
    public Item buscarItem(int id){
        validarId(id);
        for(Item item : itens){
            if(item.getId() == id) return item;
            
                    
        }
        
        System.out.println("Não existe um item com esse ID registrado a este Personagem!");
        return null;
    }
    
    public ArrayList<Item> listaritens(){
        return new ArrayList<>(itens);
    }
    
    public boolean removerItem(int id){
        validarId(id);
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
        if (mentor == null) {
            System.out.println("Mentor nao pode ser nulo.");
        }
        if (mentor == this) {
            System.out.println("Personagem nao pode ser mentor de si mesmo.");
        }
        this.mentor = mentor;
        System.out.println(mentor + " agora mentora " + this.getNome());
    }

    public Personagem getMentor() {
        return mentor;
    }


   
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            System.out.println(campo + " nao pode ser vazio.");
        }
    }

    private void validarId(int id) {
        if (id <= 0) {
            System.out.printlnn("ID deve ser maior que zero.");
        }
    }

}
