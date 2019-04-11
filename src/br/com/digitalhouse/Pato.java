package br.com.digitalhouse;

public class Pato implements Voador {

    //Attributes
    private Integer energia;

    //Constructors
    public Pato(Integer energia) {
        this.energia = energia;
    }

    public Pato() {
    }

    //Getters & Setters
    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    //Methods
    @Override
    public void voar() {
        this.energia -= 5;
        System.out.println("Estou voando comom um pato...");
    }

}
