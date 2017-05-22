package br.com.breno.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.breno.drogaria.domain.Estado;

public class EstadoDAOTest {

	@Test
	@Ignore
	public void salvar() {

		Estado estado = new Estado();
		estado.setNome("Santa Catarina");
		estado.setSigla("SC");

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);

	}

	@Test
	@Ignore
	public void listar() {

		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();

		System.out.println("Total de registro encontrados: " + resultado.size());

		for (Estado estado : resultado) {
			System.out.println(estado.getNome() + " - " + estado.getSigla());
		}
	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 1L;

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if (estado != null){
			System.out.println("Registro encontrado: ");
			System.out.println(estado.getNome() + " - " + estado.getSigla());
		}else {
			System.out.println("Registro não encontrado");
		}

	}
	
	@Test
//	@Ignore
	public void excluir(){
		
		Long codigo = 8L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado != null){
			estadoDAO.excluir(estado);
			System.out.println("Registro Removido com sucesso: ");
			System.out.println(estado.getCodigo() + " - "  + estado.getNome() + " - " + estado.getSigla());
		}else{
			System.out.println("Registro não encontrado!");
		}
		
	}
	@Test
	@Ignore
	public void editar(){
		
		Long codigo = 9L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado != null){
			estado.setNome("Belo Horizonte");
			estado.setSigla("BH");
			estadoDAO.editar(estado);
			System.out.println("Registro alterado com sucesso");
		}else {
			System.out.println("Registro não encontrado!");
		}
		
	}

}
