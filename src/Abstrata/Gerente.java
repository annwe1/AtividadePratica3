package Abstrata;
import Interface.Trabalhavel;

public class Gerente extends Funcionario implements Trabalhavel{

    private float bonusAnual;
    private String equipeGerencia;

    public Gerente() {

    }

    public Gerente(String nome, int matricula, float bonusAnual, String equipeGerencia) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipeGerencia = equipeGerencia;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEquipeGerencia() {
        return equipeGerencia;
    }

    public void setEquipeGerencia(String equipeGerencia) {
        this.equipeGerencia = equipeGerencia;
    }

    @Override
    public float calcularSalario() {
        return 5000 + bonusAnual;
    }

    @Override
    public String trabalhar() {
        return "Gerente " + getNome() + " está trabalhando com sua equipe " + equipeGerencia + "."; 
    }

    @Override
    public String relatarProgresso() {
        return "Gerente " + getNome() + " está relatando seu pregresso."; 
    }
    
}
