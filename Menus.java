import java.util.Scanner;

public class Menus {

    public static void menuPrincipal(){

        Scanner input = new Scanner(System.in);
        boolean controlador = true;

        while (controlador == true) {
            System.out.println("Selecione a opcao desejada:");
            System.out.println("[1] Menu Alunos");
            System.out.println("[2] Menu Professores");
            System.out.println("[3] Menu Pedagogos");
            System.out.println("[4] Menu Pessoas");
            System.out.println("[5] SAIR");

            Integer inputUsuario = input.nextInt();
            System.out.println();

            switch (inputUsuario){
                case 1:
                    menuAluno();
                    break;
                case 2:
                    menuProfessor();
                    break;
                case 3:
                    menuPedagogos();
                    break;
                case 4:
                    menuPessoas();
                case 5:
                    controlador = false;
                    break;
                case default:
                    System.out.println("Comando invalido");
                    break;
            }
    }
}

    public static void menuAluno(){

        Scanner input = new Scanner(System.in);
        boolean controlador = true;

        while (controlador == true){
            System.out.println(" O que você deseja fazer?");
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Listar alunos");
            System.out.println("[3] Listar alunos de acordo com a situacao da matricula");
            System.out.println("[4] Listar alunos pelo numero de atendimentos");
            System.out.println("[5] Alterar situacao do aluno");
            System.out.println("[6] SAIR");

            String respScannerStr = input.nextLine();
            Integer respostaInput = -1;

            switch (respostaInput){
                case 1:
                    Aluno.cadastrarAluno();
                    break;
                case 2:
                    Pessoa.listarAlunos();
                    break;
                case 3:
                    Aluno.listarAlunosSituacaoMatricula();
                    break;
                case 4:
                    Aluno.listarAlunosNumeroAtendimento();
                    break;
                case 5:
                    Aluno.alterarSituacaoAluno();
                    break;
                case 6:
                    controlador = false;
                    break;
                case default:
                    System.out.println("Comando invalido");
                    break;

            }

        }
    }

    public static void menuProfessor(){

        Scanner input = new Scanner(System.in);
        boolean controlador = true;

        while (controlador == true){
            System.out.println(" O que você deseja fazer agora?");
            System.out.println("[1] Cadastrar professor");
            System.out.println("[2] Listar professores");
            System.out.println("[3] Listar professores de acordo com a area de desenvolvimento");
            System.out.println("[4] SAIR");

            Integer inputUsuario = input.nextInt();

            switch (inputUsuario){
                case 1:
                    Professor.cadastrarProfessor();
                    break;
                case 2:
                    Pessoa.listarProfessores();
                    break;
                case 3:
                    Professor.experiencia();
                    break;
                case 4:
                    controlador = false;
                    break;
                case default:
                    System.out.println("Comando invalido");
                    break;
            }

        }
    }

    public static void menuPedagogos(){

        Scanner input = new Scanner(System.in);
        boolean controlador = true;

        while (controlador == true){
            System.out.println(" O que você deseja fazer agora?");
            System.out.println("[1] Cadastrar pedagogo");
            System.out.println("[2] Listar pedagogos");
//            System.out.println("[3] Realizar atendimento");
            System.out.println("[3] Listar pedagogos por numero de atendimentos");
            System.out.println("[4] SAIR");

            Integer inputUsuario = input.nextInt();

            switch (inputUsuario){
                case 1:
                    Pedagogo.cadastrarPedagogo();
                    break;
                case 2:
                    Pessoa.listarPedagogos();
                    break;
                case 3:
                    Pedagogo.atendimentoRealizado();
                    break;
                case 4: controlador = false;
                    break;
                case default:
                    System.out.println("Comando invalido");
                    break;
            }
        }
    }

    public static void menuPessoas(){

        Scanner input = new Scanner(System.in);
        boolean controlador = true;

        while (controlador == true){

            System.out.println("O que você deseja fazer?");
            System.out.println("[1] Listar Pessoas");
            System.out.println("[2] Listar Alunos");
            System.out.println("[3] Listar Professores");
            System.out.println("[4] Listar Pedagogos");
            System.out.println("[5] Listar Funcionarios");
            System.out.println("[6] Voltar");

            Integer inputUsuario = input.nextInt();

            switch (inputUsuario){
                case 1:
                    Pessoa.listarPessoas();
                    break;
                case 2:
                    Pessoa.listarAlunos();
                    break;
                case 3:
                    Pessoa.listarProfessores();
                    break;
                case 4:
                    Pessoa.listarPedagogos();
                case 5:
                    Pessoa.listarFuncionarios();
                case 6:
                    controlador = false;
                    break;
                case default:
                    System.out.println("Comando invalido");
                    break;
            }

        }
    }

}
