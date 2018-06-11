package br.edu.unicesumar.app;

import br.edu.unicesumar.Categoria;
import br.edu.unicesumar.Produto;
import br.edu.unicesumar.session.ProdutoSession;

import java.util.List;


public class ProdutoApp {

	public static void main(String[] args) {
		
		Produto p = new Produto (22, "alimenticio", 221, new Categoria(212, "alimento"));
		
		ProdutoSession session = new ProdutoSession();
		
		session.inserirProduto(p);
		
		List<Produto> lista =  session.listarTodos();
		
		for(Produto x : lista) {
			System.out.println("Categoria: " + x.getCategoria());
			System.out.println("idProduto: " + x.getIdProduto());
			
		}
	}

}
