package br.com.alura.ex;

import java.util.Comparator;

public class OrdenarPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario o1, Funcionario o2) {
		System.out.println(o1.getIdade() + " e " + o2.getIdade());
		
		return o1.getIdade() - o2.getIdade();
	}

}
