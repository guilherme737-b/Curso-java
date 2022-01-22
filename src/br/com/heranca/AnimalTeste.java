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

    Animal generico = new Animal(0,null);

    System.out.println(rex instanceof Cachorro);
    System.out.println(rex instanceof Animal);

    rex.fazerBarulho();
    carijo.fazerBarulho();
    generico.fazerBarulho();



    }

}
