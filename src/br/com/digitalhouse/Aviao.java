package br.com.digitalhouse;

import java.sql.Time;

public class Aviao implements Voador {

    //Attributes
    private Double horasDeVoo;

    //Constructors
    public Aviao(Double horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    public Aviao() {
    }

    //Getters & Setters
    public Double getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(Double horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    //Methods
    @Override
    public void voar() {
        this.horasDeVoo += 13.00d;
        System.out.println("Voando como um aviao...");
    }

}
