
package com.mycompany.sysrpg;

/**
 *
 * @author arnon
 */
public class Arqueiro extends Personagem implements Atacante{
    private int precisao;

    public Arqueiro(int precisao, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        setPrecisao(precisao);
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        if (precisao < 0) {
            System.out.println("Precisao nao pode ser negativa.");
        }
        this.precisao = precisao;
    }
    

    @Override
    public String atacar() {
        return(this.getNome() + " o(a) arqueiro(a) ataca!");
    }
    
    
}
