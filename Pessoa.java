import java.text.SimpleDateFormat;
import java.util.*;

public class Pessoa {


    private String nome;
    private String telefone;
    static Date dataNascimento;
    private String cpf;
    private String id;

    private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
    private static List<Pessoa> funcionarios = new ArrayList<Pessoa>();


    //Construtor
    public Pessoa(String nome, String telefone, Date dataNascimento, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.id = geraID();

    }


    private String geraID() {
        id = UUID.randomUUID().toString();
        return id;
    }

    // Getters && Setters
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public Date getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getId() {

        return id;
    }



    //METODOS
    public static void listarPessoas() {
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + pessoas.get(i).toString());
        }
    }

    public static void listarFuncionarios() {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("[" + (i + 1) + funcionarios.get(i).toString());
        }
    }

    public static void listarProfessores() {
        //TODO: desenvolver depois
    }

    public static void listarPedagogos() {
        //TODO: desenvolver depois
    }

    public static void listarAlunos() {
        //TODO: desenvolver depois
    }

    public static void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public static void adicionarFuncionario(Pessoa pessoa) {
        funcionarios.add(pessoa);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.getNome() + '\'' +
                ", dataNascimento=" + this.getDataNascimento() +
                ", cpf='" + this.getCpf() + '\'' +
                ", id='" + this.getId() + '\'' +
                '}';
    }

    public static Date dataNascimento() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        String dataNascimento = input.nextLine();
        return dataNascimento();
    }

    public static String telefone() {
        String telefone = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do telefone");
        telefone = input.nextLine();
        return telefone;
    }



    public static String cpf(){
        Scanner input = new Scanner(System.in);
        String cpf = "";
        System.out.println("Digite o numero do CPF");
        cpf = input.next();
        return cpf();
    }



}

