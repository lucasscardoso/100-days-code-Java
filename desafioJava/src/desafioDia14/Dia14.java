package desafioDia14;

import java.util.Scanner;

public class Dia14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] meses = {"Janeiro","Fevereiro","Março","Abril",
							"Maio","Junho","Julho","Agosto","Setembro",
							"Outubro","Novembro","Dezembro"};
		
		double[] temperatura = new double[meses.length];
		double soma = 0;
		double media;
		
		for(int i = 0; i < meses.length;i++) {
			
			System.out.print("Informe a temperatura do mes de " + meses[i] + " :");
			temperatura[i] = sc.nextDouble();
		}
		
		sc.close();
		
		for(double t : temperatura) {
			
			soma += t;
			
		}
		
		media = soma / meses.length;
		
		System.out.printf("Media Anual: %.2f°C\n", media);
		
		for(int i = 0; i < meses.length; i++) {
			if(temperatura[i] > media) {
				System.out.println(meses[i] + " Acima da media com temperatura de: " + temperatura[i]+ "°C" );
			}
		}
		
	}

}

//Dia 14

//Exercício: Análise de Temperaturas Mensais
//Descrição:
//
//Escreva um programa em Java que:
//
//Peça ao usuário para informar a temperatura média de cada mês do ano (12 valores).
//
//Calcule:
//
//A média anual de temperatura.
//
//Quais meses ficaram com a temperatura acima da média anual.
//
//Mostre o nome do mês e o valor da temperatura acima da média.
//
//Requisitos Técnicos:
//Utilizar arrays para armazenar as temperaturas e os nomes dos meses.
//
//Utilizar Scanner para entrada de dados.
//
//Utilizar for e if para percorrer e comparar os dados.
