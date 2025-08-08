package com.desafio_dias_27_a_30.demo.cadastro.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.desafio_dias_27_a_30.demo.cadastro.model.Cadastro;
import com.desafio_dias_27_a_30.demo.cadastro.repository.CadastroRepository;

@Service
public class CadastroService {

	private final CadastroRepository repository;
	
	public CadastroService(CadastroRepository repository) {
		this.repository = repository;
	}
	
	public List<Cadastro> listaTodos(){
		return repository.findAll();
	}
	
	public Cadastro criaNovo(Cadastro c) {
		
		if(repository.findByEmail(c.getEmail()).isPresent()) {
			throw new RuntimeException("Email Já cadastrado!");
		}
		
		c.setDataCadastro(LocalDateTime.now());
		return repository.save(c);
	}
	
	public Cadastro editar(Long id, Cadastro c) {
		
		Cadastro cadastroExistente = repository.findById(id).
				orElseThrow(() -> new RuntimeException("Não existe nenhum cadastro com esse Id"));
	
		//para swagger
		if (c.getNome() != null && !c.getNome().isBlank() && !c.getNome().equalsIgnoreCase("string")) {
		    cadastroExistente.setNome(c.getNome());
		}
		
		if (c.getSenha() != null && !c.getSenha().isBlank() && !c.getSenha().equalsIgnoreCase("string")) {
			cadastroExistente.setSenha(c.getSenha());
		}
		if (c.getEmail() != null && !c.getEmail().isBlank() && !c.getEmail().equalsIgnoreCase("string")) {
			cadastroExistente.setEmail(c.getEmail());
		}
		
		
		
		return repository.save(cadastroExistente);
	}
	
	public void deletar(Long id) {
		Cadastro cadastroExistente = repository.findById(id).
				orElseThrow(() -> new RuntimeException("Não existe nenhum cadastro com esse Id" ));
		repository.delete(cadastroExistente);
	}
}
