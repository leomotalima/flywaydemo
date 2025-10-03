package com.example.flywaydemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flywaydemo.model.Produto;
import com.example.flywaydemo.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Listar todos os produtos
    @GetMapping
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    // Buscar produto por ID
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return produtoRepository.findById(id)
                .map(produto -> ResponseEntity.ok().body(produto))
                .orElse(ResponseEntity.notFound().build());
    }

    // Criar novo produto
    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // Atualizar produto existente
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody Produto produtoDetalhes) {
        return produtoRepository.findById(id).map(produto -> {
            produto.setNome(produtoDetalhes.getNome());
            produto.setPreco(produtoDetalhes.getPreco());
            produto.setCategoria(produtoDetalhes.getCategoria());
            Produto atualizado = produtoRepository.save(produto);
            return ResponseEntity.ok(atualizado);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Deletar produto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
        return produtoRepository.findById(id).map(produto -> {
            produtoRepository.delete(produto);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
