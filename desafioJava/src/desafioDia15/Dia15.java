package desafioDia15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dia15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		int quantidade;
		double valor;
		String nome;
		Boolean programa = true;
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Lapis",10,1.50));
		list.add(new Produto("Caderno",15,3.50));
		list.add(new Produto("borracha",50,10.50));
		
		while(programa) {
			System.out.print("1 - Cadastrar Produto\n2 - Listar Produto\n3"
					+ " - Buscar Produto\n4 - Atualizar Quantidade\n5"
					+ " - Calcular valor Total\n0 - Sair\n\nEscolha uma Opção:");
			opcao = sc.nextInt();
			
			switch(opcao){
			
				case 1:  
						System.out.print("Digite o nome do Produto: ");
						
						sc.nextLine();
						nome = sc.nextLine();
						
						System.out.print("Digite a Quantidade do Produto: ");
						quantidade = sc.nextInt();
						
						System.out.print("Digite o valor Unitario do produto: ");
						valor = sc.nextDouble();
						
						 list.add(new Produto(nome,quantidade,valor));
						
					break;
					
				case 2:  
					System.out.println("Produtos Cadastrados: \n");
					for(Produto prod : list) {
						System.out.println(prod);
					}
					System.out.println();
					break;
					
				case 3: 
					
					System.out.println("Digite o nome do produto que voce quer encontrar: ");
					
					sc.nextLine();
					String nomeBusca = sc.nextLine();
					boolean encontrado = false;
					
					for(Produto p : list) {
						if(p.getNome().equalsIgnoreCase(nomeBusca)) {
							System.out.println("Produto Encontrado: ");
							System.out.println(p);
							System.out.println();
							encontrado = true;
							break;
						}
						if (!encontrado) {
						    System.out.println("Produto não localizado ou não existe!");
						}
					}
					
					break;
					
				case 4:  
					System.out.println("Digite o nome do produto que voce quer encontrar: ");
					
					sc.nextLine();
					String nomeProd = sc.nextLine();
					
					
					for(Produto p : list) {
						if(p.getNome().equalsIgnoreCase(nomeProd)) {
							System.out.println("Produto Encontrado: ");
							System.out.println(p);
							System.out.println("Digite a nova quantidade do Produto: ");
							int novaQuantidade = sc.nextInt();
							p.setQuantidade(novaQuantidade);
							System.out.println(p);
							break;
						}
						else {
							System.out.println("Produto Nao localizado ou Não existe!\n");
							
							
							break;
						}
					}
					break;
				case 5:  
					
					System.out.println("A Soma dos valores no estoque é: ");
					int quantidadeTotal = 0;
					double valorTotal = 0;
					for(Produto p : list) {
							quantidadeTotal += p.getQuantidade();
							valorTotal += p.getQuantidade() * p.getPrecoUniotario();
							
						}
					System.out.println("Contagem de Todos os Produtos no estoque: " + quantidadeTotal);
					System.out.println("Soma de valores de todos os produtos do estoque: $" + valorTotal);
					System.out.println();
					break;
					
				default:
					System.out.println("Voce escolheu sair,	Programa Encerrado.");
					programa = false;
			}
		
			
			

		}
		sc.close();
		
	}
		
		

}

//Dia 15

// Exercício: Sistema de Controle de Estoque Simples
//Descrição:
//Você deve criar um programa que simule o controle de um pequeno estoque de produtos. O sistema deve permitir:
//
//Cadastrar produtos (nome, quantidade e preço unitário).
//
//Listar todos os produtos cadastrados.
//
//Buscar um produto pelo nome.
//
//Atualizar a quantidade de um produto (entrada e saída).
//
//Calcular o valor total em estoque.
//
//🛠 Requisitos Técnicos:
//Utilize ArrayList para armazenar os produtos.
//
//Crie uma classe Produto com os atributos: nome, quantidade e preco.
//
//Use Scanner para interagir com o usuário via console.
//
//Use estruturas como switch, loop while, e if.

