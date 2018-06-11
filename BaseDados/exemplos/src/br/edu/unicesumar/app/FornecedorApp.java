package br.edu.unicesumar.app;

import java.util.List;

import br.edu.unicesumar.model.Fornecedor;
import br.edu.unicesumar.session.FornecedorSession;


public class FornecedorApp {

	public static void main(String[] args) {
		//Criar e instanciar um objeto Fornecedor
		Fornecedor f = new Fornecedor(4323, "Unicesumar", "Centro Universitario", true);
		
		//Criar e instanciar um objeto FornecedorSession
		FornecedorSession session = new FornecedorSession();
		
		
		//Invocar o método inserirFornecedor
		session.inserirFornecedor(f);
		
		List<Fornecedor> lista = session.listarTodos();
		
		for(Fornecedor x : lista){
			System.out.println("CNPJ: " + x.getCnpj());
			System.out.println("Nome Fantasia: " + x.getNomeFantasia());
		}
	}
}
