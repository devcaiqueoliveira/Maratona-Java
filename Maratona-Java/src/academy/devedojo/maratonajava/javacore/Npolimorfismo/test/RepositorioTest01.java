package academy.devedojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devedojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import academy.devedojo.maratonajava.javacore.Npolimorfismo.service.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
