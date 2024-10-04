package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Palavra 1");
        palavrasUnicas.adicionarPalavra("Palavra 2");
        palavrasUnicas.adicionarPalavra("Palavra 3");
        palavrasUnicas.adicionarPalavra("Palavra 3");
        palavrasUnicas.adicionarPalavra("Palavra 4");
        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("Palavra 2");
        palavrasUnicas.exibirPalavrasUnicas();

        boolean verificacaoPalavra = palavrasUnicas.verificarPalavra("Palavra 4");
        System.out.println("A palavra está no conjunto? " + verificacaoPalavra);
    }

}
