package desafioDia09;

import java.util.Scanner;
import java.util.function.Function;

public class Dia9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean primo = true;
		
		System.out.println("Digite um Numero: ");
		numero = sc.nextInt();
		
		sc.close();
		
		Function<Integer, Double> raizQuadrada = (n) ->{
			return (Double) Math.sqrt(n);
		};
		
		Function<Integer, Integer> cubo = (n) ->{
			return n * n * n;
		};
		
		Function<Integer, Integer> quadrado = (n) ->{
			return n * n;
		};
		Function<Integer, String> parImpar = (n) ->{
			int calc = n % 2;
			if(calc == 0) {
				System.out.println(n + "é Par");
			}
			return n + " é impar";
		};
		
		System.out.println("A Raiz Quadrada de " + numero + " é " +raizQuadrada.apply(numero));
		System.out.println("Ao Cubo "+ numero + " é " +cubo.apply(numero));
		System.out.println("Ao Quadrado " + numero + " é " +quadrado.apply(numero));
		System.out.println(parImpar.apply(numero));

	        if (numero <= 1) {
	            primo = false;
	        } else {
	            for (int i = 2; i <= numero / 2; i++) {
	                if (numero % i == 0) {
	                    primo = false;
	                    break;
	                }
	            }
	        }

	        if (primo) {
	            System.out.println(numero + " é primo.");
	        } else {
	            System.out.println(numero + " não é primo.");
	        }
		
		
		
	
	}

}

//Dia 9

//Escreva um programa em Java que leia um número inteiro positivo n do usuário e exiba no console:
//
//✅ O quadrado de n
//✅ O cubo de n
//✅ A raiz quadrada de n (com 2 casas decimais)
//
//Além disso, o programa deve verificar:
//
//Se n é par ou ímpar.
//
//Se n é um número primo.

//Aprendi alguns conceitos matematicos com esse exercicio, por conta da agenda pessoal, consegui postar tarde e nao pude refatorar tudo
//para postar no mesmo dia.