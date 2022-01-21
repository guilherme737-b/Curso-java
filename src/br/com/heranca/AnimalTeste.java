package br.com.heranca;

public class AnimalTeste {

    public static void main(String[] args) {

    Cachorro rex = new Cachorro();
    rex.comida = "Carne";
    rex.dormir();
    System.out.println(rex);

    Galinha carijo = new Galinha();
    carijo.dormir();
    System.out.println(carijo);

    }

}
