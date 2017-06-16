package br.com.duasmaos.modelo;

/**
 * Created by yurijm on 15/06/17.
 */
public class Pessoa {

    private String nome;
    private String posicao;
    private int numeroUniforme;
    private int altura;
    private int idade;


    // Getters
    public String getNome() {
        return nome;
    }

    public int getNumeroUniforme() {
        return numeroUniforme;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroUniforme(int numero) {
        this.numeroUniforme = numero;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
