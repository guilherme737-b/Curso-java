package br.com.cursoOO;

public class Conta implements java.io.Serializable {

     String cliente;
    transient double saldo; // usamos transient para impedir a serialização daquela informação

    public Conta(){}
    public Conta(String cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }



    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }



    public void exibeSaldo() {
        System.out.println(cliente + " seu saldo é de " + saldo);
    }
    
    void saca(double valor){
        saldo -= valor;
    }

    void deposita(double valor){
        saldo += valor;
    }

    void transferePara(Conta destino, double valor){
        this.saca(valor);
        destino.deposita(valor);
    }


}
