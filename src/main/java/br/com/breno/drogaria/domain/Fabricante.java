package br.com.breno.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Fabricante extends GenericDomain{
	
	@Column(nullable = false)
	private String descricacao;

	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}
	

}
