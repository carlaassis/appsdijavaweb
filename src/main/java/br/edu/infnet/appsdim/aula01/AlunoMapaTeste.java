package br.edu.infnet.appsdim.aula01;

import java.util.HashMap;
import java.util.Map;

public class AlunoMapaTeste {
	
	public static void main(String[] args) {
		
		
		//mapa <K,V: chave e valor: estrutura que tem chave e valor e tem mt mais facilidade em recuperar um valor pela chave do que percorrer tudo
		
	//dentro do mapa sempre trabalhar com classes
		
		// criação do mapa
		Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
		//incluir:
		mapaNomes.put(1, "carla");
		mapaNomes.put(2, "enzo");
		mapaNomes.put(3, "buddy");
		
		System.out.println("Após a inclusão: " + mapaNomes);
		// guardar algo no mapa digitar chave e valor
		
		//alterar
		mapaNomes.put(2, "banofe");
		System.out.println("Após a alteração: " + mapaNomes);
		
		
		//excluir: passar a chave e detonar o dado
		int key = 1;
		String value = mapaNomes.remove(key);
		System.out.println("O aluno " + value + " foi excluído da chave: " + key);
		
		
		//ver todos
		System.out.println("Após a exclusão: " + mapaNomes);
	}

}
