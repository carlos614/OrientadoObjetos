package br.edu.unicesumar;

public class Caminhao extends Veiculo{
	
	private int peso;

	public Caminhao(int renavam, String placa, int ano, int marcaEmodelo, int peso) {
		super(renavam, placa, ano, marcaEmodelo);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
