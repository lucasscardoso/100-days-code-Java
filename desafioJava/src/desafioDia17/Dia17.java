package desafioDia17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Dia17 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite a Sua Frase: ");
			String frase = sc.nextLine().toLowerCase();
			
			String[] palavras = frase.split("\\s+");
			
			sc.close();
			Map<String, Integer> contagem = new HashMap<>();
			
			for(String palavra : palavras) {
				contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
			}
			
			System.out.println("\nO Número de palavras unicas que existem são: " + contagem.size());
			
			System.out.println("\nContagem de palavras: ");
			for(Map.Entry<String, Integer> entry : contagem.entrySet()) {
				System.out.println(entry.getKey() + " = "+ entry.getValue());
			}
			
			List<Map.Entry<String,Integer>> listaOrdenada = new ArrayList<>(contagem.entrySet());
			
			listaOrdenada.sort((a,b) -> b.getValue() - a.getValue());
			
			System.out.println("\nPalavras Ordenadas da mais frequente para a menos Frequente");
			int posicao = 1;
			for (Map.Entry<String, Integer> entry : listaOrdenada) {
			    System.out.println(posicao++ + ". " + entry.getKey() + " (" + entry.getValue() + ")");
			}
			
			
	}

}

//Dia 17

//Crie um programa que receba uma frase digitada pelo usuário e:
//
//Mostre quantas palavras únicas existem.
//
//Mostre quantas vezes cada palavra aparece.
//
//Mostre as palavras ordenadas da mais frequente para a menos frequente.