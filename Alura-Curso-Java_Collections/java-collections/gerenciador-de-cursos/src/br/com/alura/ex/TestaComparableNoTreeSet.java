package br.com.alura.ex;

import java.util.Set;
import java.util.TreeSet;

public class TestaComparableNoTreeSet {
	
	public static void main(String[] args) {
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenarPorIdade());

		funcionarios.add(new Funcionario("Gabriel", 12));
		funcionarios.add(new Funcionario("Jonny", 19));

		funcionarios.add(new Funcionario("Brian", 25));
		funcionarios.add(new Funcionario("Raimundo", 33));
		funcionarios.add(new Funcionario("Zilda", 45));
		
		System.out.println("Percorrendo TreeSet");
		funcionarios.forEach(funcionario -> {System.out.println(funcionario.getNome());});
		
		System.out.println("Percorrendo Iterator");
		
		
	}

}
