/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package engtelecom.poo;

public class App {

    public static void main(String[] args) {

        Horario h = new Horario(0,4,34);

        System.out.println(h.toString());
        System.out.println(h.printHour());
        System.out.println(h.seconds());
        Horario h2 = new Horario(1,4,34);
        System.out.println(h.diference(h2));
    }
}

