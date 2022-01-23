package br.com.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

    public static void main(String[] args) {



    Scanner s = new Scanner(System.in);
    boolean continua = true;

 do {
     try {
         System.out.println("Digite o Primeiro numero: ");
         int a = s.nextInt();
         System.out.println("Digite o seguindo numero; ");
         int b = s.nextInt();

         System.out.println("O resultado é: " + a / b);
         continua = false;
     }
     catch (InputMismatchException | ArithmeticException e1){
         System.err.println("Favor digitar numeros validos para divisão(Numeros inteiros ");
         e1.printStackTrace();
         s.nextLine();
     }

     finally {
         System.out.println("Finally foi execultado");
     }

 } while (continua);



    }


}
