package br.edu.unicesumar.model;

public class Pessoa {
	
	 protected String  nome;
	 protected String enderešo;
	 protected int telefone;
	
	
	public Pessoa(String nome, String enderešo, int telefone) {
		
		
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;

		
		
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEnderešo() {
		return enderešo;
	}


	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	

}
