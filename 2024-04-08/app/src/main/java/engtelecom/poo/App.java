/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import com.google.common.escape.Escaper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class App {

    private  HashMap<String,Aluno> bancoDeDados;
    private static Scanner teclado = new Scanner(System.in);
    public App(){
        this.bancoDeDados = new HashMap<>();
    }

    public int menu(){
        System.out.println("..:SIGAA:..");
        System.out.println("Digite o que deseja fazer no momento:\n1 - Cadastrar\n2 - Atualizar\n3-Remover\n4-Listar dados de um aluno\n5-Listar todos os dados de todos os alunos\n6-Sair");

        return teclado.nextInt();
    }

    public boolean cadastrar(){
        teclado.nextLine();
        String nome;
        String matricula;
        String curso;
        LocalDate dataNascimento;
        String email;
        String cpf;

        System.out.print("Digite o nome do aluno: ");
        nome = teclado.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        matricula = teclado.nextLine();
        if(this.bancoDeDados.containsKey(matricula)){
            while (this.bancoDeDados.containsKey(matricula)){
                System.out.println("Está matrícula já está no sistema. Tente novamente a seguir: ");
                matricula = teclado.nextLine();
            }
        }

        System.out.print("Digite o curso do aluno: ");
        curso = teclado.nextLine();

        System.out.print("Digite a data de nascimento do aluno: ");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = teclado.nextLine();
        dataNascimento = LocalDate.parse(data,df);

        System.out.print("Digite o email do aluno: ");
        email = teclado.nextLine();

        System.out.print("Digite o CPF do aluno: ");
        cpf = teclado.nextLine();

        Aluno novo = new Aluno(nome,matricula,curso,dataNascimento,email,cpf);



        if(bancoDeDados.put(matricula,novo) == null){
            return true;
        }


        return false;
    }

    public void atualizar(){
        teclado.nextLine();
        System.out.print("Digite a matrícula do aluno que você gostaria de alterar: ");
        String matricula =  teclado.nextLine();

        if(!bancoDeDados.containsKey(matricula)){
            while (!bancoDeDados.containsKey(matricula)){
                System.out.print("Digite uma matrícula válida:");
                matricula =  teclado.nextLine();
            }
        }

        System.out.println("Digite o que você gostaria de alterar no cadastro deste aluno e digite 0 para confirmar as alterações: ");

        int escolha;
        do{
            System.out.println("1 - Nome\n2 - Situação\n3 - Data de Nascimento\n4 - Email\n5 - CPF\n0 - Confirmar alterações");
            escolha = teclado.nextInt();
            switch (escolha){
                case 1 :
                    System.out.print("Digite o nome do aluno: ");
                    teclado.nextLine();
                    String novoNome = teclado.nextLine();
                    bancoDeDados.get(matricula).setNome(novoNome);
                    break;
                case 2:
                    System.out.print("Digite qual a situação do aluno ( Ativo, cancelado, trancado): ");
                    teclado.nextLine();
                    String novaSituacao = teclado.nextLine();
                    bancoDeDados.get(matricula).setSituacao(novaSituacao);
                    break;
                case 3:
                    System.out.print("Digite a data de nascimento do aluno: ");
                    teclado.nextLine();
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String novaData = teclado.nextLine();
                    bancoDeDados.get(matricula).setDataNascimento(LocalDate.parse(novaData,df));
                    break;
                case 4:
                    System.out.println("Digite qual o email do aluno: ");
                    teclado.nextLine();
                    String novaEmail = teclado.nextLine();
                    bancoDeDados.get(matricula).setEmail(novaEmail);
                    break;
                case 5:
                    System.out.println("Digite o cpf do aluno: ");
                    teclado.nextLine();
                    String novaCpf = teclado.nextLine();
                    bancoDeDados.get(matricula).setCpf(novaCpf);
                    break;
            }

        } while (escolha != 0);
    }

    public void remover(){
        teclado.nextLine();
        System.out.print("Digite a matrícula do aluno que você gostaria de remover: ");
        String matricula =  teclado.nextLine();
        if(!bancoDeDados.containsKey(matricula)){
            while(!bancoDeDados.containsKey(matricula)){
                System.out.print("Digite uma matrícula válida: ");
                matricula =  teclado.nextLine();
            }
        }
        bancoDeDados.remove(matricula);
    }

    public void listarUmAluno(){
        teclado.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        String matricula =  teclado.nextLine();
        System.out.println(bancoDeDados.get(matricula));
    }

    public void listarTodosAlunos(){
        if(!bancoDeDados.isEmpty()){
            bancoDeDados.forEach((key,value) -> System.out.println(key + ":" + value));
        }else {
            System.out.println("Nenhum aluno encontrado");
        }
    }



    public static void main(String[] args) {
        App app = new App();
        int opcao;

        do {
            opcao = app.menu();

            switch (opcao) {
                case 1 -> {
                    if(!app.cadastrar()){
                        System.out.println("Não foi possível cadsatrar o aluno!\n");
                    } else{
                        System.out.println("Aluno cadastrado com sucesso!\n");
                    }
                }
                case 2 -> app.atualizar();
                case 3 -> app.remover();
                case 4 -> app.listarUmAluno();
                case 5 -> app.listarTodosAlunos();
            }
        } while (opcao != 6);
    }
}
