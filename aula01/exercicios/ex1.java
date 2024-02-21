import java.util.Scanner;

public class ex1 {
    
    public static void main(String args[]){

        String nome;
        int AnoNas;
        int AnoAtu;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite o ano em que você nasceu: ");
        AnoNas = teclado.nextInt();

        System.out.print("Digite o ano atual:");
        AnoAtu = teclado.nextInt();

        int idade = AnoAtu - AnoNas;

        System.out.println(nome + " possuí " + idade + " anos");
    }

}
