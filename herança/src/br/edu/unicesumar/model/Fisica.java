package br.edu.unicesumar.model;

public class Fisica extends Pessoa {
	
	
	private int cpf;
	private int rg;
	
	
	public Fisica(String nome,
				  String endereço,
				  int telefone,
				  int cpf,
				  int rg) {
		super(nome, endereço, telefone);
		this.cpf = cpf;
		this.rg = rg;
		
		
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getRg() {
		return rg;
	}


	public void setRg(int rg) {
		this.rg = rg;
	}
	
	
	
	
	
	
		
		
		
		
	}


