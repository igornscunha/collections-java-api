package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaInteiros;

    public SomaNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public int calculaSoma(){
        int resultadoSoma = 0;
        for(int num : listaInteiros){
            resultadoSoma += num;
        }
        return resultadoSoma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for(int num : listaInteiros){
            if(num > maiorNumero) {
                maiorNumero = num;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 1000;
        for(int num : listaInteiros){
            if(num < menorNumero) {
                menorNumero = num;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(listaInteiros);
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(14);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(22);
        numeros.adicionarNumero(10);

        System.out.println(numeros.calculaSoma());
        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());
        numeros.exibirNumeros();


    }

}
