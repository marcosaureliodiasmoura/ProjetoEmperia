package com.ertheia.emperia.model;

public enum Fabricacao {
	
	NACIONAL("Nacional"),
	INTERNACIONAL("Internacional");
	
	private String descricao;
	
	Fabricacao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}

}
