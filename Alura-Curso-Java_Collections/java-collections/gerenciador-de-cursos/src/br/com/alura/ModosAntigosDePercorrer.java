package br.com.alura;

import java.util.Iterator;
import java.util.Vector;

public class ModosAntigosDePercorrer {
	
	public static void main(String[] args) {	
		Curso geografia = new Curso("Geografia", "Paulo Almeida");
		
		geografia.addAula(new Aula("Estados do Brasil", 10));
		geografia.addAula(new Aula("Capitais", 30));
		geografia.addAula(new Aula("Flora do Brasil - 3", 15));
		
		Aluno a1 = new Aluno("Adriano", 54654654);
		Aluno a2 = new Aluno("Luciano", 78498795);
		Aluno a3 = new Aluno("Fabiano", 87975163);
		
		geografia.matricular(a1);
		geografia.matricular(a2);
		geografia.matricular(a3);

		//Modo antigo da versão 5 do java.
		//Muito codigo legado utiliza essa forma.
		
		//Utiliza-se um método que retorna um iterator
		Iterator<Aluno> iterador = geografia.getAlunos().iterator();
		
		//Para percorrer utiliza-se este método que devolve true caso ainda existe itens para percorrer
		while(iterador.hasNext()) {
			
			//Se existe utiliza-se esse método para pegar o item atual.
			Aluno aluno = iterador.next();	
			System.out.println(aluno.getNome());
		}
		
		//O iterator é percorrido apenas uma vez, até não existir mais itens
		//caso contrário a exceção java.util.NoSuchElementException será disparada.
		//Aluno aluno = iterador.next();
		
		
		//Criado em na versão 1.2 do java
		Vector<Aluno> vetor = new Vector<>();
		
		
		
	}

}
