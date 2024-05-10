package Abstrata;
import Interface.Trabalhavel;

public class Estagiario extends Funcionario implements Trabalhavel {
    
    private float horasTrabalho;
    private String supervisor;

    public Estagiario() {

    }

    public Estagiario(String nome, int matricula, float horasTrabalho, String supervisor) {
        super(nome, matricula);
        this.horasTrabalho = horasTrabalho;
        this.supervisor = supervisor;
    }

    public float getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(float horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public float calcularSalario() {
        return 1000;
    }

    @Override
    public String trabalhar() {
        return "Estagiário " + getNome() + " está fazendo café para " + supervisor + ".";
    }

    @Override
    public String relatarProgresso() {
        return "Estagiário " + getNome() + " está relatando seu progresso.";
    }
    
}
