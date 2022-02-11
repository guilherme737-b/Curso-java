package br.com.java;

import br.com.cursoOO.Conta;

import java.io.*;
import java.util.Arrays;

public class Serializa {

    public static void main(String[] args) throws Exception {

        Conta conta1 = new Conta("XTI", 113_2231_412.333);
        Conta conta2 = new Conta("Gui", 999_23_2231_412.133);



        /* Escrita do Objeto */
        FileOutputStream fos = new FileOutputStream("c:/CursoJava/file/objeto.ser"); // FileOutputStreammanupulação de arquivos em bites,
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(conta1);
        oos.writeObject(conta2);
        oos.close();

        /* Leitura do objeto */
        FileInputStream fis = new FileInputStream("c:/CursoJava/file/objeto.ser");
        ObjectInputStream ois = new ObjectInputStream(fis); // Para ler objetos serializaveis dentro
        Conta c1 = (Conta)  ois.readObject(); // realiza a leitura, ou Objeto vai retornar tipo de Array de Strings, basta validar logo a cima
        Conta c2 = (Conta)  ois.readObject();
        ois.close();

        c1.exibeSaldo(); // Apenas usando to string vai ler o arquivo sem ser da forma bites
        c2.exibeSaldo();



    }

}
