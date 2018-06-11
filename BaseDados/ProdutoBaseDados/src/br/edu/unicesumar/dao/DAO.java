package br.edu.unicesumar.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import br.edu.unicesumar.db.ConnectDB;

public class DAO {
	
	protected ConnectDB db;
	protected java.sql.Connection connection;
	
	public DAO( ) {
		
		db = new ConnectDB();
	}
	
	public void conectar() throws Exception {
		
		if(connection == null)
			connection = db.getConnection();
	}
	
	public void desconectar() throws Exception {
		
		if(connection !=null)
			connection.close();
	}
}
