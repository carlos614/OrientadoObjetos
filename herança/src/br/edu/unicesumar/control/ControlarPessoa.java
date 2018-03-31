package br.edu.unicesumar.control;

import java.util.ArrayList;
import br.edu.unicesumar.model.Pessoa;

public class ControlarPessoa {
	
	private ArrayList<Pessoa> lista;
	
	
	public ControlarPessoa() {
		
		lista = new ArrayList<Pessoa>();
	}
	
	public void inserir(Pessoa p) {
		
		lista.add(p);
	}
	
	public void exibir() {
		
		if(lista != null && lista.size() > 0) {		
		
	//for each.. percorrer a lista sem índice
		
	for(Pessoa p : lista) {
		
	}///
  }else
	  System.out.println("lista vazia!!");
	}
	//excluirrr.....
	public void excluir(String nome ) {
		
		if(lista == null && lista.size() > 0) {
		
		
		for(Pessoa p: lista) {
			if(p.getNome().equals(nome)) {
			
			lista.remove(p);
			
		}
		
	}
 }	
}	
}	
	
	