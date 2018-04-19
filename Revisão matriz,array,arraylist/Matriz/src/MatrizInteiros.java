import java.util.Scanner;

public class MatrizInteiros {
	
	private int matriz[][];
	private int linhas;
	private int colunas;
	
	
	//Construtor que inicializa a matriz com determinado tamanho
	
	public MatrizInteiros(int linhas, int colunas){
		this.linhas = linhas;
		this.colunas = colunas;
		
		matriz = new int[linhas][colunas];
	}
	
	//Exibir conteudo da Matriz
	
	public void exibirMatriz(){
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				System.out.println("Matriz = " + matriz[i][j]);
			}
		}
			
	}
	
	//carregar matriz
	
	public void carregarMatriz(){
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				System.out.println("Digite = ");
				matriz[i][j] = scan.nextInt();
			}
		}
	}
	
	//calcular SOMA
	public int calcularSoma(){
		int soma = 0;
		
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				soma+= matriz[i][j];
			}
		}
		
		
		return soma;		
	}
	
	//calcular média
	public float calcularMedia(){
		
float media = 0;
		
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				media =  matriz[i][j] /2;
			}
		}
		
		
		return media;		
		
	}
	
	public int maior(){
		
		
int maior = 0;
		
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				if(maior < matriz[i][j]) {
					maior = matriz[i][j];
					
				}
					
					
					
			}
		}
		
		
		return maior;		
	}
	
	public int menor(){
		
		
int menor = 0;
		
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				if(menor > matriz[i][j]) {
				 		menor = matriz[i][j];
					
				}
			}
		}
		
		
		return menor;		
		
	}
	
	public int qtdPares(){
		
int pares = 0;
		
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				if(matriz[i][j]%2 ==0) {
					pares++;
					
				}
				
			}
		}
		
		
		return pares;		
		
		
	}
	
	public int qtdImpares(){
		
int impares = 0;
		
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				if(matriz[i][j] !=0) {
					impares++;
					
				}
				
			}
		}
		
		
		return impares;		
		
	}
}
	
	
	
	
	


