package desafioDia16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import desafioDia16.Prioridades.Prioridade;

public class Dia16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Tarefa> list = new ArrayList<Tarefa>();
		
		boolean continua = true;
		
		
		
		
		
		while(continua) {
			
			System.out.println("1 - Adicionar Tarefa\r\n"
					+ "2 - Listar Todas as Tarefas\r\n"
					+ "3 - Listar Tarefas de Alta Prioridade\r\n"
					+ "4 - Ordenar Tarefas por Prioridade\r\n"
					+ "0 - Sair\nEscolha uma Opção: ");
			
			int escolha = sc.nextInt();
			
			
			switch(escolha) {
				
			case 1 :
				System.out.println("Digite a Descrição da Tarefa: ");
				sc.nextLine();
				String nomeTarefa = sc.nextLine();
				
				 Prioridade prioridade = null;
				    while (prioridade == null) {
				        System.out.print("Digite a prioridade (ALTA, MEDIA, BAIXA): ");
				        String input = sc.nextLine().toUpperCase();

				        try {
				            prioridade = Prioridade.valueOf(input);
				        } catch (IllegalArgumentException e) {
				            System.out.println("Prioridade inválida. Tente novamente.");
				        }
				    }
				
				list.add(new Tarefa(nomeTarefa,prioridade));
				System.out.println("Tarefa adicionada com sucesso!");
				break;
				
			case 2 :
				
				for(Tarefa t : list) {
					System.out.println(t);
				}
				System.out.println();
				break;
				
			case 3 :
				
				for(Tarefa t : list) {
					if(t.getPrioridade() == Prioridade.ALTA ) {
						System.out.println(t);
					}
				}
				System.out.println();
				break;
			case 4 :
				 list.sort((t1, t2) -> Integer.compare(t1.getPrioridade().getOrdem(), t2.getPrioridade().getOrdem()));
				    System.out.println("Tarefas ordenadas por prioridade:");
				    for (Tarefa t : list) {
				        System.out.println("- " + t);
				    }
				break;
			default :
				continua = false;
				break;
			
			}
		}

	}

}

//Descrição:
//
//Crie um programa em Java que funcione como um simples gerenciador de tarefas. Ele deve permitir que o usuário:
//
//Adicione tarefas com prioridade (Alta, Média ou Baixa).
//
//Liste todas as tarefas cadastradas.
//
//Liste apenas as tarefas com prioridade Alta.
//
//Ordene as tarefas por prioridade (Alta > Média > Baixa).
//
//Saia do programa.
//
//Regras:
//Use uma classe Tarefa com descricao e prioridade.
//
//Use ArrayList<Tarefa> para armazenar as tarefas.
//
//O programa deve exibir um menu até o usuário escolher sair.