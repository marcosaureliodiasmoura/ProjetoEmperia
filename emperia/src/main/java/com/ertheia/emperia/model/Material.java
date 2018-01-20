package com.ertheia.emperia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "material")
public class Material {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@NotBlank(message = "O Campo Nome é Obrigatório")
	private String nome;
	
	@NotBlank(message = "O Campo Marca é Obrigatório")
	private String marca;
	
	@NotBlank(message = "O Campo Modelo é Obrigatório")
	private String modelo;
	
	@NotBlank(message = "O Campo descricao é Obrigatório")
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	@Enumerated(EnumType.STRING)
	private Fabricacao fabricacao;
	
	@DecimalMin(value ="0.50", message = "O Valor da cerveja deve ser maior que R$ 0,50")
	@DecimalMax(value ="9999999.99", message = "O valor da cerveja deve ser menor que R$ 9.999.999,99")
	private BigDecimal valor;

	@DecimalMax(value="100.0", message = "A Comissão deve ser igual ou menor que 100")
	private BigDecimal comissao;
	
	@Max(value=9999, message = "A Quantidade em estoque deve ser menor que 9.999")
	private Integer estoque;

	
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Fabricacao getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Fabricacao fabricacao) {
		this.fabricacao = fabricacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getComissao() {
		return comissao;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Material other = (Material) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
	
	

}
