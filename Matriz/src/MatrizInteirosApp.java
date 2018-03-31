
public class MatrizInteirosApp {
	
	public static void main (String[] args) {
		
		MatrizInteiros matriz = new MatrizInteiros(2, 2);
		
		matriz.carregarMatriz();
		
		matriz.exibirMatriz();
		
		
		System.out.println("A soma dos elementos da matriz é: " + matriz.calcularSoma());
		
		System.out.println("A média dos elementos da matriz é: " + matriz.calcularMedia());
		
		System.out.println("O maior elemento da matriz é: " + matriz.maior());
		
		System.out.println("O menor elemento da matriz é :" + matriz.menor());
		
		System.out.println("Quantidade de pares no elemento da matriz: " + matriz.qtdPares());
		
		System.out.println("Quantidade de impares no elemento de matriz: " + matriz.qtdImpares());
		
		
	}
	

}
