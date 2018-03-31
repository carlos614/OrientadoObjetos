package com.yourcode.www;

public class ControlarCliente {
	
	public float calcularMedia(Cliente vetor[]) {
		
		float resultado =0 ;
			for(int i=0; i<vetor.length; i++) 
				resultado +=vetor[i].getSalario();
			return resultado (vetor.length);
			
	}

	private float resultado(int length) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Cliente clienteMaisVelho(Cliente vetor[]) {
		
		Cliente velho = vetor[0];
			for(int i=0; i<vetor.length;i++)
				if(velho.getNome()<vetor[i].getIdade())
					velho = vetor[i];
				return velho;
	}
	public Cliente maiorSalario(Cliente vetor[]) {
		
		Cliente salario = vetor[0];
			for(int x=0; x<vetor.length; x++)
				if(salario.getSalario1()<vetor[x].getSalario())
					salario = vetor[x];
			return salario;
	}
		
		
		
		
	}


