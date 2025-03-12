package academy.devedojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devedojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
