package br.com.duasmaos.modelo;

/**
 * Created by yurijm on 17/06/17.
 */
public abstract class Humano {
    public void fazCoco(int volume) {
        System.out.print("Cagalhao de " + volume + " litros expelido");
    }
    public abstract void fazSexo();
}
