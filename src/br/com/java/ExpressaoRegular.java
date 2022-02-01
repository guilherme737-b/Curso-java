package br.com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {
    public static void main(String[] args) {

        boolean b = "Java".matches("Java");
        System.out.println(b);

        // Para ignorar letras maiuscolas  b = "Java".matches("(?i)java");

        b = "Piear21".matches("^Piear.*"); //para validar se a letra começa com, .* termina com qualquer tipo
        b = "Piear21".matches(".*21$"); // .* começa com qualquer tipo e termina com 21 $
        b = "tem java aqui".matches(".*java.*"); // Agora para validar se tem um caracter dentro da frase, basta digitar .* a palavra que queria buscar .*
        b = "tem java aqui".matches("^tem.*aqui$"); // começa com tem pelo o ^ e meio meio tanto faz (.*) e termina com aqui$
        b = "sim".matches("sim|não"); // validar se tem palavra ou outra na validação
        System.out.println(b);

         b = "x".matches("[a-z]"); // validar letra de a-z porem apenas minuscula dessa forma
         b = "3".matches("[0-9]"); // validar numero de 0-9
         b = "True".matches("[tT]rue"); // validar se tem esta palavra no texto, e desta forma do ex, podemos usar o t minusculo ou maisculo.
         b = "Guilherme".matches("[A-Za-z]*"); // validar se é maisculo ou minusculo de A-Z
         b = "olho".matches("[^abc]lho"); //usando ^ estamos informando uma exessão ou seja que não comece com abc e que termine com lho
         b = "crau".matches("cr[ae]u"); //podemos usar a ou e nesta validação
         b = "gui@gmail.com".matches("\\w+@\\w+\\.\\w{2,3}"); // validando o email de forma simples, usando w+ para 1 ou mais caracter e finalizando com 2 ou 3 mletras
         System.out.println(b);

         String doce = "Qual é o Doce mais doCe que o doce";
         Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
        while (matcher.find()){
            System.out.println(matcher.group());  // Nesta expressão usamos a importação das bibliotecas Matcher e Pattern para consegui buscar no texto, todos os nomes da palavra doce.
        }

        /* Substituições */

        String r = doce.replaceAll("(?i)doce", "DOCINHO"); // aqui estamos usando a substiuição usando replaceALl para subistituir todas as letras e ?i para inorar maiuscula
        System.out.println(r);

        String rato = "O rato roeu a roupa do rei de roma";
        r = rato.replaceAll("r[aeiou]", "XX");
        System.out.println(r);

        r = "tabular este texto".replaceAll("\\s", "\t");
        System.out.println(r);

        String url = "www.guilherme.com.br/games-2022.html";
        String re = "www.guilherme.com.br/\\w{2,}-\\d{4}.html";
        b = url.matches(re); // usamos este metodo
        System.out.println(b);

        re = "(www.guilherme.com.br)/(\\w{2,})-(\\d{4}).html";

       r = url.replaceAll(re,"http://$1/$3/$2.jsp");
       System.out.println(r);
       System.out.println(url);




    }
}
