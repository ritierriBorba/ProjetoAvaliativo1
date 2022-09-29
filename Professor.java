import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Professor extends Pessoa{

   private String formacaoAcademiaca;
   private String experiencia;
   private String estado;

    //CONTRUTOR
    public Professor(String nome, String telefone, Date dataNascimento, String cpf, String formacaoAcademiaca,
                     String experiencia, String estado) {
        super(nome, telefone, dataNascimento, cpf);
        this.formacaoAcademiaca = formacaoAcademiaca;
        this.experiencia = experiencia;
        this.estado = estado;

    }

    //GETTERS & SETTERS
    public String getFormacaoAcademiaca() {

        return formacaoAcademiaca;
    }

    public void setFormacaoAcademiaca(String formacaoAcademiaca) {

        this.formacaoAcademiaca = formacaoAcademiaca;
    }

    public String getExperiencia() {

        return experiencia;
    }

    public void setExperiencia(String experiencia) {

        this.experiencia = experiencia;
    }

    public String getEstado() {

        return estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }


    //METODOS
    public static void cadastrarProfessor(){
        //TODO: pendente
    }

    public static void listarProfessores(){
        Pessoa.listarProfessores();
    }

    public static void experiencia(){
        //TODO pendente
    }


}
