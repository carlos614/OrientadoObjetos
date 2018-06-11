package br.edu.unicesumar;

public class Produto {
	
	private int idProduto;
	private String descricao;
	private float valorProduto;
	private Categoria categoria;
	
	public Produto(int idProduto, String descricao, float valorProduto, Categoria categoria) {
		super();
		this.idProduto = idProduto;
		this.descricao = descricao;
		this.valorProduto = valorProduto;
		this.categoria = categoria;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(int valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}
