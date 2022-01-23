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
     catch (InputMismatchException e1){
         System.err.println("Numeros deve ser inteiros ");
         s.nextLine();
     }
     catch (ArithmeticException e2){
         System.err.println("Divisor deve ser diferente de ZERO");
         s.nextLine();
     }
     finally {
         System.out.println("Finally foi execultado");
     }

 } while (continua);



    }


}
