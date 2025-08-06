package desafio100Dias.example.desafio.produtos.controller;

import desafio100Dias.example.desafio.produtos.model.Produtos;
import desafio100Dias.example.desafio.produtos.service.ProdutosService;
import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    private final ProdutosService service;

    public ProdutosController(ProdutosService service) {
        this.service = service;
    }
    
    @Operation(summary = "Lista todos os produtos", description = "Retorna uma lista com todos os produtos cadastrados")
    @GetMapping
    public List<Produtos> listar() {
        return service.listarTodos();
    }

    @Operation(summary = "Adiciona um novo produto")
    @PostMapping
    public Produtos adicionar(@RequestBody Produtos produto) {
    	produto.setId(null);
    	return service.adicionar(produto);
    }

    @Operation(summary = "atualiza")
    @PutMapping("/{id}")
    public Produtos atualizar(@PathVariable Long id, @RequestBody Produtos produto) {
        return service.atualizar(id, produto);
    }
    
    @Operation(summary = "busca", description = "Retorna o Produto Buscando por ID")
    @GetMapping("/{id}")
    public ResponseEntity<Produtos> busca(@PathVariable Long id) {
        Produtos produto = service.buscar(id);
        return ResponseEntity.ok(produto);
        
    }

    @Operation(summary = "Deleta Produto com Id")
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        return service.deletar(id) ? "Produto removido com sucesso!" : "Produto não encontrado!";
    }
}
