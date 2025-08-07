# Lista de Exercicios

### Dia 1:
 - Imprima todos os múltiplos de 3, entre 1 e 100.
### Dia 2:
 - Imprima os fatoriais de 1 a 10.
### Dia 3:
 - Imprima a soma de 1 até 1000.
### Dia 4:
 - Crie uma calculadora de IMC.
### Dia 5:
 - Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde      trabalha, seu salário(double), a data de entrada no banco (String) e seu RG (String).
 Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método recebeAumento que aumenta o salario do funcionário de acordo com o parâmetro passado como argumento. 
Crie também um método calculaGanhoAnual, que não recebe parâmetro algum, devolvendo o valor do salário multiplicado por 12.
### Dia 6:
 - Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método estaAberta para verificar se ela está aberta.

### Dia 7:
 - Escreva um programa em Java que peça ao usuário: Um número inteiro N para calcular a tabuada.
Um número inteiro I indicando o início do intervalo.
Um número inteiro F indicando o fim do intervalo.
O programa deve validar que I < F.
Depois, mostre a tabuada do número N apenas no intervalo de I até F.
### Dia 8:
 - Crie um programa em Java que pergunte ao usuário quantos números ele quer digitar, leia todos esses números e calcule a média aritmética deles.
Ao final, exiba:
A lista dos números digitados.
A soma total.
A média aritmética.
### Dia 9:
 - Escreva um programa em Java que leia um número inteiro positivo n do usuário e exiba no console:
 O quadrado de n
 O cubo de n
 A raiz quadrada de n (com 2 casas decimais)
 Além disso, o programa deve verificar:
 Se n é par ou ímpar.
 Se n é um número primo.
### Dia 10:
 - Escreva um programa em Java que:
Leia um número inteiro positivo N.
Calcule a soma dos N primeiros números ímpares.
Mostre também a lista desses números ímpares.

### Dia 11:
 - Exercício: Jogo de Adivinhação com Dicas
Escreva um programa que:
Sorteie um número inteiro aleatório entre 1 e 50.
Peça ao usuário para tentar adivinhar o número.
Enquanto o usuário não acertar:
Se o palpite for menor que o número sorteado, exiba a mensagem:"O número é maior que isso."
Se o palpite for maior que o número sorteado, exiba a mensagem:"O número é menor que isso."
Quando o usuário acertar, exiba:"Parabéns! Você acertou o número em X tentativas!"

	Requisitos:
	Use uma estrutura de repetição (while ou do..while) para continuar perguntando até acertar.
	Use uma variável para contar o número de tentativas.
	Utilize uma função ou biblioteca para gerar números aleatórios (por exemplo, Math.random() em JavaScript ou Random em Java/Python).

### Dia 12:
 - Exercício: Analisador de Notas de Alunos
Um professor precisa de um programa que leia as notas de N alunos de uma turma e analise os seguintes pontos:

	Qual foi a maior nota?
	Qual foi a menor nota?
	Qual foi a média da turma?
	Quantos alunos ficaram acima da média?

	O programa deve solicitar ao usuário a quantidade de alunos (N), depois ler as notas de cada um (números decimais), realizar os cálculos e exibir os resultados ao final.

	Requisitos:
	Ler um número inteiro N (>0).
	Criar um array para armazenar as N notas.
	Ler as notas com um for.
	Calcular maior, menor e média das notas.
	Contar quantos alunos tiveram nota maior ou igual à média.
	Imprimir os resultados de forma clara.

### Dia 13:
 - Um número mágico é um número inteiro positivo cuja soma de dígitos é igual a 7.
	 Por exemplo: 43 é mágico (4 + 3 = 7), e 52 também é mágico (5 + 2 = 7).
	 Tarefa:
	 Escreva um programa em Java que:
	 Peça ao usuário para informar um número inteiro positivo N (maior que 0).
	 Gere os N primeiros números mágicos e os armazene em um array.
	 Exiba na tela os números mágicos encontrados, em ordem crescente.
	 Desafio adicional (opcional):
	 Implemente o código de forma que os números mágicos sejam armazenados em um    ArrayList< Integer >, e só depois copiados para um array.

