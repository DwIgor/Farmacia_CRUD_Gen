package org.generation.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_produto;
	
	 @NotNull(message = "O atributo titulo é obrigatório.")
	 @Size(min = 5, max = 100,  message = "O nome deve conter no mínimo 5 e no máximo 100 caracteres")
	 private String titulo;

	 @NotNull(message = "O atributo substancia é obrigatório.")
	 @Size(min = 5, max = 100, message = "A substancia deve conter no mínimo 5 e no máximo 100 caracteres")
	 private String Substancia;
	 
	 @NotNull(message = "O atributo fabricante é obrigatório.")
	 @Size(min = 5, max = 100, message = "O fabricante deve conter no mínimo 5 e no máximo 100 caracteres")
	 private String Fabricante;
	
	@Range(min = 0)
	private float preco;
	
	@ManyToOne
	@JsonIgnoreProperties ("produto")
	 private Categoria categoria;

	public long getId_produto() {
		return id_produto;
	}

	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubstancia() {
		return Substancia;
	}

	public void setSubstancia(String substancia) {
		Substancia = substancia;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}

	