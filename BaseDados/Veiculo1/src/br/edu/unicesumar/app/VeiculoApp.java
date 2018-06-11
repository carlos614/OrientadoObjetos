package br.edu.unicesumar.app;

import java.util.List;

import br.edu.unicesumar.Veiculo;
import br.unicesumar.session.VeiculoSession;

public class VeiculoApp {
	
	public static void main(String[] args) {
		//Criar e instanciar um objeto Fornecedor
		Veiculo v = new Veiculo("3212", "123raw", 2011, "VOLKSJETTA");
		
		//Criar e instanciar um objeto FornecedorSession
		VeiculoSession session = new VeiculoSession();
		
		
		//Invocar o método inserirFornecedor
		session.inserirVeiculo(v);
		
		List<Veiculo> lista = session.listarTodos();
		
		for(Veiculo x : lista){
			System.out.println("Renavam: " + x.getRenavam());
			System.out.println("Placa: " + x.getPlaca());	
		
		
		}
	}

}
