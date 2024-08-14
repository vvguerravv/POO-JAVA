package engtelecom.poo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class App5 {

    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        Path inicial = Path.of(currentDir);

        try(Stream<Path> walk = Files.walk(inicial)){
            walk.sorted().forEach(arq -> {
                int profundidade = inicial.relativize(arq).getNameCount();
                String sufixo = (Files.isDirectory(arq) ? " (D) " : "" );
                System.out.println(" ".repeat(profundidade) + arq.getFileName() + sufixo);
            });
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
