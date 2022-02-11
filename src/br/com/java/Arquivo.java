package br.com.java;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("c:/CursoJava/file/texto.txt"); // caso tiver outro sistema operacional seguir o caminho do proprio sistema
        System.out.println(path.toAbsolutePath()); // retorna o caminho absoluto
        System.out.println(path.getParent()); // retorna o pai do arquivo, ou seja, o diretorio onde esta

        /* Criação de diretorios  */

        Files.createDirectories(path.getParent());

        /* Escrever e ler arquivos */
        byte[] bytes = "Meu Texto".getBytes();
        Files.write(path, bytes); // cria, limpa, escreve textos


        byte[] retorno = Files.readAllBytes(path); // para ler o arquivo de tirotorio path (C/CursoJava/Files/txt)
        System.out.println(retorno); // desta forma vai ler em formato de Array, impossibilitando o entendimento
        System.out.println(new String(retorno)); // desta forma para realmente ler o arquivo em formato String




    }


}
