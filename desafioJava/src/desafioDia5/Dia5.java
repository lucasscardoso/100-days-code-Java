package desafioDia5;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Dia5 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int aumento;
			
			Funcionario lucas = new Funcionario("lucas", "TI", "15/07/2025", "33.689.222-3", 2000);
			
			System.out.println(lucas);
			
			System.out.println();
			
			System.out.println("Digite o valor do Aumento de Salario: ");
			aumento = sc.nextInt();
			
			sc.close();
			
			BiFunction<Integer, Double, Double> calcAumento = (aumentoSal,salario) -> {
				salario *= (aumentoSal / 100.0 + 1);
				return salario;
			};
			
			double novoSal = calcAumento.apply(aumento,lucas.getSalario());
			
			System.out.println("o aumento foi: " + novoSal);
			
			Function<Double, Double> anual = (calcSal) -> {
				double calc = novoSal * 12;
				return calc;
			};
			
			double anualSal = anual.apply(novoSal);
			
			System.out.println("o valor anual do seu salario: " + anualSal);
			
			
			
			Function<Double, String> ir = (imposto) -> {
			    if(imposto > 33888.0) {
			        return "Você deve declarar o imposto";
			    } else {
			        return "Você não precisa declarar o imposto";
			    }
			};
			
			System.out.println(ir.apply(anualSal));
			
		
	}

}

//Dia 5

//Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário
//(double), a data de entrada no banco (String) e seu RG (String).
//Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método
//recebeAumento que aumenta o salario do funcionário de acordo com o parâmetro passado como ar-
//gumento. Crie também um método calculaGanhoAnual, que não recebe parâmetro algum, devolvendo
//o valor do salário multiplicado por 12

// **Acrescentei o calculo do imposto de renda baseado no IR 2025

// Primeiro Modelo 

//lucas.aumentoSalario(aumento);
//System.out.println("Seu Salario Após o aumento é: " + lucas.getSalario());

//	System.out.println();

//	lucas.calculaGanhoAnual();
