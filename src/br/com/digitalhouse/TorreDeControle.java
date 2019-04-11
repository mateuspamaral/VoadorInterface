package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    //Instancias
    private List<Voador> voadores = new ArrayList<>();

    //Methods
    public void voemTodos() {
        for (int i=0;i<voadores.size();i++){
            voadores.get(i).voar();
        }
    }

    public void adicionarVoador(Voador umVoador) {
        voadores.add(umVoador);
    }
}
