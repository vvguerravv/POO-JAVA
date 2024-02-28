import java.util.Scanner;

public class OlaMundo {

    public static void main(String args[]){
        
        System.out.println("Olá mundo");

        //Tipos de variáveis
        int i = 10;
        double d = 2.2; // Indicado usar sempre double por conta de sua dupla precisão
        String s = "Ola Mundo";

        int ano = 2024;
        String nome = "Victor";

        System.out.println("Nome: " + nome + "\nAno: " + ano); // Em JAVA, quando é-se utilizado o "Println", deve-se concatenar as informações a serem impressas 

        int a = 10;
        int b = 20;
        int maior = a;

        if(a > b){
            System.out.println("Maior: " + a);
            maior = a;
        } else if( b > a){
            System.out.println("Maior: " + b);
            maior = b;
        } else{
            System.out.println("Os valores são iguais");
        }
        
        for(int j = a ; j < b;j++){
            System.out.println(j);
        }

        Scanner teclado = new Scanner(System.in); // Para utilizar o Scanner é necessário importar a biblioteca Scanner (import java.util.Scanner;). O Scanner é utilizado para ler uma string, etc do teclado, arquivo, etc.
        
        System.out.print("Entre com seu nome: ");
        String nome2 = teclado.nextLine();
        System.out.println("Bom dia " + nome2);

         
    }
}