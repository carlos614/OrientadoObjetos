package br.edu.unicesumar.model;

public class Juridica extends Pessoa {
	
	private int cnpj;
	private String razaoSocial;
	private int ie;
	
	
	public Juridica(String nome,
			String endereço,
			int telefone,
			int cnpj,
			String razaoSocial,
			int ie) {
		super(nome, endereço, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.ie = ie;
	}


	public int getCnpj() {
		return cnpj;
	}


	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public int getIe() {
		return ie;
	}


	public void setIe(int ie) {
		this.ie = ie;
	}
	
	
	
		
	}
	


