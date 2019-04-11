package br.com.digitalhouse;

public class Main {

    public static void main(String[] args) {

        Pato pato = new Pato(30);
        Aviao aviao = new Aviao(54.00);
        SuperHomem superHomem = new SuperHomem(987653);

        TorreDeControle torreDeControle = new TorreDeControle();

        torreDeControle.adicionarVoador(pato);
        torreDeControle.adicionarVoador(aviao);
        torreDeControle.adicionarVoador(superHomem);

        torreDeControle.voemTodos();

    }

}
