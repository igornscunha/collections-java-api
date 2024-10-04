package main.java.set.Pesquisa;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao, boolean concluido) {
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return descricao + ": "
                + (concluido == true ? "Concluida" : "Pendente");
    }
}
