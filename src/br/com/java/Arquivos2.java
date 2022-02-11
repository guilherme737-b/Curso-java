package br.com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivos2 {

    public static void main(String[] args) throws IOException {



        Path path = Paths.get("c:/CursoJava/file/texto.txt");
        Charset utf8 = StandardCharsets.UTF_8;

        /* Escrita de arquivos */
        try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {  // lemnbre das bibliotecas, de qual puxa de qual, e erdam as funcoes. Lembrando se for muito grande o que eu quero colocar, chamaar flush de tempos em tempos,  podemos considerar que é uma ligação, ou seja vamos ligar e escrever o tempo que for necessario, e depois desligamos
        w.write("texto\n");
        w.write("Outro Texto\n");
        w.write("Outro Texto\n");
    } catch (IOException e) {
        e.printStackTrace();
        }

        /* Leitura */

        try (BufferedReader reader = Files.newBufferedReader(path,utf8 )){
            String line = null;
            while ((line = reader.readLine()) != null ) {  // retorna as linhas desse arquivo, linha por linha, ou seja toda vez que chamar ele executa uma linha
                System.out.println(line);
                 }
            } catch(IOException e) {
                  e.printStackTrace();


            }








    }
}
