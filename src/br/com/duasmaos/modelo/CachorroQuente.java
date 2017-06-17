package br.com.duasmaos.modelo;

/**
 * Created by yurijm on 17/06/17.
 */
public class CachorroQuente extends Cachorro{
    private int temperatura;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temp) {
        this.temperatura = temp * 2; // O cachorro tem que ser QUENTE
    }
}
