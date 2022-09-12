package br.com.alura;

import java.util.Collections;
import java.util.Comparator;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso geografia = new Curso("Geografia", "Paulo Almeida");
		
		Aula aula = new Aula("Aula - 1", 10);
		Aula aula2 = new Aula("Aula - 2", 30);
		Aula aula3 = new Aula("Aula - 3", 15);
		Aula aula4 = new Aula("Capitais do Brasil", 5);
		
		geografia.addAula(aula);
		geografia.addAula(aula2);
		geografia.addAula(aula3);
		geografia.addAula(aula4);
		
		//Utiliza o m�todo do Comparator para ordenar a lista
		geografia.getAulas().sort(Comparator.comparing(Aula::getTempo));
		
		//Ordena utilizando o Collections, cujo crit�rio de ordenamento � definido pela implementa��o do
		//m�todo CompareTo();
		Collections.sort(geografia.getAulas());
		
		for(Aula aulaSelected : geografia.getAulas()) {
			System.out.println(aulaSelected);	
		}
		
		//Tempo Total
		System.out.println(geografia.getTempoTotal());
		System.out.println(geografia);
		
		//Lacra a lista, n�o permitindo que a mesma seja modificada, fica dispon�vel
		//Apenas para leitura
		geografia.setAulas(Collections.unmodifiableList(geografia.getAulas()));
		
		geografia.addAula(aula4);
		
		
	}

}

