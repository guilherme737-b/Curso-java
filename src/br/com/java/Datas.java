package br.com.java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datas {

    public static void main(String[] args) {

     /* 01 de jan 1979 */
     System.out.println(System.currentTimeMillis()); // desde de 1970 até a data atual

     Date agora = new Date(); // data atual de seu sistema
     System.out.println(agora);

     Date data = new Date(291_2231_411238L);
     System.out.println(data);

     /* Metodos */
        data.getTime(); // retorna o tempo em mile segundos
        data.setTime(291_2231_411238L);
        System.out.println(data.compareTo(agora)); // se a data atual for menor do que a que queremos comparar, o valor vai me retornar -1, se forem igual 0 se for maior +1

    // manipular data

        Calendar c = Calendar.getInstance(); // não podemos usar new para classe Calendar, devemos usar o metodo statico getInstance, que ele vai conseguir me retornar o metodo
        c.set(1989, Calendar.FEBRUARY, 12 ); // pegar o dia 12 de fevereiro de 1090, usamos desta forma.
        System.out.println(c.getTime()); // retorna o objeto de tipo DATE

        System.out.println(c.get(Calendar.YEAR)); // retorna o tipo ano
        System.out.println(c.get(Calendar.MONTH)); // retorna o tipo mes, lembrando que ele vai retornar 1, mais janeiro é considerado 0 (ZERO)
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // Retorna o dia do mes


        /* E para alterar usamos o metodo SET */

        c.set(Calendar.YEAR, 1972); // Altera o ano usando o metodo set
        c.set(Calendar.MONTH, Calendar.MAY); // Altera o ano usando o metodo set
        c.set(Calendar.DAY_OF_MONTH, 25); // Altera o ano usando o metodo set
        c.clear(Calendar.MINUTE); // Como limpar algum campo desejado, neste caso ele vai zerar o campo
        c.clear(Calendar.SECOND); // Como limpar algum campo desejado]
        c.add(Calendar.DAY_OF_MONTH, 1); // acresenta um dia no mes, antes era dia 25, e passou a ser dia 26, se acrescetar dia que utrapasse aquele mes, ele continua contando normalmete com o mes seguinte usando roll em vez de add, ele continuaria no mesmo mes sem pular.
        c.add(Calendar.YEAR, 1); // acresenta um ano, antes era 1972, e passou a ser 1973
        System.out.println(c.getTime());

        /*  Vamos fazer uma saudação para representar a hora  */

        Calendar c1 = Calendar.getInstance();
        int hora =  c1.get(Calendar.HOUR_OF_DAY); // retorna int
        System.out.println(hora);
        if (hora <= 12) {
            System.out.println("Bom dia");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa noite");
        }















    }
}
