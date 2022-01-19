package br.com.cursoOO;

public class GalinhaTeste {

    public static void main(String[] args) {

        Galinha g1 = new Galinha();
        g1.botar().botar().botar();

        Galinha g2 = new Galinha();
        g2.botar().botar();

        System.out.println("A galinha 1 botou " + g1.ovos);
        System.out.println("A galinha 2 botou " + g2.ovos);
        System.out.println("A Granja esta com " + Galinha.ovosDaGranja + " Ovos");
        System.out.println(Galinha.mediaDeOvos(2));
    }



}
