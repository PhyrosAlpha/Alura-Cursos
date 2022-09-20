package br.com.alura;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		
		Curso geografia = new Curso("Geografia", "Paulo Almeida");
		
		geografia.addAula(new Aula("Estados do Brasil", 10));
		geografia.addAula(new Aula("Capitais", 30));
		geografia.addAula(new Aula("Flora do Brasil - 3", 15));
		
		Aluno a1 = new Aluno("Adriano", 54654654);
		Aluno a2 = new Aluno("Luciano", 78498795);
		Aluno a3 = new Aluno("Fabiano", 87975163);
		Aluno a4 = new Aluno("Victor", 87975163);
		
		//Ser�o iguais pois o iqual foi alterado para retornar true quando o nome
		///for iguais.
		System.out.println("S�o iguais? - " + a3.equals(a4));
		
		geografia.matricular(a1);
		geografia.matricular(a2);
		geografia.matricular(a3);
		//geografia.matricular(a4);
		
		//Aqui n�o ser� true pois a os Set trabalham de maneira diferente, em uma list 
		//teria dado true.
		System.out.println(geografia.exiteAluno(a4));
		
		
		//Long numero = Long.valueOf(5);		
	}

}
