package com.ertheia.emperia.model;

public enum Tipo {
	
	CASA("Casa"),
	PISCINA("Piscina"),
	REDEELETRICA("Rede Elétrica"),
	DESIGN("Designer");
	
	private String descricao;
	
	Tipo(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}

}
