package desafio100Dias.example.desafio.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio100Dias.example.desafio.produtos.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	
}
