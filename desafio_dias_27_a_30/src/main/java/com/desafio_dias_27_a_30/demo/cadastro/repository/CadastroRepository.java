package com.desafio_dias_27_a_30.demo.cadastro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio_dias_27_a_30.demo.cadastro.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long>{

	Optional<Cadastro> findByEmail(String email);
}
