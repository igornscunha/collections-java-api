package main.java.map.Pesquisa;

import java.util.Comparator;
import java.util.Objects;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(getTitulo(), livro.getTitulo()) && Objects.equals(getAutor(), livro.getAutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getAutor());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + ": R$" + preco;
    }
}

class OrdenarLivrosPorPreco implements Comparator<Livro>{
    @Override
    public int compare(Livro l1, Livro l2) {
        return Double.compare(l1.getPreco(), l2.getPreco());
    }
}
