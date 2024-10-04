package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {
    //atributos
    private Set<Aluno> alunoSet;

    public GerenciarAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public boolean removerAluno(long matricula){
        for(Aluno a : alunoSet){
            if(a.getMatricula() == matricula){
                return alunoSet.remove(a);
            }
        }
        return false;
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new AlunosPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        gerenciarAlunos.adicionarAluno("Aluno 6", 12345, 4.5);
        gerenciarAlunos.adicionarAluno("Aluno 2", 23456, 4.8);
        gerenciarAlunos.adicionarAluno("Aluno 3", 12345, 4.0);
        gerenciarAlunos.adicionarAluno("Aluno 4", 67890, 9.0);

        System.out.println(gerenciarAlunos.exibirAlunosPorNome());
        System.out.println(gerenciarAlunos.exibirAlunosPorNota());

        gerenciarAlunos.removerAluno(23456);
        gerenciarAlunos.exibirAlunos();

    }
}
