package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new LinkedHashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public boolean removerTarefa(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaSet.remove(t);
                return true;
            }
        }
        return false;
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas(){
        System.out.println("Total de tarefas: " + tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
         Set<Tarefa> tarefasConcluidas = new LinkedHashSet<>();
         for(Tarefa t : tarefaSet){
             if(t.isConcluido()){
                 tarefasConcluidas.add(t);
             }
         }
         return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
         Set<Tarefa> tarefasPendentes = new LinkedHashSet<>();
         for(Tarefa t : tarefaSet){
             if(!t.isConcluido()){
                 tarefasPendentes.add(t);
             }
         }
         return tarefasPendentes;
    }

    public boolean marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(true);
                return true;
            }
        }
        return false;
    }

    public boolean marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(false);
                return true;
            }
        }
        return false;
    }

    public boolean limparListaTarefas(){
        return tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");
        listaTarefas.adicionarTarefa("Tarefa 6");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.marcarTarefaConcluida("Tarefa 6");
        listaTarefas.marcarTarefaConcluida("Tarefa 3");

        System.out.println("Tarefas concluidas" + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes" + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Tarefa 2");

        System.out.println("Tarefas concluidas" + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes" + listaTarefas.obterTarefasPendentes());

        listaTarefas.contarTarefas();

        listaTarefas.removerTarefa("Tarefa 4");

        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

    }
}