### Dia 14:
 - Exercício: Análise de Temperaturas Mensais
 Escreva um programa em Java que:
 Peça ao usuário para informar a temperatura média de cada mês do ano (12 valores).
 Calcule:
 A média anual de temperatura.
 Quais meses ficaram com a temperatura acima da média anual.
 Mostre o nome do mês e o valor da temperatura acima da média.
 Requisitos Técnicos:
 Utilizar arrays para armazenar as temperaturas e os nomes dos meses.
 Utilizar Scanner para entrada de dados.
 Utilizar for e if para percorrer e comparar os dados.
 
### Dia 15:
 -  Exercício: Sistema de Controle de Estoque Simples
 Você deve criar um programa que simule o controle de um pequeno estoque de produtos. O sistema deve permitir:
 
	Cadastrar produtos (nome, quantidade e preço unitário).
	Listar todos os produtos cadastrados.
	Buscar um produto pelo nome.
	Atualizar a quantidade de um produto (entrada e saída).
	Calcular o valor total em estoque.

	Requisitos Técnicos:
	Utilize ArrayList para armazenar os produtos.
	Crie uma classe Produto com os atributos: nome, quantidade e preco.
	Use Scanner para interagir com o usuário via console.
	Use estruturas como switch, loop while, e if.
### Dia 16:
 - Crie um programa em Java que funcione como um simples gerenciador de tarefas. Ele deve permitir que o usuário:

	Adicione tarefas com prioridade (Alta, Média ou Baixa).
	Liste todas as tarefas cadastradas.
	Liste apenas as tarefas com prioridade Alta.
	Ordene as tarefas por prioridade (Alta > Média > Baixa).
	Saia do programa.

	Regras:
	Use uma classe Tarefa com descricao e prioridade.
	Use ArrayList< Tarefa > para armazenar as tarefas.
	O programa deve exibir um menu até o usuário escolher sair.
### Dia 17:
 - Crie um programa que receba uma frase digitada pelo usuário e:
   Mostre quantas palavras únicas existem.
   Mostre quantas vezes cada palavra aparece.
   Mostre as palavras ordenadas da mais frequente para a menos frequente.
### Dia 18:
 - Você deverá criar um programa em Java que permita controlar o estoque de uma pequena loja.
O programa deve oferecer ao usuário um menu com as seguintes opções:

	1 - Cadastrar Produto
	O usuário informa o nome do produto, quantidade e preço unitário.
	O produto deve ser armazenado em uma lista (ArrayList).

	2 - Listar Produtos
	Mostrar todos os produtos cadastrados com suas informações.

	3 - Buscar Produto pelo Nome
	O usuário informa um nome e o programa mostra as informações do produto (se encontrado).

	4 - Atualizar Quantidade
	O usuário informa o nome do produto e a nova quantidade.

	5 - Calcular Valor Total do Estoque
	Mostrar a soma de (quantidade × preço) de todos os produtos.

	Sair

	Finaliza o programa.

### Dia 19:
 - Exercício – Jogo da Senha Secreta
Crie um programa que gere automaticamente uma senha secreta com 4 números aleatórios entre 0 e 9 (ex.: 5 3 8 1).
O usuário terá 5 tentativas para adivinhar a senha.

	Regras:

	A cada tentativa, o usuário digita 4 números.
	O programa deve informar:

	Quantos números estão corretos e na posição certa.
	Quantos números estão corretos, mas na posição errada.
	Se o usuário acertar os 4 números na posição correta, ele vence e o jogo termina.
	Se errar nas 5 tentativas, o programa revela a senha.
### Dia 20:
 - Exercício — Caixa Eletrônico Simples
Crie um programa em Java que simule um caixa eletrônico com as seguintes funcionalidades:

	O saldo inicial da conta é R$ 1.000,00.
	O programa deve exibir um menu para o usuário:

	```1 - Consultar Saldo```
	```2 - Depositar```
	```3 - Sacar```
	```0 - Sair```
### Dia 21 a 23:
		- Desenvolvimento de API de produtos, um CRUD simples, foi implementado swagger para facilitar testes.
		
### Dia 24 a 26:
		- Desenvolvimento de API de ToDo List, um CRUD simples, foi implementado swagger para facilitar testes.
### Dia 27 a 30:
		- Desenvolvimento de API de Usuário com autenticação básica (Sem JWT), um CRUD simples, foi implementado swagger para facilitar testes.
 