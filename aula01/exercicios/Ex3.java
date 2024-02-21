import java.util.Random;
import java.util.Scanner;

public class Ex3 {

    public static void main(String args[]){
        Random r = new Random();
        int sorteado = r.nextInt(10);
        int escolha = -1;
        int[] salva = new int[100];

        System.out.print("Entre com um número de 0 a 100: ");
        while (escolha != sorteado){
            Scanner teclado = new Scanner(System.in);
            escolha = teclado.nextInt();
            if(escolha == sorteado){
                System.out.println("Parabéns, você acertou o número!");
            } else if(salva[escolha] >= 1){
                salva[escolha]++;
                System.out.println("O número " + escolha + " já foi escolhido " + salva[escolha] + " vezes.Por favor, tente outro número!");
            } else {
                salva[escolha]++;
                System.out.println("Tente novamente!");
            }
        }
    }

}