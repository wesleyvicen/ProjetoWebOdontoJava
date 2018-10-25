package br.com.novaroma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.novaroma.conexao.ConnectionFactory;
import br.com.novaroma.entidades.Atendimento;
import br.com.novaroma.entidades.Paciente;

public class AtendimentoDao {
	private Connection conn;

	public AtendimentoDao() {
		conn = new ConnectionFactory().getConnection();
	}

	public void inserir(Atendimento atendimento) {
		String sql = " insert into atendimento (nome , descricao, status, cpf_paciente) values (? , ? , ?,?)";
		int numero;
		boolean toReturn = false;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, atendimento.getNome());
			stmt.setString(2, atendimento.getDescricao());
			stmt.setBoolean(3, atendimento.isStatus());
			stmt.setString(4, atendimento.getCpfPaciente());

			// stmt.execute();
			numero = stmt.executeUpdate();
			toReturn = numero > 0;

			System.out.println(numero);
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Atendimento> listar() {
		List<Atendimento> lista = new ArrayList<Atendimento>();
		String query = "select * from atendimento";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Atendimento atendimento = new Atendimento();
				atendimento.setCpfPaciente(rs.getString("cpf_paciente"));
				atendimento.setNome(rs.getString("nome"));
				atendimento.setDescricao(rs.getString("descricao"));
				atendimento.setStatus(rs.getBoolean("status"));

				lista.add(atendimento);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List<Atendimento> listarAtendPeloId(long numAtend) {
		List<Atendimento> lista = new ArrayList<Atendimento>();
		String query = "select * from atendimento where cpf_paciente= " + numAtend;
		try {
			PreparedStatement stmt = this.conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Atendimento atendimento = new Atendimento();
				atendimento.setId(rs.getInt("id"));
				atendimento.setNome(rs.getString("nome"));
				atendimento.setDescricao(rs.getString("descricao"));
				atendimento.setStatus(rs.getBoolean("status"));
				
				lista.add(atendimento);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	public boolean updateAtend(Atendimento atendimento) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean fecharAtend(Atendimento atendimento) {
		String query = "update atendimento set status = ? where id=" + atendimento.getId();
		boolean toReturn = false;
		int numero;
		try {
			PreparedStatement stmt = this.conn.prepareStatement(query);
			stmt.setBoolean(1, atendimento.isStatus());
			numero = stmt.executeUpdate();
			toReturn = numero > 0;
			toReturn = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return toReturn;
	}

	public boolean deletarAtend(int numAtend) {
		// TODO Auto-generated method stub
		return false;
	}

}
