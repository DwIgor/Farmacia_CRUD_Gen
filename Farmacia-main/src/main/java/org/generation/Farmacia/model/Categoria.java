package org.generation.Farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
		  
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private long id;

		    @NotNull(message = "O atributo titulo é obrigatório.")
		    @Size(min = 5, max = 100,  message = "O titulo deve conter no mínimo 5 e no máximo 100 caracteres")
		    private String titulo;

		    @NotNull(message = "O atributo descricao é obrigatório.")
		    @Size(min = 5, max = 100, message = "A descrição deve conter no mínimo 5 e no máximo 100 caracteres")
		    private String descricao;

		    @OneToMany (mappedBy = "categoria", cascade = CascadeType.ALL)
			@JsonIgnoreProperties("categoria") //obs:one to many model<->repository //evitar recursividade
			private List<Produto> produto;

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getTitulo() {
				return titulo;
			}

			public void setTitulo(String titulo) {
				this.titulo = titulo;
			}

			public String getDescricao() {
				return descricao;
			}

			public void setDescricao(String descricao) {
				this.descricao = descricao;
			}

			public List<Produto> getProduto() {
				return produto;
			}

			public void setProduto(List<Produto> produto) {
				this.produto = produto;
			}

		    
		    
		    
}
