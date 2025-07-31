package desafioDia19;

import java.util.Random;
import java.util.Scanner;

public class Dia19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tentativas = 0;
		Random random = new Random();
		boolean acertou = false;

		int[] resul = new int[4];

		for (int i = 0; i < 4; i++) {
			resul[i] = random.nextInt(10);
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(resul[i]);
		}
		System.out.println(resul);

		System.out.println("Senha secreta de 4 digitos criada!(A senha possui numeros de 0-9)");
		System.out.println("Voce tem 5 tentativas! Boa sorte");

		while (!acertou && tentativas < 5) {

			System.out.println("Digite seu palpite: ");
			String palpite = sc.next();
			tentativas++;

			int acertosPosicaoCerta = 0;
			int acertosNumeroErradoLugar = 0;

			for (int i = 0; i < 4; i++) {
				int digito = Character.getNumericValue(palpite.charAt(i));

				if (digito == resul[i]) {
					acertosPosicaoCerta++;
					System.out.println("Voce Acertou um numero na posição " + (i + 1));
				} else {
					for (int j = 0; j < 4; j++) {
						if (digito == resul[j] && j != i) {
							acertosNumeroErradoLugar++;
							System.out.println("Voce Errou um numero na posição " + (j + 1));
							break;
						}
					}
				}

				

			}
			if (acertosPosicaoCerta == 4) {
				acertou = true;
				System.out.println("Parabéns! Você acertou a senha!");
			} else {
				System.out.println("Acertos na posição certa: " + acertosPosicaoCerta);
				System.out.println("Números corretos, mas no lugar errado: " + acertosNumeroErradoLugar);
				System.out.println("Tentativas restantes: " + (5 - tentativas)+ "\n");
				System.out.println("Tentativa " + tentativas + " : " + palpite );
			}
			
		}
		sc.close();

		if (!acertou) {
			System.out.print("😢 Você perdeu! A senha era: ");
			for (int n : resul) {
				System.out.print(n);
			}
		}

	}
}

//Dia 19

//Exercício – Jogo da Senha Secreta
//Descrição:
//Crie um programa que gere automaticamente uma senha secreta com 4 números aleatórios entre 0 e 9 (ex.: 5 3 8 1).
//O usuário terá 5 tentativas para adivinhar a senha.
//
//Regras:
//
//A cada tentativa, o usuário digita 4 números.
//
//O programa deve informar:
//
//Quantos números estão corretos e na posição certa.
//
//Quantos números estão corretos, mas na posição errada.
//
//Se o usuário acertar os 4 números na posição correta, ele vence e o jogo termina.
//
//Se errar nas 5 tentativas, o programa revela a senha.