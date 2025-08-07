package com.desafio100Dias._a26.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.desafio100Dias._a26.demo.tarefas.model.Tarefa;
import com.desafio100Dias._a26.demo.tarefas.repository.TarefaRepository;

@Component
public class DataLoader implements CommandLineRunner{

	private final TarefaRepository repository;
	
	public DataLoader(TarefaRepository repository) {
		this.repository = repository;
	}

	
	@Override
	public void run(String... args) throws Exception {
		if(repository.count() == 0) {
			 repository.save(new Tarefa(null, "Estudar Java", "22/10/2025", false));
	            repository.save(new Tarefa(null, "Ler livro", "25/05/2026", false));
	            repository.save(new Tarefa(null, "Praticar API", "12/11/2025", true));
	            
		}
		
	}

	
}
