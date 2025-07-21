package desafioDia04;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Dia4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double altura;
		double peso;
		
		System.out.println("Digite sua altura ");
		altura = sc.nextDouble();
		
		System.out.println("Digite seu peso ");
		peso = sc.nextDouble();
		
		sc.close();
		
		BiFunction<Double, Double, String> calculoImc = (a,p) -> {
			double calc = p / (a * a);
			
			if(calc < 18.5) return "Você esta abaixo do peso";
			else if (calc < 24.9) return "Você esta no peso ideal";
			else if (calc < 29.9) return "Você esta em sobre peso";
			else return "Você esta obeso";
		};
		
		System.out.println("Seu resultado: " + calculoImc.apply(altura,peso));
		
	}
}

//Dia 4
// Crie uma calculadora de IMC
//calculadora criada, segui com estudos de lambda
//aprendi sobre a bifunction e sua utilização.
//fiz duas versões

//primera versão funcional 

//Scanner sc =  new Scanner(System.in);


//double altura;
//double peso;

//System.out.println("Digite sua altura: ");
//altura = sc.nextDouble();

//System.out.println("Digite seu peso: ");
//peso = sc.nextDouble();

//sc.close();

//System.out.print("Seu resultado é " + calculoImc(altura, peso));



//public static String calculoImc(double altura, double peso) {

//double result = peso / (altura *altura);

//if(result < 18.5) {
//	return "Voce esta Abaixo do peso";
//	}
//	else if(result >= 18.5 && result <= 24.9 ) {
//		return "Voce esta no peso ideal";
//	}
//	else if(result >= 25 && result <= 29.9 ) {
//		return "Voce esta em sobre peso";
//	}
//	else {
//		return "Voce esta Obeso";
//	}

//}