package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        listaItem.removeIf(i -> i.getNome().equalsIgnoreCase(nome));
    }

    public double calculaValorTotal() {
        double valorTotal = 0.0;
        for(Item i : listaItem){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
//        System.out.println(listaItem);
        for(Item i : listaItem){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Maçã", 2.49, 3);
        carrinho.adicionarItem("Pera", 1.89, 1);
        carrinho.adicionarItem("Pitaya", 4.65, 4);

        carrinho.exibirItens();
        System.out.printf("Valor total do carrinho: %.2f\n", carrinho.calculaValorTotal());
        carrinho.removerItem("Pera");
        carrinho.exibirItens();


    }
}
