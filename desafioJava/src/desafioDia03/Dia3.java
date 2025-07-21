package desafioDia03;

public class Dia3 {

	public static void main(String[] args) {
		
	for(int numero = 1 ; numero <= 1000; numero ++) {
		System.out.println("A soma de " + numero + " + " + numero + " é " +calc(numero));
	}
		
	}
	
	public static long calc(int numero) {
		long result = 0;
		for(int n = 1 ; n <= numero; n++) {
			 result =  n + numero;
			 
		}
		return result;
	}
}

//Dia 3
//Imprima a soma de 1 até 1000.

//utilizei a mesma solução do dia 2, pois precisava repetir mil vezes o numero
//não encontrei nenhuma maneira eficaz, porem deu certo.

//Sigo apendendo mais sobre metodos static, nunca usei com frequencia.