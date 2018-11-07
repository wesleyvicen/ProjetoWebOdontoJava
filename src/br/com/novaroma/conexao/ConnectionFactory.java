package br.com.novaroma.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static String serverName = "localhost"; // caminho do servidor do BD
	private static String mydatabase = "projetoodonto"; // nome do seu banco de dados
	private static String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	private static String username = "root"; // nome de um usuário de seu BD
	private static String password = "12345678"; // sua senha de acesso

	public Connection connection;

	public ConnectionFactory() {
		// Configurando a conexão com um banco de dados//

		try {

			// Carrega o driver JDBC do Mysql
			Class.forName("com.mysql.jdbc.Driver");

			this.connection = DriverManager.getConnection(url, username, password);
			connection.setAutoCommit(false);
			System.out.println("Conectado com sucesso ao banco de dados!");

		} catch (ClassNotFoundException e) {

			System.out.println("Não foi possível encontrar o driver do banco de dados " + e.getMessage());

		} catch (SQLException e) {

			System.out.println("Não foi possível conectar ao banco de dados " + e.getMessage());

		}
	}

	public Connection getConnection() {
		return this.connection;
	}
}
