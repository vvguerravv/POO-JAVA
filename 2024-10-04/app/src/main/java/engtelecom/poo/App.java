/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

//Na classe APP deve-se ter um banco de dados de autores e um banco de dados de Livros

public class App {

    private ArrayList<Autor> autores;
    private ArrayList<Livro> livros ;

    public App(){
        this.autores = new ArrayList<>();
        this.livros = new ArrayList<>();
    }

    public boolean addAutor(Autor autor){
        return this.autores.add(autor);
    }

    public boolean addLivro(String isbn,String titulo,Autor[] autors) {

        ArrayList<Autor> aux = new ArrayList<>(Arrays.asList(autors));

        return this.livros.add(new Livro(isbn,titulo,aux));

    }

    public static void main(String[] args) {

        App app = new App();

        app.addAutor(new Autor("Juca","BRA",LocalDate.of(2000,1,8)));
        app.addLivro("123","A história de Juca", new Autor[]{app.autores.getFirst()});








//        ArrayList<Autor> autores = new ArrayList<>();
//        Autor Guerra = new Autor("Guerra","Brasil", LocalDate.of(2005,12,8));
//        Autor Victor = new Autor("Victor","Brasil", LocalDate.of(2005,12,8));
//        autores.add(Guerra);
//        autores.add(Victor);
//        Livro novo = new Livro( "978-8580572261","A culpa é das estrelas",autores);
//
//        System.out.println(novo);
//
//        ArrayList<Autor> autores2 = new ArrayList<>();
//        Autor Juca = new Autor("Juca","IFSC",LocalDate.of(1996,8,5));
//        autores2.add(Guerra);
//        autores2.add(Juca);
//        Livro novo2 = new Livro( "9781-8580572261","A vida de juca",autores2);
//        System.out.println(novo2);


    }
}
