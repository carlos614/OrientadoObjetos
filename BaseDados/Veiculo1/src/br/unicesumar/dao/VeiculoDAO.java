package br.unicesumar.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import br.edu.unicesumar.Veiculo;

public class VeiculoDAO extends DAO{
	
	private String SQL_INSERT = "INSERT INTO TB_VEICULO(renavam, placa, ano, marcaEmodelo) values (?, ?, ?, ?);";
	private String SQL_UPDATE = "UPDATE TB_VEICULO SET placa = ?, ano = ?, marcaEmodelo = ?, WHERE renavam = ?;";
	private String SQL_DELETE = "UPDATE TB_VEICULO SET status = ? WHERE renavam = ?;";
	private String SQL_SELECT = "SELECT * FROM TB_VEICULO;";
	
	public void inserir(Veiculo v) {
		try {
			
			conectar();
			
				PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
				
					ps.setString(1, v.getRenavam());
					ps.setString(2, v.getPlaca());
					ps.setInt(3, v.getAno());
					ps.setString(4, v.getMarcaEmodelo());
					
					ps.executeUpdate();
					
					desconectar();
		}
		
			catch(Exception e) {
				e.printStackTrace();
		}
	}
	

		
	

	public void alterar(Veiculo v) {
		try {
			conectar();
				PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
				
				ps.setString(1, v.getRenavam());
				ps.setString(2, v.getPlaca());
				ps.setInt(3, v.getAno());
				ps.setString(4, v.getMarcaEmodelo());
				
				ps.executeUpdate();
		
					desconectar();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
public void excluir(Veiculo v) {
	try {
		conectar();
		
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
			
			ps.setString(1, v.getRenavam());
			
			ps.executeUpdate();
			
			desconectar();
	}
	catch (Exception e) {
		
		e.printStackTrace();
		}
	}
public List<Veiculo> listarTodos(){
	List<Veiculo> lista = new ArrayList<Veiculo>();
	
		try {
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Veiculo v = new Veiculo(rs.getString("renavam"),
						rs.getString("placa"),
						rs.getInt("ano"),
						rs.getString("marcaEmodelo"));
				
				lista.add(v);
			}
			
			desconectar();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	return lista;
	}
}
