package br.edu.unicesumar;

public class Veiculo {
	
	private String renavam;
	private String placa;
	private int ano;
	private String marcaEmodelo;
	
	public Veiculo(String renavam, String placa, int ano, String marcaEmodelo) {
		super();
		this.renavam = renavam;
		this.placa = placa;
		this.ano = ano;
		this.marcaEmodelo = marcaEmodelo;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
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

	public String getMarcaEmodelo() {
		return marcaEmodelo;
	}

	public void setMarcaEmodelo(String marcaEmodelo) {
		this.marcaEmodelo = marcaEmodelo;
	}

}
