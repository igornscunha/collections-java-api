package main.java.map.Pesquisa;

import java.util.*;

public class LivrariaOnline {
    //atributos
    private Map<String, Livro> livrosOnline;

    public LivrariaOnline() {
        this.livrosOnline = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrosOnline.put(link, new Livro(titulo, autor, preco));
    }

    public Livro removerLivro(String titulo){
        if(!livrosOnline.isEmpty()){
            Set<String> codLivros = livrosOnline.keySet();
            for(String cod : codLivros){
                if(livrosOnline.get(cod).getTitulo().equalsIgnoreCase(titulo)){
                    return livrosOnline.remove(cod);
                }
            }
        }
        return null;
    }

    public void exibirLivros(){
        for(String cod : livrosOnline.keySet()){
            System.out.println(cod + ": " + livrosOnline.get(cod));
        }
    }

    public List<Livro> exibirLivrosOrdenadosPorPreco(){
        List<Livro> listLivrosOnline = new ArrayList<>(livrosOnline.values());
        Collections.sort(listLivrosOnline, new OrdenarLivrosPorPreco());
        return listLivrosOnline;
    }

    public List<String> pesquisarLivrosPorAutor(String autor){
        List<String> livroAutor = new ArrayList<>();
        if(!livrosOnline.isEmpty()){
            for(Livro l : livrosOnline.values()){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroAutor.add(l.getTitulo());
                }
            }
        }
        return new ArrayList<>();
    }

    public Livro obterLivroMaisCaro(){
        List<Livro> listLivrosOnline = new ArrayList<>(livrosOnline.values());
        Collections.sort(listLivrosOnline, new OrdenarLivrosPorPreco());
        return listLivrosOnline.get(listLivrosOnline.size() - 1);
    }

    public Livro exibirLivroMaisBarato(){
        List<Livro> listLivrosOnline = new ArrayList<>(livrosOnline.values());
        Collections.sort(listLivrosOnline, new OrdenarLivrosPorPreco());
        return listLivrosOnline.get(0);
    }

    public static void main(String[] args) {
        LivrariaOnline livros = new LivrariaOnline();

        livros.exibirLivros();
        livros.adicionarLivro("amz/livro_1", "Livro 1", "Autor 1", 14.00d);
        livros.adicionarLivro("amz/livro_2", "Livro 2", "Autor 1", 8.00d);
        livros.adicionarLivro("amz/livro_3", "Livro 1", "Autor 2", 27.00d);
        livros.adicionarLivro("amz/livro_4", "Livro 1", "Autor 1", 21.00d);
        livros.adicionarLivro("amz/livro_5", "Livro 2", "Autor 3", 5.00d);
        livros.exibirLivros();
        System.out.println("Livros ordenados por preço: " + livros.exibirLivrosOrdenadosPorPreco());
        System.out.println("Livro de maior valor: " + livros.obterLivroMaisCaro());
        System.out.println("Livro de menor valor: " + livros.exibirLivroMaisBarato());

    }
}
