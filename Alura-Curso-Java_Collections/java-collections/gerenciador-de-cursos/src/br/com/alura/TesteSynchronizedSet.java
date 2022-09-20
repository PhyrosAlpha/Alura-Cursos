package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TesteSynchronizedSet {
	
	public static void main(String[] args) {
		Curso geografia = new Curso("Geografia", "Paulo Almeida");
		
		geografia.addAula(new Aula("Estados do Brasil", 10));
		geografia.addAula(new Aula("Capitais", 30));
		geografia.addAula(new Aula("Flora do Brasil - 3", 15));
		
		geografia.matricular(new Aluno("Adriano", 54654654));
		geografia.matricular(new Aluno("Luciano", 78498795));
		geografia.matricular(new Aluno("Víctor", 87975163));
		
		Set<Aluno> novo = Collections.synchronizedSet(geografia.getAlunos());
		
		
		novo.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		
	}

}
