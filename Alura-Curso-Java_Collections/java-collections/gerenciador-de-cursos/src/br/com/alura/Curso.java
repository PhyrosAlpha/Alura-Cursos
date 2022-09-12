package br.com.alura;

import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
		
	}
	
	public void addAula(Aula aula) {
		this.getAulas().add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for(Aula aula : this.getAulas()) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return aulas;
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
