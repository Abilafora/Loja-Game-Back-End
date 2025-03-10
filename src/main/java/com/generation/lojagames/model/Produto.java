package com.generation.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")

public class Produto {
	
	    
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;
		
		@NotBlank(message = "O atributo nome é Obrigatório!") 
		@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
		private String nome;
		
		@NotBlank(message = "O atributo descrição é obrigatório!")
		@Size(min = 10, max = 1000, message = "O atributo descrição deve conter no mínimo 10 e no máximo 1000 caracteres")
		private String descricao;
		
		
		 @Min(value = 1, message = "O atributo quantidade de estoque deve ser no mínimo 1")
		 @Max(value = 1000, message = "O atributo quantidade de estoque deve ser no máximo 1000")
		private int quantidadeEstoque ;
		 
		 @ManyToOne
		 @JsonIgnoreProperties("produto")
		 private Categoria categoria;


		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
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

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public int getQuantidadeEstoque() {
			return quantidadeEstoque;
		}

		public void setQuantidadeEstoque(int quantidadeEstoque) {
			this.quantidadeEstoque = quantidadeEstoque;
		}
		

}
