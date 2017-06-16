package br.com.duasmaos.main;

import br.com.duasmaos.modelo.Cachorro;
import br.com.duasmaos.modelo.Pessoa;

/**
 * Created by yurijm on 15/06/17.
 */
public class main {

    public static void main(String[] args){
        Pessoa josefina = new Pessoa();
        Cachorro salomao = new Cachorro();

        String nome;
        int tamanhoNome;

        josefina.setNome(null);
        nome = josefina.getNome();
        
        tamanhoNome = nome.length();

    }

}
