package br.com.duasmaos.modelo;

/**
 * Created by yurijm on 15/06/17.
 */
public class Cachorro {

    private String nome;
    private String raca;
    private int peso;
    private int idade;

    // Getters
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }


    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
