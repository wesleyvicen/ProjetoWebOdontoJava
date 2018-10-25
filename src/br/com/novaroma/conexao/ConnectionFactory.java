package br.com.novaroma.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection connection;
	
	
	public ConnectionFactory() {
		// Configurando a nossa conexão com um banco de dados//
		String driverName = "com.mysql.jdbc.Driver";                        
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
        String serverName = "localhost";    //caminho do servidor do BD
        String mydatabase = "projetoodonto";        //nome do seu banco de dados
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        String username = "root";        //nome de um usuário de seu BD      
        String password = "12345678";      //sua senha de acesso
        
        try {
			this.connection = DriverManager.getConnection(url, username, password);
			System.out.println("1");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("ok");
	}
	
	public Connection getConnection() {
		return this.connection;
	}
}
