package br.edu.unicesumar;

public class Aluno {
	
private	String nome;
private	String sobrenome;
	
	public Aluno(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
public String getSobrenome() {
		
		return sobrenome;
	}
	public void setSobrenome(String s) {
		
		this.nome = s;
		
	}
	
	public String getNome() {
		
		return nome;
	}
	public void setNome(String n) {
		
		this.nome = n;
		
	}

}
