package br.edu.unicesumar;

public class Motocicleta extends Veiculo {
	
	private int cilindradas;

	public Motocicleta(int renavam, String placa, int ano, int marcaEmodelo, int cilindradas) {
		super(renavam, placa, ano, marcaEmodelo);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

}
