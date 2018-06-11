package br.unicesumar.session;

import java.util.List;

import br.edu.unicesumar.Veiculo;
import br.unicesumar.dao.VeiculoDAO;

public class VeiculoSession {
	
	private VeiculoDAO dao;
	
	public VeiculoSession() {
		dao = new VeiculoDAO();	
	}
	
	public void inserirVeiculo(Veiculo v) {
		
		dao.inserir(v);
	}
	public List<Veiculo> listarTodos(){

		return dao.listarTodos();
	}
	public void alterarVeiculo(Veiculo v) {
		dao.alterar(v);
		
	}
}