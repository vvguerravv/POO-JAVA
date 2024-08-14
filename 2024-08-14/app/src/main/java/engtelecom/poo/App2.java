package engtelecom.poo;

import java.nio.file.Files;
import java.nio.file.Path;

public class App2 {

    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);

        Path path = Path.of(currentDir+"/arq.txt");

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
