package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {
	
    public static void main(String[] args) {

    	//devolve um conjunto vazio que n�o pode ser modificado ou inserido elementos.
        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
    }

}
