package br.edu.unicesumar;

public class Categoria {
	
	private int idCategoria;
	private String descricao;
	public Categoria(int idCategoria, String descricao) {
		super();
		this.idCategoria = idCategoria;
		this.descricao = descricao;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
