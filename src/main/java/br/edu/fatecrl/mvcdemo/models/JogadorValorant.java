package br.edu.fatecrl.mvcdemo.models;

public class JogadorValorant {
    private String nome;
    private String agente;
    private int nivel;
    private int frags;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAgente() {
        return agente;
    }
    public void setAgente(String agente) {
        this.agente = agente;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getFrags() {
        return frags;
    }
    public void setFrags(int frags) {
        this.frags = frags;
    }
    public JogadorValorant(String nome, String agente, int nivel, int frags) {
        this.nome = nome;
        this.agente = agente;
        this.nivel = nivel;
        this.frags = frags;
    }


}
