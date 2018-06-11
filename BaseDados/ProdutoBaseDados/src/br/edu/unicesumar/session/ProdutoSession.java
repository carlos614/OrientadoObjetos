package br.edu.unicesumar.session;

import br.edu.unicesumar.dao.ProdutoDAO;
import java.util.List;

import br.edu.unicesumar.Produto;

public class ProdutoSession {
	
	private ProdutoDAO dao;
	
	public ProdutoSession() {
		
		dao = new ProdutoDAO();
	}
	
	public void inserirProduto(Produto p) {
		
		dao.inserir(p);
	}
	
	public List<Produto> listarTodos(){
		
		return dao.listarTodos();
	}
	
	public void alterarProduto (Produto p) {
		
		dao.alterar(p);
	}
}
