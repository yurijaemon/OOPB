package br.com.duasmaos.main;

import br.com.duasmaos.modelo.Cachorro;
import br.com.duasmaos.modelo.Pessoa;
import br.com.duasmaos.modelo.CachorroQuente;
import br.com.duasmaos.modelo.Jogador;

/**
 * Created by yurijm on 15/06/17.
 */
public class main {

    public static void main(String[] args){

        Pessoa josefina = new Pessoa();
        Cachorro salomao = new Cachorro();
        CachorroQuente Bigode = new CachorroQuente();
        String nome;

        int tamanhoNome;
        int Teste[];
        Teste = new int[10];

        josefina.setNome(null);
        nome = josefina.getNome();

        try {
            //tamanhoNome = nome.length();
            Teste[11] = 10;
        }
        catch(NullPointerException e) {
            // Fudeu batima
            System.out.print("Dentro do catch");

        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Fudeu de novo batima
            System.out.print("Dentro do Arreindexautofebaundincepxon");

        }
    }

}
