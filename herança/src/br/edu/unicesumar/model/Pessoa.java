package br.edu.unicesumar.model;

public class Pessoa {
	
	 protected String  nome;
	 protected String endere�o;
	 protected int telefone;
	
	
	public Pessoa(String nome, String endere�o, int telefone) {
		
		
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;

		
		
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndere�o() {
		return endere�o;
	}


	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	

}
