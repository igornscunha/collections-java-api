package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pessoa 1", 12345678);
        agendaContatos.adicionarContato("Pessoa 1", 34567889);
        agendaContatos.adicionarContato("Pessoa 2", 11111111);
        agendaContatos.adicionarContato("Pessoa 3", 67890123);
        agendaContatos.adicionarContato("Pessoa 4", 11111111);
        agendaContatos.adicionarContato("Pessoa 1", 44444444);

        agendaContatos.exibirContatos();
        System.out.println("Número: " + agendaContatos.pesquisaPorNome("Pessoa 1"));
        agendaContatos.removerContato("Pessoa 1");
        System.out.println("Número: " + agendaContatos.pesquisaPorNome("Pessoa 1"));
        agendaContatos.exibirContatos();
    }
}
