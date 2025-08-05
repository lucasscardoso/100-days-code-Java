package desafio100Dias.example.desafio.produtos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import desafio100Dias.example.desafio.produtos.model.Produtos;
import desafio100Dias.example.desafio.produtos.repository.ProdutosRepository;

@Service
public class ProdutosService {

	private final ProdutosRepository repository;

	public ProdutosService(ProdutosRepository repository) {
		this.repository = repository;
	}
	
	public List<Produtos> listarTodos(){
		return repository.findAll();
	}
	
	public Produtos adicionar (Produtos produto) {
		return repository.save(produto);
	}
	
	public Produtos atualizar(Long id, Produtos produtoAtualizado) {
        return repository.findById(id).map(produto -> {
            produto.setNome(produtoAtualizado.getNome());
            produto.setPreco(produtoAtualizado.getPreco());
            return repository.save(produto);
        }).orElse(null);
    }

    public boolean deletar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
	
	
}
