package desafioDia11;

import java.util.Random;
import java.util.Scanner;

public class Dia11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int numero = random.nextInt(51) + 1;
		
		int n ;
		int quantidade = 0;
		
		System.out.println("Um numero vai ser sorteado, voce consegue acertar? Você tem 7 tentativas\n");
		System.out.print("Digite seu chute: ");
		n = sc.nextInt();
		
		while(n != numero && quantidade < 7) {
			if( n < numero) {
				System.out.println("O número é maior que isso.\n");
			}else {
				System.out.println("O número é menor que isso.\n");
			}
			
			quantidade ++;
			
			System.out.print("Digite um Novo Chute: ");
			n = sc.nextInt();
				
		}
		
		sc.close();
		
		quantidade ++;
		
		if(n == numero) {
			System.out.println("Parabéns! Você acertou o número em "+ quantidade +" tentativas!");
		}else {
			System.out.println("Suas tentativas acabaram. O número era " + numero);
		}
		
	}

}

//Dia 11

//Exercício: Jogo de Adivinhação com Dicas
//Enunciado:
//
//Escreva um programa que:
//
//Sorteie um número inteiro aleatório entre 1 e 50.
//
//Peça ao usuário para tentar adivinhar o número.
//
//Enquanto o usuário não acertar:
//
//Se o palpite for menor que o número sorteado, exiba a mensagem:
//"O número é maior que isso."
//
//Se o palpite for maior que o número sorteado, exiba a mensagem:
//"O número é menor que isso."
//
//Quando o usuário acertar, exiba:
//"Parabéns! Você acertou o número em X tentativas!"
//

//Requisitos:
//Use uma estrutura de repetição (while ou do..while) para continuar perguntando até acertar.
//
//Use uma variável para contar o número de tentativas.
//
//Utilize uma função ou biblioteca para gerar números aleatórios (por exemplo, Math.random() em JavaScript ou Random em Java/Python).
//


//Desafio Extra (opcional):
//Limite o número de tentativas a 7.
//Se o usuário não acertar em 7 tentativas, exiba:
//"Suas tentativas acabaram. O número era Y."

