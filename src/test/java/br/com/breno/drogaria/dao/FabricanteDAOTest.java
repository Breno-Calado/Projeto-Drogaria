package br.com.breno.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.breno.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
	@Ignore
	public void salvar() {

		Fabricante fabricante = new Fabricante();
		fabricante.setDescricacao("Fornecedor de doflex");

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);

	}

	@Test
	@Ignore
	public void listar() {

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = fabricanteDAO.listar();

		System.out.println(resultado.size());

		for (Fabricante fabricante : resultado) {
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricacao());
		}
	}

	@Test
	public void buscar() {

		Long codigo = 2L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);

		if (fabricante != null) {
			System.out.println("Fabricante Encontrado: ");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricacao());
		}else {
			System.out.println("Fabricante não encontrado!");
		}
	}

}
