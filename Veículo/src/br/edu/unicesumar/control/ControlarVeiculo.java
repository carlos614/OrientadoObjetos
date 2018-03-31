package br.edu.unicesumar.control;

import java.util.ArrayList;

public class ControlarVeiculo<Veiculo> {
	
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
	
	public void excluir(String placa ) {
		
		for(Veiculo v : lista) {
			
			if(v.getPlaca().equals(placa)) {
				
				lista.remove(v);
			}
			
		}
	}
}
	
	
