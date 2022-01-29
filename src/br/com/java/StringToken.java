package br.com.java;

public class StringToken {
    public static void main(String[] args) {

        String s = "XHTML; CSS; JavaScript; jQuery; Java"; // ou seja temos 5 tokens
        String[] tokens = s.split(";"); // o delimitador pode ser qualquer coisa, ele vai procurar e tirar esse dado de onde ele encontrar o que foi informado
        System.out.println(tokens.length + " tokens");
        for (String token : tokens){
            System.out.println(token);
        }


    }

}
