package br.com.digitalhouse;

public class SuperHomem implements Voador {

    //Attributes
    private Integer experiencia;

    //Constructors
    public SuperHomem(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public SuperHomem() {
    }

    //Getters & Setters
    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    //Methods
    @Override
    public void voar() {
        this.experiencia += 3;
        System.out.println("Estou voando como um campeão...");
    }

}
