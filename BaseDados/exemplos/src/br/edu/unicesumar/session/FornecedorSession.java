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
				
		//Verificar se um Fornecedor com o mesmo CNPJ já existe
		//Implementar método obterPorCnpj(int cnpj)
		
		//Chamar método da DAO, se... Fornecedor não existir
		dao.inserir(f);
	}
	
	public List<Fornecedor> listarTodos() {
		//Verificar se atributos foram informados
				
		//Verificar se um Fornecedor com o mesmo CNPJ já existe
		//Implementar método obterPorCnpj(int cnpj)
		
		//Chamar método da DAO, se... Fornecedor não existir
		return dao.listarTodos();
	}

}
