import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Pedagogo extends Pessoa{

    //ATRIBUTOS
    private Integer atendimentosPedagogicosRealizados;


    //CONSTRUTOR
    public Pedagogo(String nome, String telefone, Date dataNascimento, String cpf, Integer atendimentosPedagogicosRealizados) {
        super(nome, telefone, dataNascimento, cpf);

        this.atendimentosPedagogicosRealizados = atendimentosPedagogicosRealizados;
    }



    //GETTERS & SETTERS
    public void setAtendimentosPedagogicosRealizados(Integer atendimentosPedagogicosRealizados) {
        this.atendimentosPedagogicosRealizados = atendimentosPedagogicosRealizados;
    }

    public Integer getAtendimentosPedagogicosRealizados() {

        return atendimentosPedagogicosRealizados;
    }


    //  METODOS
    public static void cadastrarPedagogo(){
        //TODO: PENDENTE
    }
    public static void realizarAtendimento(){
        //TODO: PENDENTE
    }
    public static void listarPedagogos(){
        Pessoa.listarPedagogos();
    }
    public static void atendimentoRealizado (){
        //TODO: PENDENTE
    }





}
