package com.desafio_dias_27_a_30.demo.cadastro.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cadastro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(accessMode = Schema.AccessMode.READ_ONLY)
	private Long id;
	private String nome;
	@Column(unique = true, nullable = false)
	private String email;
	private String senha;
	@Schema(accessMode = Schema.AccessMode.READ_ONLY)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime dataCadastro;
	
	public Cadastro() {}
	
	public Cadastro(Long id, String nome, String email, String senha, LocalDateTime dataCadastro) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataCadastro = dataCadastro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime localDateTime) {
		this.dataCadastro = localDateTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return Objects.equals(email, other.email);
	}
	
	
	
	
}
