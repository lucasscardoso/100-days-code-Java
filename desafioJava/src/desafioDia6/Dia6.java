package desafioDia6;

import java.util.Scanner;

public class Dia6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura;
		double largura;
		String cor;
		
		System.out.print("Digite a Altura da porta: ");
		altura = sc.nextDouble();
		
		System.out.print("Digite a Altura da porta: ");
		largura = sc.nextDouble();
		
		System.out.print("Digite a Cor da porta: ");
		cor = sc.next();
		
		Porta porta = new Porta(true,cor,altura,largura);
		
		porta.estaAberta();
		
		System.out.println("Fechando porta...");
		
		porta.fecha();
		
		porta.estaAberta();
		
		System.out.println("Vamos abrir a porta...");
		porta.abre(true);
		
		porta.estaAberta();
		
		System.out.println("A cor da porta é: " + porta.getCor());
		
		System.out.print("Vamos pintar novamente, digite a cor: ");
		cor = sc.next();
		
		porta.pinta(cor);
		
		System.out.println("A cor da porta é: " + porta.getCor());
		
		System.out.println("A sua porta tem a altura de: " + porta.getAltura() + " , e a Largura de: " + porta.getLargura());
		
		System.out.print("Vamos alterar as medidas..");
		System.out.print("Digite a nova Altrura:");
		altura = sc.nextDouble();
		
		System.out.println("Digite a nova Largura: ");
		largura = sc.nextDouble();
		
		sc.close();
		
		System.out.println("Novo Relatorio sobre a porta - " + "A cor é: " + porta.getCor() + " , A altura é: " + 
				porta.getAltura() + " e  A largura é: " + porta.getLargura());
	}

}

//Dia 6

//Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método
//estaAberta para verificar se ela está aberta.


//Nesse Exercicio não vi muitos ganhos em usar o Lambda, porem fica a fins de estudo a versão com Lambda

//Supplier<Double> lerDouble = () -> sc.nextDouble();
//Supplier<String> lerString = () -> sc.next();
//
//Consumer<String> print = System.out::println;
//
//Consumer<String> printPrompt = (msg) -> {
//    System.out.print(msg + ": ");
//};
//
//printPrompt.accept("Digite a altura da porta");
//double altura = lerDouble.get();
//
//printPrompt.accept("Digite a largura da porta");
//double largura = lerDouble.get();
//
//printPrompt.accept("Digite a cor da porta");
//String cor = lerString.get();
//
//Porta porta = new Porta(true, cor, altura, largura);
//
//porta.estaAberta();
//
//print.accept("Fechando porta...");
//porta.fecha();
//porta.estaAberta();
//
//print.accept("Vamos abrir a porta...");
//porta.abre(); // corrigido: sem parâmetro
//porta.estaAberta();
//
//print.accept("A cor da porta é: " + porta.getCor());
//
//printPrompt.accept("Vamos pintar novamente, digite a cor");
//cor = lerString.get();
//porta.pinta(cor);
//
//print.accept("A cor da porta é: " + porta.getCor());
//
//print.accept("A sua porta tem a altura de: " + porta.getAltura() + " , e a largura de: " + porta.getLargura());
//
//print.accept("Vamos alterar as medidas..");
//printPrompt.accept("Digite a nova altura");
//altura = lerDouble.get();
//
//printPrompt.accept("Digite a nova largura");
//largura = lerDouble.get();
//
//sc.close();
//
//print.accept(
//    "Novo relatório sobre a porta - cor: " + porta.getCor() +
//    ", altura: " + porta.getAltura() +
//    ", largura: " + porta.getLargura()
//);
//}