package desafioDia12;

import java.util.Arrays;
import java.util.Scanner;

public class Dia12 {

	public static void main(String[] args) {
		
		//Refatorado
		
		 Scanner sc = new Scanner(System.in);
		 int quantAlunos;
		
		 System.out.println("digite o numero de Alunos: ");
		 quantAlunos = sc.nextInt();
		 
		 double notas[] = new double[quantAlunos];
		 
		 for(int i = 0; i < quantAlunos; i++) {
			 System.out.println("Digite a nota do " + (i + 1) + " Aluno :");
			 notas[i] = sc.nextDouble();
		 }
		 
		 double max = Arrays.stream(notas).max().orElse(Double.NaN);
		 double min = Arrays.stream(notas).min().orElse(Double.NaN);
		 double soma = Arrays.stream(notas).sum();
		 double media = soma / quantAlunos;
		 long acimaMedia = Arrays.stream(notas).filter(n -> n > media).count();
		 
		 sc.close();
		 
		 System.out.println("A maior Nota foi " + max);
		 System.out.println("A menor Nota foi: " + min);
		 System.out.println("A media foi: " + media);
		 System.out.println("Quantidade de Alunos Acima da media: " + acimaMedia);

	}

}

//Dia 12

//Postado fora da data e codigo para refatorar, ficou gigante, vou refatorar junto com o dia 13 (Refatorado)

//Exercício: Analisador de Notas de Alunos
//Um professor precisa de um programa que leia as notas de N alunos de uma turma e analise os seguintes pontos:
//
//Qual foi a maior nota?
//
//Qual foi a menor nota?
//
//Qual foi a média da turma?
//
//Quantos alunos ficaram acima da média?
//
//O programa deve solicitar ao usuário a quantidade de alunos (N), depois ler as notas de cada um (números decimais), realizar os cálculos e exibir os resultados ao final.
//
// Requisitos:
// Ler um número inteiro N (>0).
// Criar um array para armazenar as N notas.
// Ler as notas com um for.
// Calcular maior, menor e média das notas.
// Contar quantos alunos tiveram nota maior ou igual à média.
// Imprimir os resultados de forma clara.
//
//
// Codigo Antigo:

//Scanner sc = new Scanner(System.in);
//int quantAlunos;
//double max = Double.MIN_VALUE;
// double min = Double.MAX_VALUE;
//double soma = 0;
//double media;
// int acimaDaMedia= 0;


//System.out.println("digite o numero de Alunos: ");
//quantAlunos = sc.nextInt();

//double notas[] = new double[quantAlunos];

//for(int i = 0; i < quantAlunos; i++) {
//	 System.out.println("Digite a nota do " + (i + 1) + " Aluno :");
//	 notas[i] = sc.nextDouble();
//}

//sc.close();
//
//System.out.println("A maior Nota foi " + max);
//System.out.println("A menor Nota foi: " + min);
//System.out.println("A media foi: " + media);
//System.out.println("Quantidade de Alunos Acima da media: " + acimaMedia);
//
//for(double nota : notas) {
//	 if(nota > max) {
//		 max = nota;
//	 }
//	 if(nota < min) {
//		 min = nota;
//	 }
//}
//
//System.out.println();
//
//System.out.println("maior nota: " + max);
//System.out.println("menor nota: " + min);
//
//for(int i = 0; i < quantAlunos; i++) {
//	 
//	 soma +=  notas[i];
//}
//
//media = soma / quantAlunos;
//
//System.out.println("a media foi: " + media);
//
//for(int i = 0; i < quantAlunos; i++) {
//	 if(notas[i] > media) {
//		 acimaDaMedia ++;
//	 }
//	 
//}
//
//System.out.println("Alunos acima da media: " + acimaDaMedia);

