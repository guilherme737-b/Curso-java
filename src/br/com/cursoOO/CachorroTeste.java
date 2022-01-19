package br.com.cursoOO;

public class CachorroTeste {

    public static void main(String[] args) {


        Cachorro pitbull = new Cachorro();
        pitbull.raça = "Pit Bull";
        pitbull.tamanho = 40;
        pitbull.latir();

        Cachorro viralata = new Cachorro();
        viralata.raça = "vira lata";
        viralata.tamanho = 20;
        viralata.latir();


    }


}