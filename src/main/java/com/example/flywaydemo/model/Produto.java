package com.example.flywaydemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;

	    private Double preco;

	    private Integer quantidade;

	    // campo que será adicionado na V2__Add_category_to_products.sql
	    private String categoria;

	    // Construtores
	    public Produto() {}

		
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

		
		public Double getPreco() {
			return preco;
		}

		
		public void setPreco(Double preco) {
			this.preco = preco;
		}

		
		public Integer getQuantidade() {
			return quantidade;
		}

		
		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public String getCategoria() {
			return categoria;
		}

		
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
	    
	
}

