package br.edu.unicesumar;

public class Motocicleta extends Veiculo {
	
	private int cilindradas;

	public Motocicleta(String renavam, String placa, int ano, String marcaEmodelo, int cilindradas) {
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
