package br.com.alura.ex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {
	
	public static void main(String[] args) {
		
		System.out.println("Percorrendo LinkedList");
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		letras.forEach(letra -> {
		    System.out.println(letra);
		});
		
		
		System.out.println("Percorrendo Iterator");
		Iterator<String> iterator = letras.iterator();
		
		while(iterator.hasNext()) {
			String letra = iterator.next();
			System.out.println(letra);
		}
		
		
		
	}

}
