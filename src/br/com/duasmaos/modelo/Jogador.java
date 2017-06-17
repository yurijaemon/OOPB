package br.com.duasmaos.modelo;

/**
 * Created by yurijm on 17/06/17.
 */
public class Jogador extends Pessoa{

    private int numeroUniforme;
    private String posicao;
    private String equipe;

    // Getters
    public int getNumeroUniforme() {
        return numeroUniforme;
    }
    public String getPosicao() {
        return posicao;
    }
    public String getEquipe() {
        return equipe;
    }

    // Setters
    public void setNumeroUniforme(int numero) {
        this.numeroUniforme = numero;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

}
