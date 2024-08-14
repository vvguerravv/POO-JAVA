package engtelecom.poo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class App3 {

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        Path path = Path.of(currentDir);

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for(Path path1 : stream) {
                if(Files.isRegularFile(path1)){
                    System.out.println(path1.getFileName());
                }
            }
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }


    }

}
