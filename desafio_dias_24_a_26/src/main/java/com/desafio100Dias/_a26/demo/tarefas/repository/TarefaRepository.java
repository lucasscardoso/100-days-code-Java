package com.desafio100Dias._a26.demo.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio100Dias._a26.demo.tarefas.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
