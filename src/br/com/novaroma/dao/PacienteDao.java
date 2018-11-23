package br.com.novaroma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.novaroma.conexao.ConnectionFactory;
import br.com.novaroma.entidades.Paciente;

public class PacienteDao {
	private Connection conn;

	public PacienteDao() {
		conn = new ConnectionFactory().getConnection();
	}

	public boolean inserir(Paciente paciente) {
		String sql = "insert into paciente (nome, cpf, endereco, numero, bairro,  cep, uf, cidade) values (?, ?, ?, ?, ?, ?, ? , ?)";
		int numero;
		boolean toReturn = false;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, paciente.getNome());
			stmt.setString(2, paciente.getCpf());
			stmt.setString(3, paciente.getEndereco());
			stmt.setString(4, paciente.getNumero());
			stmt.setString(5, paciente.getBairro());
			stmt.setString(6, paciente.getCep());
			stmt.setString(7, paciente.getUf());
			stmt.setString(8, paciente.getCidade());

			// stmt.execute();
			numero = stmt.executeUpdate();
			toReturn = numero > 0;
			conn.commit();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return toReturn;
	}

	public boolean atualizar(Paciente paciente) {
		String sql = "update paciente set nome = ?, endereco = ?, numero = ?, bairro = ?, cep = ?, uf = ?, cidade = ? where cpf ="
				+ paciente.getCpf();

		int numero;
		boolean toReturn = false;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, paciente.getNome());
			stmt.setString(2, paciente.getEndereco());
			stmt.setString(3, paciente.getNumero());
			stmt.setString(4, paciente.getBairro());
			stmt.setString(5, paciente.getCep());
			stmt.setString(6, paciente.getUf());
			stmt.setString(7, paciente.getCidade());
			// stmt.execute();
			numero = stmt.executeUpdate();
			toReturn = numero > 0;
			conn.commit();

			System.out.println(numero);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return toReturn;
	}

	public List<Paciente> listarPacientesNoBancoPorId(long cpf_paciente) {
		List<Paciente> lista = new ArrayList<Paciente>();
		String query = "select * from paciente where cpf=" + cpf_paciente;

		try {
			PreparedStatement stmt = this.conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Paciente paciente = new Paciente();
				paciente.setNome(rs.getString("nome"));
				paciente.setCpf(rs.getString("cpf"));
				paciente.setEndereco(rs.getString("endereco"));
				paciente.setNumero(rs.getString("numero"));
				paciente.setBairro(rs.getString("bairro"));
				paciente.setCep(rs.getString("cep"));
				paciente.setUf(rs.getString("uf"));
				paciente.setCidade(rs.getString("cidade"));

				lista.add(paciente);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	public List<Paciente> listar() {
		List<Paciente> lista = new ArrayList<Paciente>();
		String query = "select * from paciente";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Paciente paciente = new Paciente();
				paciente.setNome(rs.getString("nome"));
				paciente.setCpf(rs.getString("cpf"));
				paciente.setEndereco(rs.getString("endereco"));
				paciente.setNumero(rs.getString("numero"));
				paciente.setBairro(rs.getString("bairro"));
				paciente.setCep(rs.getString("cep"));
				paciente.setUf(rs.getString("uf"));
				paciente.setCidade(rs.getString("cidade"));

				lista.add(paciente);

			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public Boolean deletarPaciente(Paciente paciente) {
		String query = "delete from paciente where cpf=" + paciente.getCpf();
		boolean toReturn = false;
		int numero;
		try {
			PreparedStatement stmt = this.conn.prepareStatement(query);
			numero = stmt.executeUpdate();
			toReturn = numero > 0;
			toReturn = true;
			conn.commit();
			stmt.close();
		} catch (Exception e) {
			if (e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException) {
				paciente.setInfo(1);
			}
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return toReturn;
	}

}
