package com.desafio_dias_27_a_30.demo.cadastro.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio_dias_27_a_30.demo.cadastro.model.Cadastro;
import com.desafio_dias_27_a_30.demo.cadastro.service.CadastroService;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController {

	private CadastroService service;
	
	
	
	public CadastroController(CadastroService service) {
		this.service = service;
	}



	@PostMapping
	@Operation(summary = "Criar", description = "cria um novo cadastro")
	public ResponseEntity<Cadastro> criar(@RequestBody Cadastro c) {
		Cadastro novoCadastro = service.criaNovo(c);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoCadastro);
	}
	
	@GetMapping
	@Operation(summary = "Listar todos os Cadastros", description = "Lista todos os cadastros")
	public List<Cadastro> listaTudo(){
		return service.listaTodos();
	}
	
	@PutMapping("/{id}")
	@Operation(summary = "Editar Cadastro", description = "Edita o cadastro")
	public ResponseEntity<Cadastro> editar(@PathVariable Long id,  @RequestBody Cadastro c) {
	    Cadastro atualizado = service.editar(id, c);
	    return ResponseEntity.ok(atualizado);
	}
	
	@DeleteMapping("/{id}")
	@Operation(summary = "Deleta Cadastro", description = "Deleta o cadastro")
	public ResponseEntity<Cadastro> deletar(@PathVariable Long id){
		service.deletar(id);
		return  ResponseEntity.noContent().build();
	}
	
}
