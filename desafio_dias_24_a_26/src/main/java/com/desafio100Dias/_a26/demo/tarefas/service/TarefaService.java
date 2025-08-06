package com.desafio100Dias._a26.demo.tarefas.service;

import java.util.List;

import com.desafio100Dias._a26.demo.tarefas.model.Tarefa;
import com.desafio100Dias._a26.demo.tarefas.repository.TarefaRepository;

public class TarefaService {

	private final TarefaRepository repository;
	
	public TarefaService(TarefaRepository repository) {
		this.repository = repository;
	}

	public Tarefa salvar(Tarefa tarefa) {
		return repository.save(tarefa);
	}
	
	public List<Tarefa> listaTodas() {
		return repository.findAll();
	}
	
	public Tarefa buscaId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Tarefa com Id " + id + " não Localizada"));
	}
	
	public Tarefa alteraTarefa(Long id,Tarefa tarefaAtualizada) {
		return repository.findById(id).map(tarefa -> {
			
			tarefa.setTitulo(tarefaAtualizada.getTitulo());
			tarefa.setDataLimite(tarefaAtualizada.getDataLimite());
			tarefa.setConcluida(tarefaAtualizada.isConcluida());
			
			return repository.save(tarefa);
		}).orElseThrow( () -> new RuntimeException("Tarefa não atualizada, não foi localizada Tarefa com id: " + id));
		
		
	}
	
	public boolean deletar(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
