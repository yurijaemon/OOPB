package br.com.duasmaos.modelo;

/**
 * Created by yurijm on 15/06/17.
 */
public class Pessoa {

    private String nome;
    private String peso;
    private int altura;
    private int idade;


    // Getters
    public String getNome() {
        return nome;
    }

    public String getPeso() {
        return peso;
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

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
