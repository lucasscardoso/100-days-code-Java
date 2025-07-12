package desafioDia2;

import java.math.BigInteger;

public class Dia2 {

	public static void main(String[] args) {
		
		
		for(int numero = 1; numero <= 100; numero ++) {
			System.out.println("O fatorial de " + numero + " é " + fatorial(numero));
		}
		
		
	
	}
	public static BigInteger  fatorial(int n) {
		
		BigInteger resultado = BigInteger.ONE;
		 for (int i = 2; i <= n; i++) {
	            resultado = resultado.multiply(BigInteger.valueOf(i));
	        }

	        return resultado;
	}

}
//Dia 2
//Imprima os fatoriais de 1 a 10.
//fui ate o numero 100

//Lições aprendidas:
//BigInteger → classe para trabalhar com números inteiros muito grandes,maiores que Long.
//BigInteger.valueOf(i) → converte o inteiro i para BigInteger.
//resultado.multiply(...) → multiplica resultado pelo próximo número (i).
//BigInteger resultado = BigInteger.ONE representa uma constante de valor 1