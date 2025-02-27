package academy.devedojo.maratonajava.javacore.Kenumeracoes.test;

import academy.devedojo.maratonajava.javacore.Kenumeracoes.domain.Cliente;
import academy.devedojo.maratonajava.javacore.Kenumeracoes.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1.toString());

    }
}