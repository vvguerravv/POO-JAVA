package engtelecom.poo;

import java.util.Scanner;
import java.util.Stack;

public class App2 {

    public static void main(String[] args) {


        Stack<Integer> num = new Stack<>();

        int i = 0;

        System.out.println("Entre com n números interiros, e quando quiser parar de digitar, entre com o número \"999\":");
        Scanner teclado = new Scanner(System.in);
        i = teclado.nextInt();
        while (i != 999) {
            num.add(i);
            i = teclado.nextInt();
        }

        while (!num.empty()){
            System.out.println(num.pop());
        }


    }

}
