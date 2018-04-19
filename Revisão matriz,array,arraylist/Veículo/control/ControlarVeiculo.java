package br.edu.unicesumar.control;

import java.util.ArrayList;
import br.edu.unicesumar.Veiculo;

public class ControlarVeiculo {
	
	private ArrayList<Veiculo> lista;
	
	public ControlarVeiculo() {
		
		lista = new ArrayList<Veiculo>();
		
	}
	
	public void inserir (Veiculo v) {
		
		lista.add(v);
	}
	public void exibir () {
		
		if(lista != null && lista.size() > 0){
			
			for(Veiculo v : lista) {
				
			
		}
	}else
		System.out.println("Lista vazia!! ");
}
	
	public void excluir(String renavam ) {
		
		if(lista == null && lista.size() > 0) {
		
		for(Veiculo v : lista) {
			
			if(v.getRenavam().equals(renavam)) {
				
				lista.remove(v);
			}

		}
	   }
	  }//fim do metodo excluir
	
	public void pesquisar(String placa) {
		
		for(Veiculo p : lista) {
			if(p.getPlaca().equals(placa)) {
				
				System.out.println(p.getPlaca());				
			}
		}
      }//fim do metodo pesquisar

    }	
