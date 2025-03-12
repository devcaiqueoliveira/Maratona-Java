package academy.devedojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devedojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
