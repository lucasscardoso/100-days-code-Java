package desafioDia10;

import java.util.Scanner;
import java.util.function.Function;

public class Dia10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		
		System.out.println("Digite um numero inteiro diferente de 1: ");
		num = sc.nextInt();
		
		sc.close();
		
		Function<Integer, Boolean> verifica = (n) ->{
			if(n <= 0 || n == 1) {
				return false;
			}
			return true;
		};
		
		System.out.println("Numero Valido? " + verifica.apply(num));
		
		
		
		Function<Integer, Integer> calcula = (n) ->{
			int soma = 0;
			int impar = 1; 
			
			if(!verifica.apply(n)) {
				System.out.println("numero invalido");
				return -1;
			}
			
			System.out.println("Os " + n + " primeiros números ímpares são:");
			
			for(int i = 1; i <= n; i++) {
				
				System.out.println(impar);
				soma += impar;
				impar += 2;
			} 
			return soma;
		};
		
		System.out.println("A soma final " + calcula.apply(num));

	}


	}

//Dia 10


//Escreva um programa em Java que:
//
//Leia um número inteiro positivo N.
//
//Calcule a soma dos N primeiros números ímpares.
//
//Mostre também a lista desses números ímpares.


//Ate o momento, esse desafio acabou sendo o mais interessante em questao de logica, fiquei impressionado como demorei para entender.
//Algo simples as vezes pode nos surpreender.
