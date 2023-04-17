package br.com.javaoo.alura.vitor.banco;

public class CriaConta {

    public static void main(String[] args) {
        Cliente primeiroCliente = new Cliente("Teste","12321312321","23331000");
        Cliente segundoCliente = new Cliente("Teste","12321312321","23331000");

        Conta contaSimples = new Conta(5000.0, 1L,1L,primeiroCliente);
        Conta contaSimples2 = new Conta(300.0, 1L,1L,segundoCliente);


        contaSimples.setSaldo(contaSimples.getSaldo() + 100.10);
        System.out.println(contaSimples.getSaldo());

        contaSimples.transferir(contaSimples,6000.0,contaSimples2);
        contaSimples2.transferir(contaSimples2,50,contaSimples);
        contaSimples.sacar(20);
        contaSimples.depositar(500);


    }
}
