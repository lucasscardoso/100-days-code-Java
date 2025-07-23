package desafioDia13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dia13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		int encontrados = 0;
		int atual = 1;

		List<Integer> list = new ArrayList<>();
		
		System.out.println("Numeros magicos, numeros que somados, o resultado é 7 ");
		System.out.println("O Calculo é feito com a dezena e a unidade, exemplo: 43 , 4 + 3 = 7");
		System.out.println();
		System.out.println("Digite um numero inteiro Positivo maior que zero: ");
		numero = sc.nextInt();
		
		sc.close();

		while (encontrados < numero) {
			if (somaDigitos(atual) == 7) {
				list.add(atual);
				encontrados++;
			}
			atual++;
		}

		System.out.println(list);

	}

	public static int somaDigitos(int n) {
		int soma = 0;

		while (n > 0) {

			soma += n % 10;
			n = n / 10;

		}
		return soma;
	}

}

//Dia 13

//Um número mágico é um número inteiro positivo cuja soma de dígitos é igual a 7.
//Por exemplo: 43 é mágico (4 + 3 = 7), e 52 também é mágico (5 + 2 = 7).
//
//Tarefa:
//Escreva um programa em Java que:
//
//Peça ao usuário para informar um número inteiro positivo N (maior que 0).
//
//Gere os N primeiros números mágicos e os armazene em um array.
//
//Exiba na tela os números mágicos encontrados, em ordem crescente.
//
//Desafio adicional (opcional):
//Implemente o código de forma que os números mágicos sejam armazenados em um ArrayList<Integer>, e só depois copiados para um array.
