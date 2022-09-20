package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
		
	}
	
	public void addAula(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for(Aula aula : this.getAulas()) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;		
	}
	
	public boolean exiteAluno(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}
	
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos) ;
	}
	
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	
	@Override
	public String toString() {
		return "[Curso: %s, Tempo total: %d Minutos]"
				.formatted(this.getNome(), this.getTempoTotal());
	}


}
