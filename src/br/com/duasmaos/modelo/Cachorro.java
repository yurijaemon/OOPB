package br.com.duasmaos.modelo;

import br.com.duasmaos.interfaces.Mamifero;

/**
 * Created by yurijm on 15/06/17.
 */
public class Cachorro implements Mamifero {

    private String nome;
    private String raca;
    private int peso;
    private int idade;

    public Cachorro() {

        this.setNome("Rosario");
        this.setRaca("MelhorQueMalandro");
        this.setPeso(30);
        this.setIdade(20);

        System.out.println("Cachorro " + this.getNome() + " construido!");
    }
    public Cachorro(String nome, String raca, int peso, int idade) {
        this.setNome(nome);
        this.setRaca(raca);
        this.setPeso(peso);
        this.setIdade(idade);
    }

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


    public void mama() {}
    public void come() {}
    public void bebe() {}
    public void fazCoco(int tamanho) {}
    public void amamenta() {}
    public void berra() {}
}
