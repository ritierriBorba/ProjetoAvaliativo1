import java.time.LocalDate;
import java.util.*;

public class Aluno extends Pessoa {

    private String condicaoMatricula;
    private Double nota;
    private Integer atendimentosPedagogicos;

    private static List<Aluno> alunos = new ArrayList<Aluno>();

    //CONSTRUTOR
    public Aluno(String nome, String telefone, Date dataNascimento, String cpf, String condicaoMatricula,
                 Double nota) {

        super(nome, telefone, dataNascimento, cpf);
        this.condicaoMatricula = condicaoMatricula;
        this.nota = nota;
        this.atendimentosPedagogicos = 0;
    }

    //GETTERS & SETTERS
    public String getCondicaoMatricula() {

        return condicaoMatricula;
    }

    public void setCondicaoMatricula(String condicaoMatricula) {

        this.condicaoMatricula = condicaoMatricula;
    }

    public Double getNota() {

        return nota;
    }

    public void setNota(Double nota) {

        this.nota = nota;
    }

    public Integer getAtendimentosPedagogicos() {

        return atendimentosPedagogicos;
    }

    public void setAtendimentosPedagogicos(Integer atendimentosPedagogicos) {
        this.atendimentosPedagogicos = atendimentosPedagogicos;
    }

    public static List<Aluno> getAlunos() {
        return alunos;
    }


    //METODOS
//    public static void novoAluno() {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Digite o nome do aluno: ");
//        String nome = input.nextLine();
//
//        System.out.println("Digite o telefone do aluno: ");
//        Integer telefone = input.nextInt();
//
//        System.out.println("Digite a data de nascimento do aluno: ");
//        Pattern dataNascimento = input.delimiter();
//    }

    public static void cadastrarAluno() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = input.nextLine();
        String telefone = Pessoa.telefone();
        Date dataNascimento = Pessoa.dataNascimento;
        String cpf = Pessoa.cpf();
        Double nota = nota();
        String condicaoMatricula = condicaoMatricula();

        Aluno aluno = new Aluno(nome, telefone, dataNascimento, cpf, condicaoMatricula, nota);

        alunos.add(aluno);
        Pessoa.adicionarPessoa(aluno);
    }

    private static Double nota() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota do aluno (entre 0 e 10)");
        Double nota;
        nota = input.nextDouble();
        return nota;
    }

//    private static String telefone() {
//        return telefone();
//    }


    public static void listarAlunos() {

        Pessoa.listarAlunos();
    }

    public static void listarAlunosSituacaoMatricula() {
        ArrayList<Aluno> alunoSelecionado = new ArrayList<Aluno>();

        Scanner s = new Scanner(System.in);
        System.out.println("Qual a situação de matricula que deseja filtrar?");
        String condicaoMatricula = condicaoMatricula();

        for (int i = 0; i < alunos.size(); i++) {
            if (condicaoMatricula.equalsIgnoreCase(alunos.get(i).getCondicaoMatricula())) {
                alunoSelecionado.add(alunos.get(i));
            }
        }

        for (int i = 0; i < alunoSelecionado.size(); i++) {
            System.out.println(alunoSelecionado.get(i).toString());
        }
    }

    private static String condicaoMatricula() {
        return condicaoMatricula();
    }


    public static void listarAlunosNumeroAtendimento() {
        alunos.sort(new Comparator<Aluno>() {

            @Override
            public int compare(Aluno o1, Aluno o2) {
                return o1.getAtendimentosPedagogicos().compareTo(o2.getAtendimentosPedagogicos());
            }

        }.reversed());

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + alunos.get(i).toString());
        }
    }

    public static void alterarSituacaoAluno() {
        listarAlunos();
        System.out.println("Deseja mudar a Situação de matricula de qual aluno?");
        System.out.println("(Deve ser selecionado através da posição na listagem!)");

        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());

        n = n - 1;

        alunos.get(n).setCondicaoMatricula(condicaoMatricula());

    }

    public void adicionaAtendimento() {
        this.atendimentosPedagogicos += 1;
        this.setCondicaoMatricula("Em Atendimento Pedagogico");
    }

    @Override
    public String toString() {
        return "Aluno{" + this.getNome() +
                "condicaoMatricula='" + condicaoMatricula + '\'' + ", CPF: " + this.getCpf() +
                ", nota=" + this.nota() + ", id: " + this.getId() +
                ", atendimentosPedagogicos=" + atendimentosPedagogicos +
                '}';
    }
}





