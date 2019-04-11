package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    //Instancias
    private List<Voador> voadores = new ArrayList<>();

    //Methods
    public void voemTodos() {
        for (Voador voador : voadores){
            voador.voar();
        }
    }

    public void adicionarVoador(Voador umVoador) {
        voadores.add(umVoador);
    }
}
