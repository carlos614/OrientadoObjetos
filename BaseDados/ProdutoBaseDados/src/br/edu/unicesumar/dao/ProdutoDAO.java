package br.edu.unicesumar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unicesumar.Categoria;
import br.edu.unicesumar.Produto;

public class ProdutoDAO extends DAO {
	
	private String SQL_INSERT = "INSERT INTO TB_PRODUTO(idProduto, descricao, valorProduto, idCategoria) values(?, ?, ?, ?);";
	private String SQL_UPDATE = "UPDATE TB_PRODUTO SET idProduto = ?, descricao = ?, valorProduto = ?, WHERE idCategoria = ?;";
	private String SQL_DELETE = "UPDATE TB_PRODUTO SET idProduto = ? WHERE idCategoria = ?;";
	private String SQL_SELECT = "SELECT * FROM TB_PRODUTO;";
	
	public void inserir(Produto p) {
		try {
			conectar();
				PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
				
					ps.setInt(1, p.getIdProduto());
					ps.setString(2, p.getDescricao());
					ps.setFloat(3, p.getValorProduto());
				    ps.setInt(4, p.getCategoria().getIdCategoria());
					
					ps.executeUpdate();
					
					desconectar();
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
		public void alterar(Produto p) {
			try {
				conectar();
					PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
					
					ps.setInt(1, p.getIdProduto());
					ps.setString(2, p.getDescricao());
					ps.setFloat(3, p.getValorProduto());
					ps.setInt(4, p.getCategoria().getIdCategoria());
					
					ps.executeUpdate();
					
						desconectar();
		}
			catch(Exception e) {
				
				e.printStackTrace();
		}	
	}
		public void excluir (Produto p) {
			try {
				conectar();
				
					PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
					
					ps.setInt(1, p.getCategoria().getIdCategoria());
					
					ps.executeUpdate();
					
				desconectar();
			}
			catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		public List<Produto> listarTodos(){
			List<Produto> lista = new ArrayList<Produto>();
			
				try {
					conectar();
					
					PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
					
					ResultSet rs = ps.executeQuery();
					
					while(rs.next()) {
						
						Categoria c = new Categoria(rs.getInt("idCategoria"),
													 rs.getString("descricao"));
						
						Produto p = new Produto(rs.getInt("idProduto"),
												rs.getString("descricao"),
												rs.getFloat("valorProduto"),
												c);
								
																
						lista.add(p);
					}
					desconectar();
				}
				catch(Exception e) {
					
					e.printStackTrace();
				}
					return lista;
		}
}
