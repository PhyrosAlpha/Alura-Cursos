package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

//Teste de desempenho entre listas
public class TestaPerformance {

    public static void main(String[] args) {

        //Collection<Integer> numeros = new ArrayList<Integer>();
    	
    	Collection<Integer> numeros = new HashSet<>();

        long inicioInsercao = System.currentTimeMillis();

        for (int i = 1; i <= 1000000; i++) {
            numeros.add(i);
        }
        
        long fimInserscao = System.currentTimeMillis();

        long inicioBusca = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long fimBusca = System.currentTimeMillis();

        long tempoDeExecucaoInsercao = fimInserscao - inicioInsercao;
        long tempoDeExecucaoBusca = fimBusca - inicioBusca;

        System.out.println("Tempo gasto na inserção: " + tempoDeExecucaoInsercao);
        System.out.println("Tempo gasto na busca: " + tempoDeExecucaoBusca);

    }

}