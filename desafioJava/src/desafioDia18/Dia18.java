package desafioDia18;

import java.util.ArrayList;
import java.util.Scanner;

public class Dia18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> list = new ArrayList<Produto>();
		
		list.add(new Produto("Lapis", 5, 10.50));
		list.add(new Produto("caderno", 15, 13.50));
		list.add(new Produto("borracha", 25, 0.50));
		
		boolean program = true;
		
		while(program) {
			System.out.println("Cadastro de Produtos:\n");
			
			System.out.println("1 - Adicionar Produto\n2 - Listar Produtos\n3 - Buscar Produto Pelo Nome"
					+ "\n4 - Atualizar Quantidade\n5 - Calcular Valor Total do Estoque\n0 - Sair\nDigite Sua opção:");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				
			case 1:
				System.out.println("Digite o nome do produto: ");
			
				String nome = sc.nextLine().toLowerCase();
				
				System.out.println("Digite a Quantidade: ");
				int quantidade = sc.nextInt();
				
				System.out.println("Digite o Preço Unitario do produto: ");
				double precoUnitario = sc.nextDouble();
				
				list.add(new Produto(nome, quantidade, precoUnitario));
				
				System.out.println("Produto Cadastrado com Sucesso!!\n");
				break;
			case 2:
				System.out.println("Produtos Cadastrados no Estoque:\n");
				for(Produto p : list) {
					System.out.println(p);
				}
				System.out.println("\n");
				break;
			case 3:
				System.out.println("Digite o Nome do produto que deseja buscar: ");
				String buscaNome = sc.nextLine();
				
				for(Produto p : list) {
					if(p.getNome().equalsIgnoreCase(buscaNome)) {
						System.out.println(p + "\n");
						break;
					}
					else {
						System.out.println("Produto Não encontrado ou Não existe!\n");
						break;
					}
				}
				
				break;
			case 4:
				System.out.println("Digite o nome do Produto Selecionado: ");
				String busca = sc.nextLine();
				boolean encontrou = false;
				
					for(int i = 0 ; i < list.size();i++) {
						
						Produto p = list.get(i);
						
						if(p.getNome().equalsIgnoreCase(busca)) {
							encontrou = true;
							
							System.out.println("Voce vai retirar ou adicionar?(Entrada/Saida)");
							String opcoes = sc.next().toLowerCase();
							
							System.out.println("Digite a Quantidade: ");
							int qtd = sc.nextInt();
							sc.nextLine();
							
							if(opcoes.equalsIgnoreCase("entrada")) {
								p.setQuantidade(qtd + p.getQuantidade());
								System.out.println("Quantidade Atualizada! Nova Quantidade: " + p.getQuantidade());
							}
							
							else if(opcoes.equalsIgnoreCase("saida")) {
								if(p.getQuantidade() >= qtd) {
									p.setQuantidade(p.getQuantidade() - qtd);
									System.out.println("Quantidade Atualizada! Nova Quantidade:  " + p.getQuantidade());
								}
								else {
									System.out.println("Você não tem quantidade suficiente para realizar essa retirada!!");
								}
								
								
							}
							 else {
					                System.out.println("Opção inválida! Digite 'entrada' ou 'saida'.");
					            }
							
						
							
							break;
						}
						
					}
					
					if(!encontrou) {
						System.out.println("Produto não encontrado\n");
					}
					
					
				
				break;
			case 5:
				
				double total = 0;
				int qtdEstoque = 0;
				
					for(Produto p : list) {
						total += p.getQuantidade() * p.getPreco();
						qtdEstoque += p.getQuantidade();
					}
					
				System.out.println("Temos em Estoque " + qtdEstoque + " produtos");
				System.out.println("O valor total é $ " + total + "\n");
				
				break;
			default:
				program = false;
				System.out.println("Programa Encerrado!");
				break;
			}
		}

		sc.close();
	}

}

//Dia 18

//Você deverá criar um programa em Java que permita controlar o estoque de uma pequena loja.
//O programa deve oferecer ao usuário um menu com as seguintes opções:
//
//1 Cadastrar Produto
//
//O usuário informa o nome do produto, quantidade e preço unitário.
//
//O produto deve ser armazenado em uma lista (ArrayList).
//
//2 Listar Produtos
//
//Mostrar todos os produtos cadastrados com suas informações.
//
// 3 Buscar Produto pelo Nome
//
//O usuário informa um nome e o programa mostra as informações do produto (se encontrado).
//
// 4 Atualizar Quantidade
//
//O usuário informa o nome do produto e a nova quantidade.
//
// 5 Calcular Valor Total do Estoque
//
//Mostrar a soma de (quantidade × preço) de todos os produtos.
//
//Sair
//
//Finaliza o programa.