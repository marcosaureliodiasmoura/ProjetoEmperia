package com.ertheia.emperia.model;

public enum Categoria {
	
	CERAMICA("Cerâmica"),
	PORTA("Porta"),
	CABEAMENTO("Cabeamento"),
	CIMENTO("Cimento"),
	ESTOFADO("Estofado"),
	ELÉTRICA("Elétrica");
	
	private String descricao;
	
	Categoria(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}


}
