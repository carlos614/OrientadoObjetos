package br.edu.unicesumar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unicesumar.model.Fornecedor;

public class FornecedorDAO extends DAO{
	
	private String SQL_INSERT = "INSERT INTO TB_FORNECEDOR(cnpj, nomefantasia, razaosocial, status) values(?, ?, ?, ?);";
	private String SQL_UPDATE = "UPDATE TB_FORNECEDOR SET nomefantasia = ?, razaosocial = ?, status = ? WHERE cnpj = ?;";
	private String SQL_DELETE = "UPDATE TB_FORNECEDOR SET status = ? WHERE cnpj = ?;";
	private String SQL_SELECT = "SELECT * FROM TB_FORNECEDOR;";
	
	public void inserir(Fornecedor f) {
		try {
			//Abrir conexão
			conectar();
			
			//Inserir comando SQL de INSERT
			PreparedStatement ps = 
				db.getConnection().prepareStatement(SQL_INSERT);
			ps.setInt(1, f.getCnpj());
			ps.setString(2, f.getNomeFantasia());
			ps.setString(3, f.getRazaoSocial());
			ps.setBoolean(4, f.isStatus());
			
			ps.executeUpdate();
			
			//Fechar conexao
			desconectar();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterar(Fornecedor f) {
		try {
			//Abrir conexão
			conectar();
			
			//Inserir comando SQL de UPDATE
			PreparedStatement ps = 
				db.getConnection().prepareStatement(SQL_UPDATE);
			ps.setString(1, f.getNomeFantasia());
			ps.setString(2, f.getRazaoSocial());
			ps.setBoolean(3, f.isStatus());
			ps.setInt(4, f.getCnpj());
			
			ps.executeUpdate();
			
			//Fechar conexao
			desconectar();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void excluir(Fornecedor f) {
		try {
			//Abrir conexão
			conectar();
			
			//Inserir comando SQL de DELETE
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
			ps.setBoolean(1, false);
			ps.setInt(2, f.getCnpj());
			
			ps.executeUpdate();
			
			//Fechar conexao
			desconectar();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Fornecedor> listarTodos(){
		List<Fornecedor> lista = new ArrayList<Fornecedor>();
		
		try {
			//Abrir conexão
			conectar();
			
			//Inserir comando SQL de SELECT
			PreparedStatement ps = 
					db.getConnection().prepareStatement(SQL_SELECT);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Fornecedor f = new Fornecedor(rs.getInt("cnpj"), 
												rs.getString("nomefantasia"),
												rs.getString("razaosocial"),
												rs.getBoolean("status"));
				
				lista.add(f);
			}
			
			
			//Fechar conexao
			desconectar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}

}
