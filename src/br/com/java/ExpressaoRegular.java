package br.com.java;

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



    }
}
