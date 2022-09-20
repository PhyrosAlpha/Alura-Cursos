package br.com.alura;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: %s, Matrícula: %s]"
				.formatted(this.getNome(), this.getNumeroMatricula());
	}

	
	//Aqui foi utilizado a ferramenta do eclipse para gerar os equals e hashcode.
	@Override
	public int hashCode() {
		return Objects.hash(numeroMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return numeroMatricula == other.numeroMatricula;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Aluno aluno = (Aluno) obj;
//		return this.nome.equals(aluno.nome);
//	}
	
	//Pega a primeira letra do nome e cria o hash baseado nisso, assim todos que
	//começam com a A,B,C,D... serão divididos em grupos ou listas diferentes.
	//Porém é ingenuo...
//	@Override
//	public int hashCode() {
//		return this.nome.charAt(0);
//	}
	
	//utiliza-se a própria regra do hashcode da classe String
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}
	
	
	
	
	
}
