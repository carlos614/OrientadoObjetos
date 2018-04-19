package br.edu.unicesumar;

public class Automovel extends Veiculo {
	
	private int cavalos;

	public Automovel(String renavam, String placa, int ano, String marcaEmodelo, int cavalos) {
		super(renavam, placa, ano, marcaEmodelo);
		this.cavalos = cavalos;
	}

	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}


}
