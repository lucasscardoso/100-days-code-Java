package com.desafio_dias_27_a_30.demo.cadastro.service;

import com.desafio_dias_27_a_30.demo.cadastro.repository.CadastroRepository;

public class CadastroService {

	private CadastroRepository repository;
	

	public CadastroService() {}
	
	public CadastroService(CadastroRepository repository) {
		this.repository = repository;
	}
	
	
	
}
