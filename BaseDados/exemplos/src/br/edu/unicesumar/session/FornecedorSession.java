package br.edu.unicesumar.session;

import java.util.List;

import br.edu.unicesumar.dao.FornecedorDAO;
import br.edu.unicesumar.model.Fornecedor;

public class FornecedorSession {
	
private FornecedorDAO dao;
	
	public FornecedorSession() {
		dao = new FornecedorDAO();
	}
	
	public void inserirFornecedor(Fornecedor f) {
		//Verificar se atributos foram informados
				
		//Verificar se um Fornecedor com o mesmo CNPJ j� existe
		//Implementar m�todo obterPorCnpj(int cnpj)
		
		//Chamar m�todo da DAO, se... Fornecedor n�o existir
		dao.inserir(f);
	}
	
	public List<Fornecedor> listarTodos() {
		//Verificar se atributos foram informados
				
		//Verificar se um Fornecedor com o mesmo CNPJ j� existe
		//Implementar m�todo obterPorCnpj(int cnpj)
		
		//Chamar m�todo da DAO, se... Fornecedor n�o existir
		return dao.listarTodos();
	}

}
