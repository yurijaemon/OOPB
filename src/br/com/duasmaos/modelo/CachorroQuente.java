package br.com.duasmaos.modelo;

/**
 * Created by yurijm on 17/06/17.
 */
public class CachorroQuente extends Cachorro{

    private int temperatura;

    public CachorroQuente() {

        super("Bigode", "Malandro", 98, 1);

        /* Parametros agora atribuidos atraves do construtor da classe Cachorro
        this.setNome("Bigode");
        this.setRaca("Malandro");
        this.setPeso(98);
        this.setIdade(1);
        */

        this.temperatura = 35;

        System.out.println("Cachorro QUENTE " + this.getNome() + " construido!");
    }
    public CachorroQuente(String nome, String raca, int peso, int idade, int temperatura ) {
        this.setNome(nome);
        this.setRaca(raca);
        this.setPeso(peso);
        this.setIdade(idade);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temp) {
        this.temperatura = temp * 2; // O cachorro tem que ser QUENTE
    }
}

