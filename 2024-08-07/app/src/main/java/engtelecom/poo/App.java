package engtelecom.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws InterruptedException {
        int a,b;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entre com o primeiro número: ");
            a = scanner.nextInt();
            System.out.print("Ente com o segundo número: ");
            b = scanner.nextInt();

            double resultado = (double) a / b;

            System.out.println(a + " dividido por " + b + " = " + resultado);

        }catch (InputMismatchException e) {
            System.out.println(e.getLocalizedMessage());
            System.err.println("Só é permitido números inteiros");
            scanner.nextLine();
        } catch (ArithmeticException e) {
            System.err.println("Não é possível realizar divisão por 0");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Comportamento inesperado");
        }

        System.out.println("Fim do programa");

        Thread.sleep(1000);
    }

}
