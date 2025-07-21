package desafioDia08;

import java.util.Scanner;
import java.util.function.Function;

public class Dia8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalNum;
		System.out.println("Quantos Números você vai digitar?");
		totalNum = sc.nextInt();
		
		int num[];
		num = new int[totalNum];
		
		Function<int[], Integer> soma = (numeros) -> {
		    int total = 0;
		    for (int n : numeros) {
		        total += n;
		    }
		    return total;
		};
		
		Function<int[], Integer> media = (numeros) -> {
			
			int total = soma.apply(num);
			
			return total / numeros.length;
			
		};
		
		for(int i = 0; i < totalNum; i++) {
			System.out.println("Digite o " + (i + 1) + " numero: ");
			
			num[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Números Digitados:");
		
		for(int i = 0 ; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println();
		
		System.out.println("Soma dos Números:");
		
		System.out.println(soma.apply(num));

		System.out.println();
		
		System.out.println("A Media dos Números:");
		
		System.out.println(media.apply(num));
	}

}

//Dia 8

//Crie um programa em Java que pergunte ao usuário quantos números ele quer digitar, leia todos esses números e calcule a média aritmética deles.
//
//Ao final, exiba:
//
//A lista dos números digitados.
//
//A soma total.
//
//A média aritmética.


//**Primeira forma feita, sem Lambdas, refatorei para aprendizado.

//Scanner sc = new Scanner(System.in);
//
//int totalNum;
//System.out.println("Quantos Números você vai digitar?");
//totalNum = sc.nextInt();
//
//sc.close();
//
//int num[];
//num = new int[totalNum];
//
//int result = 0;
//
//for(int i = 0; i < totalNum; i++) {
//	System.out.println("Digite o " + (i + 1) + " numero: ");
//	
//	num[i] = sc.nextInt();
//}
//
//System.out.println("Números Digitados:");
//
//for(int i = 0 ; i < num.length; i++) {
//	System.out.println(num[i]);
//}
//
//System.out.println();
//
//System.out.println("Soma dos Números:");
//
//	for(int i = 0 ; i < num.length; i++) {
//	result += num[i];	
//	}
//
//	System.out.println(result);
//
//
//System.out.println();
//
//System.out.println("A Media dos Números:");
//
//System.out.println(result / totalNum);