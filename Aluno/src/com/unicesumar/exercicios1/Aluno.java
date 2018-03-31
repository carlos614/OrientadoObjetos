package com.unicesumar.exercicios1;

public class Aluno {
	
	private	int cpf;
    private String nome;
    private String ra;
    private String email;
	private String telefone;
	private String status;
	private String dataNascimento;
	
	
	

	
	
	
	public Aluno(int cpf, String nome, String ra, String email, String telefone, String status, String dataNascimento) {
		
		this.cpf = cpf;
		this.nome = nome;	
		this.ra = ra;
		this.email = email;
		this.telefone = telefone;
		this.status = status;
		this.dataNascimento = dataNascimento;
		
		
		
	}





	public int getCpf() {
		return cpf;
	}





	public void setCpf(int cpf) {
		this.cpf = cpf;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getRa() {
		return ra;
	}





	public void setRa(String ra) {
		this.ra = ra;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getTelefone() {
		return telefone;
	}





	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}





	public String getDataNascimento() {
		return dataNascimento;
	}





	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + " " + cpf;
	}
	
}
