package br.com.breno.drogaria.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/*
 * Anotação em Hibernate para informar que essa classe não vai ser mapeada. Porém que esse POJO vai servir 
 * para criar outras tabelas
 * */

@SuppressWarnings("serial")
@MappedSuperclass
public class GenericDomain implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  //abre e fecha o parentese pois essa anotação recebe um a propiedade
	private Long codigo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
