
package com.mycompany.sysrpg;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author arnon
 */
public class Mesa {
    private int id;
    private String nome;
    private Mestre mestre;
    private ArrayList<Jogador> jogadores;
    private ArrayList<Participacao> participacoes;
    private ArrayList<Sessao> sessoes;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Mesa(String nome, Mestre mestre) {
        this.id = count.incrementAndGet();
        setNome(nome);
        setMestre(mestre);
        this.jogadores = new ArrayList<>();
        this.participacoes = new ArrayList<>();
        this.sessoes = new ArrayList<>();
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

    public Mestre getMestre() {
        return mestre;
    }

    public void setMestre(Mestre mestre) {
        if (mestre == null) {
            System.out.println("Mestre nao pode ser nulo.");
        }
        this.mestre = mestre;
    }

    public void adicionarJogador(Jogador jogador) {
        if (jogador == null) {
            System.out.println("Jogador nao pode ser nulo.");
        }
        jogadores.add(jogador);
    }

    public ArrayList<Jogador> listarJogadores() {
        return new ArrayList<>(jogadores);
    }

    public void adicionarParticipacao(Participacao participacao) {
        if (participacao == null) {
            System.out.println("Participacao nao pode ser nula.");
        }
        participacoes.add(participacao);
    }

    public ArrayList<Participacao> listarParticipacoes() {
        return new ArrayList<>(participacoes);
    }

    public Sessao criarSessao(Date data, String descricao) {
        Sessao sessao = new Sessao(data, descricao);
        sessoes.add(sessao);
        return sessao;
    }

    public ArrayList<Sessao> listarSessoes() {
        return new ArrayList<>(sessoes);
    }
    
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            System.out.println(campo + " nao pode ser vazio.");
        }
    }

}
