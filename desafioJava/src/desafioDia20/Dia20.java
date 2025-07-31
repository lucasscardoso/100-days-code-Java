package desafioDia20;

import java.util.Scanner;

public class Dia20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conta c = new Conta(12345,"Lucas S",0,0,0);
		boolean sair = true;
		int opcao = 0;
		double deposito;
		double saque;
		
		
		
		while(sair) {
			System.out.println("Caixa Eletronico\n");
			System.out.println("1 - Consultar Saldo\r\n"
					+ "2 - Depositar\r\n"
					+ "3 - Sacar\r\n"
					+ "0 - Sair\nEscolha o Tipo De Serviço:\n");
			opcao = sc.nextInt();
			
			switch(opcao) {
				
			case 1:
				System.out.println("Seu Saldo é: $" + c.getSaldo() + "\n");
					break;
					
			case 2:
				System.out.print("Digite a quantia a ser depositada: ");
				deposito = sc.nextDouble();
				
				c.depositar(deposito);
				
				System.out.println("Deposito concluido com sucesso!! , Novo Saldo é: $" + c.getSaldo() + "\n");
	
				break;
				
			case 3:
				System.out.print("Digite a quantia que deseja Sacar: ");
				saque = sc.nextDouble();
				
				if(saque > c.getSaldo()) {
					System.out.println("Infelizmente a quantia desejada ultrapassa o valor depositado em conta!\nConsulte o Saldo e tente novamente.\n");
				}
				else {
					c.sacar(saque);
					System.out.println("Saque concluido com sucesso!! , Novo Saldo é: $" + c.getSaldo() + "\n");
				}
				
				break;
				
			default:
				if(opcao == 0) {
					sair = false;
				}
				break;
			}
		}
		
		sc.close();
		
		System.out.println("Obrigado Por usar nossos Serviços, aqui esta um demonstrativo da conta:\n" + c);
	}

}

//Exercício — Caixa Eletrônico Simples
//Enunciado:
//Crie um programa em Java que simule um caixa eletrônico com as seguintes funcionalidades:
//
//O saldo inicial da conta é R$ 1.000,00.
//
//O programa deve exibir um menu para o usuário:
//
//1 - Consultar Saldo
//2 - Depositar
//3 - Sacar
//0 - Sair
