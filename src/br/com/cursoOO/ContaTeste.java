package br.com.cursoOO;

public class ContaTeste {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.cliente = "Guilherme";
        conta.saldo = 1_000.00;
        conta.exibeSaldo();

        conta.saca(100);
        conta.exibeSaldo();

        conta.deposita(500);
        conta.exibeSaldo();

        Conta destino = new Conta();
        destino.cliente = "Caio";
        destino.saldo = 5_000.00;
        destino.exibeSaldo();

        conta.transferePara(destino, 800);
        conta.exibeSaldo();
        destino.exibeSaldo();

    }
}
