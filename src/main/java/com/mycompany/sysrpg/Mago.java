
package com.mycompany.sysrpg;

/**
 *
 * @author arnon
 */
public class Mago extends Personagem implements Atacante{
    private int inteligencia;

    public Mago(String nome, int nivel, int vida, int inteligencia) {
        super(nome, nivel, vida);
        setInteligencia(inteligencia);
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        if (inteligencia < 0) {
            System.out.println("Inteligencia nao pode ser negativa.");
        }
        this.inteligencia = inteligencia;
    }
    
    

    @Override
    public String atacar() {
        return (this.getNome() + " o(a) mago(a) ataca!");
    }
    
    
}
