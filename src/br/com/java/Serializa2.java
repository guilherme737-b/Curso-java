package br.com.java;

import br.com.cursoOO.Conta;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Serializa2 {

      public void armazenarContas(ArrayList<Conta> contas) throws IOException {
         Path path = Paths.get("c:/CursoJava/file/contas.txt");
         Charset utf8 = StandardCharsets.UTF_8;
        try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
            for (Conta conta : contas){
                writer.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
            }
        }
    }

    public static void main(String[] args) throws IOException {

        ArrayList<Conta> constas = new ArrayList<>();
        constas.add(new Conta("Ricardo", 100000.00));
        constas.add(new Conta("Lawrence", 1090000.00));
        constas.add(new Conta("Guilherme", 10212000.00));
        constas.add(new Conta("Pedro", 412000.00));

        Serializa2 operacao = new Serializa2();
        operacao.armazenarContas(constas);

    }
}
