package com.desafio100Dias._a26.demo.tarefas.controller;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio100Dias._a26.demo.tarefas.model.Tarefa;
import com.desafio100Dias._a26.demo.tarefas.service.TarefaService;

import io.swagger.v3.oas.annotations.Operation;





@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	private TarefaService service;

	public TarefaController(TarefaService service) {
		this.service = service;
	}
	
	@Operation(summary = "Lista Tudo", description = "Retorna Todas as Tarefas")
	@GetMapping
	public List<Tarefa> listaTudo(){
		return service.listaTodas();
	}
	
	@Operation(summary = "Edita Uma Tarefa", description = "Edita a tarefa por ID")
	@PutMapping("/{id}")
	public Tarefa editarTarefa(@PathVariable Long id,  @RequestBody Tarefa tarefa) {
		return service.alteraTarefa(id, tarefa);
		
	}
	
	@Operation(summary = "Salvar Tarefa", description = "Cria Uma nova Tarefa")
	@PostMapping
	public Tarefa salvarTarefa(@RequestBody Tarefa tarefa){
		tarefa.setId(null);
		return service.salvar(tarefa);
	}
	
	@Operation(summary = "Deletar Tarefa", description = "Deleta Uma Tarefa")
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Long id) {
		
		return service.deletar(id) ? "Tarefa Removida com Sucesso!" : "Tarefa Não Localizada com esse Id!";
	}
	
}
