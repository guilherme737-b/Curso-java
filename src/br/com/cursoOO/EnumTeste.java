package br.com.cursoOO;

public class EnumTeste {
    public static final double PI = 3.14;

    public static void andar(Medida medida, int total){

    }

    public static void main(String[] args) {

       System.out.println(PecasXadrez.BISPO);
       System.out.println(Medida.M);
       System.out.println(Medida.CM.titulo);

       for(Medida m: Medida.values()){
           System.out.println(m + " : " + m.titulo);
       }

       andar(Medida.M, 100);
    }

}
