package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> inteirosList;

    public OrdenacaoNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        inteirosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(inteirosList);
        if(!inteirosList.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(inteirosList);
        if(!inteirosList.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        }else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public  void exibirNumeros(){
        if(!inteirosList.isEmpty()){
            System.out.println(inteirosList);
        }else{
            System.out.println("A lista esta vazia!!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(14);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}
