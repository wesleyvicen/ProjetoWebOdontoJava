package br.com.novaroma.conexao;

import java.sql.DriverManager;

public class Connection {

	private static String serverName = "localhost";    //caminho do servidor do BD
	private static String mydatabase = "projetoodonto";        //nome do seu banco de dados
	private static String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	private static String username = "root";        //nome de um usuário de seu BD      
	private static String password = "12345678";      //sua senha de acesso
	private static Connection connection = null;;
	
	
	static {
		conectar();
	}


	private static void conectar() {
		try {

			if(connection == null) {
				Class.forName("com.mysql.jdbc.Driver");
				connection = (Connection) DriverManager.getConnection(url, username, password);
				((java.sql.Connection) connection).setAutoCommit(false);
			}
			
		}catch (Exception e) {
			throw new RuntimeException("Erro ao conectar com o banco de dados");
		}
		
	}

}
