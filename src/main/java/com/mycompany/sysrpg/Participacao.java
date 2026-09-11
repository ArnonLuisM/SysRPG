
package com.mycompany.sysrpg;

import java.util.Date;

/**
 *
 * @author arnon
 */
public class Participacao {
    private String papel;
    private Date dataEntrada;

    public Participacao(String papel, Date dataEntrada) {
        setPapel(papel);
        setDataEntrada(dataEntrada);
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        validarTexto(papel, "Papel");
        this.papel = papel;
    }

    public Date getDataEntrada() {
        return new Date(dataEntrada.getTime());
    }

    public void setDataEntrada(Date dataEntrada) {
        if (dataEntrada == null) {
            System.out.println("Data de entrada nao pode ser vazia.");
        }
        this.dataEntrada = new Date(dataEntrada.getTime());
    }
    
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            System.out.println(campo + " nao pode ser vazio.");
        }
    }

}
