package br.com.java;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("c:/CursoJava/file/texto.txt");
        System.out.println(Files.exists(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isRegularFile(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.size(path));
        System.out.println(Files.getLastModifiedTime(path));
        System.out.println(Files.probeContentType(path)); // validar o tipo de arquivo (mp3, imag)

         /* Delete
      Files.delete(path);
        Files.deleteIfExists(path); */

        /*Create */

        Path path1 = Paths.get("c:/CursoJava/file/fonte.txt");
        Files.deleteIfExists(path1);
        Files.createFile(path1);
        Files.write(path1, "Meu Texto".getBytes());

        /* Copia */

        Path copia = Paths.get("c:/CursoJava/file/testes.txt");
        Files.copy(path1, copia, StandardCopyOption.REPLACE_EXISTING); /* Para substituir  o arquivo caso exista */

        /* Move */
        Path mover = Paths.get ("c:/CursoJava/file/move/testes.txt");
        Files.createDirectories(mover.getParent());
        Files.move(copia, mover, StandardCopyOption.REPLACE_EXISTING);


    }
}
