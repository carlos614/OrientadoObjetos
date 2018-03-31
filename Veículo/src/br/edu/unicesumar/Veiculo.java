package br.edu.unicesumar;

public class Veiculo {
	
	protected int renavam;
	protected String placa;
	protected int ano;
	protected int marcaEmodelo;
	
	public Veiculo(int renavam, String placa, int ano, int marcaEmodelo) {
		super();
		this.renavam = renavam;
		this.placa = placa;
		this.ano = ano;
		this.marcaEmodelo = marcaEmodelo;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMarcaEmodelo() {
		return marcaEmodelo;
	}

	public void setMarcaEmodelo(int marcaEmodelo) {
		this.marcaEmodelo = marcaEmodelo;
	}
	

}
