package br.com.heranca;

public class Animal {

    double peso;
    String comida;
    private int serial;
    protected int serie; //só aparece nas subclasses



    public Animal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }

    void dormir(){System.out.println("Dormiu");}
    void fazerBarulho(){System.out.println("Fazer Barulho");}

}
