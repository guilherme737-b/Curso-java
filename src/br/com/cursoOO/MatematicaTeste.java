package br.com.cursoOO;

public class MatematicaTeste {

    public static void main(String[] args) {

    Matematica m = new Matematica();
    int ma = m.maior(10, 20);
    System.out.println(ma);

    double so = m.soma(50, 30, 13, 15, 23, 38);
    System.out.println(so);

    //soma o maior numero par com o maior numero impar
    int par = m.maior(2,4);
    int impar = m.maior(3,5);
    double som = m.soma(par,impar);
    System.out.println(som);
    }
}
