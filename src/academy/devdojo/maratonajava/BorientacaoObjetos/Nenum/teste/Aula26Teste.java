package academy.devdojo.maratonajava.BorientacaoObjetos.Nenum.teste;


import academy.devdojo.maratonajava.BorientacaoObjetos.Nenum.dominio.Aula26Cliente;
import academy.devdojo.maratonajava.BorientacaoObjetos.Nenum.dominio.Aula26TipoCliente;
import academy.devdojo.maratonajava.BorientacaoObjetos.Nenum.dominio.Aula26TipoPagamento;

public class Aula26Teste {

    public static void main(String[] args) {

        Aula26Cliente cliente1= new Aula26Cliente("Ana", Aula26TipoCliente.PESSOA_FISICA, Aula26TipoPagamento.DEBITO);
        Aula26Cliente cliente2= new Aula26Cliente("Ana", Aula26TipoCliente.PESSOA_JURIDICA, Aula26TipoPagamento.CREDITO);
        Aula26Cliente cliente3= new Aula26Cliente("Ana", Aula26TipoCliente.PESSOA_FISICA,  Aula26TipoPagamento.CREDITO);
        Aula26Cliente cliente4= new Aula26Cliente("Ana", Aula26TipoCliente.PESSOA_JURIDICA,  Aula26TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(Aula26TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(Aula26TipoPagamento.CREDITO.calcularDesconto(100));
        Aula26TipoCliente tipoCliente= Aula26TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);



    }
}
