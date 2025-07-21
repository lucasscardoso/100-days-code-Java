package desafioDia01;

import java.util.stream.IntStream;

public class Dia1 {
	
	
	public static void main(String[] args) {
		
		
		for(int x = 1; x < 100; x++ ) {
			
			if(x % 3 == 0) {
				System.out.println(x);
		   }
		}
				
		//Refatorado,cria um fluxo de inteiros de 1 a 99
				// IntStream.range(1, 100) 
               //  .filter(x -> x % 3 == 0) 
               //  .forEach(System.out::println); 	
				
	}
	
	
}

//Dia 1:
//Imprima todos os múltiplos de 3, entre 1 e 100.
