package engtelecom.poo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {

        Path path = Path.of(args[0]);

        System.out.println(path);

        if(Files.exists(path)) {
            System.out.println(String.format("Arquivo: %s ", path.toAbsolutePath()));
            System.out.println(String.format("Regular: %s ", Files.isRegularFile(path)));
            System.out.println(String.format("Diretório: %s ", Files.isDirectory(path)));
            System.out.println(String.format("Permissão de leitura: %s ", Files.isReadable(path)));
            System.out.println(String.format("Permissão de escrita: %s ", Files.isWritable(path)));
        } else{
            System.out.println("Arquivo não encontrado!");
        }
    }

}
