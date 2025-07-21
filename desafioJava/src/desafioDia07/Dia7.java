package desafioDia07;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Dia7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int i;
		int f;
		
		System.out.print("Digite o Numero para ser calculado: ");
		n = sc.nextInt();
		
		System.out.print("Digite o inicio do intervalo: ");
		i = sc.nextInt();
		
		System.out.print("Digite o fim do intervalo: ");
		f = sc.nextInt();
		
		sc.close();
		
		  IntStream.rangeClosed(i, f)
          .forEach(x -> System.out.println(n + " x " + x + " = " + (n * x)));


		
	}

}

//Dia 7

//Escreva um programa em Java que peça ao usuário:
// Um número inteiro N para calcular a tabuada.
//Um número inteiro I indicando o início do intervalo.
// Um número inteiro F indicando o fim do intervalo.
//
//O programa deve validar que I<F.
//Depois, mostre a tabuada do número N apenas no intervalo de I até F.

// Modo original

//
//while(i <= f) {
//	System.out.println(n + " X " +  i + " = " + (n * i));
//	i++;
//}

//Inseri a lambda, pois achei mais elegante e a caracter de estudo
