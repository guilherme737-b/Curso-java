package br.com.java;

public class StringMutavel {

    public static void main(String[] args) {

        StringBuffer s0 = new StringBuffer();
        StringBuilder s1 = new StringBuilder("Java");



        s1.toString();
        s1.length();
        System.out.println(s1.length());
        s1.capacity();
        System.out.println(s1.capacity());

        s1.append(" Tecnologia que estou trabalhando");
        char[] c = {'c', 'o', 'm'};
        s1.append(c).append(" com Textos.");
        System.out.println(s1);

       // String s = "Oi" + " como " + "vai você";
        String sb = new StringBuilder("Oi")
                .append(" com ").append("vai você").toString();
        System.out.println(sb);

       String url = new StringBuilder("www.Gui.com.br").delete(0, 4).toString();
       System.out.println(url);



    }
}
