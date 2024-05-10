package Abstrata;

import Interface.Trabalhavel;

public class Desenvolvedor extends Funcionario implements Trabalhavel {
    
    private String dominio;

    public Desenvolvedor() {

    }

    public Desenvolvedor(String nome, int matricula, String dominio) {
        super(nome, matricula);
        this.dominio = dominio;
    }

    public String getDominio() {
            return dominio;
        }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    @Override
    public float calcularSalario() {
        return 4000;
    }

    @Override
    public String trabalhar() {
       return "Dev " + getNome() + " está desenvolvendo o sistema com " + dominio + "."; 
    }

    @Override
    public String relatarProgresso() {
        return "Dev " + getNome() + " está relatando seu progresso.";
    }

}
