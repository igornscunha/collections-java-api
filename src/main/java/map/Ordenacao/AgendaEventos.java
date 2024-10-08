package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> dateSet = eventosMap.keySet();
//        Collection<Evento> values = eventosMap.values();
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: " + entry.getValue()
                                    + " acontecera na data " + entry.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 25), "Evento 1",  "Feliz Natal!!!");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 23), "Evento 2",  "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.NOVEMBER, 4), "Evento 3",  "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 9), "Evento 4",  "Feliz Aniversario!!!");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
