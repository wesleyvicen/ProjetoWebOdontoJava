package br.com.novaroma.controlador;

import java.util.List;

import br.com.novaroma.dao.PacienteDao;
import br.com.novaroma.entidades.Paciente;
import br.com.novaroma.utils.ValidacoesAten;

public class PacienteControlador {
	private PacienteDao dao;

	public PacienteControlador() {
		super();
		this.dao = new PacienteDao();
	}

	public boolean inserirPaciente(Paciente paciente) {

		if (ValidacoesAten.validaCpfCliente(paciente)) {
			return dao.inserir(paciente);
		}
		return false;
	}

	public List<Paciente> listar() {
		List<Paciente> lista = this.dao.listar();
		return lista;
	}

	public List<Paciente> listarPacientePorId(long cpf_paciente) {
		List<Paciente> lista = this.dao.listarPacientesNoBancoPorId(cpf_paciente);
		return lista;
	}

	public Boolean deletarPaciente(String cpf_paciente) {
		return dao.deletarPaciente(cpf_paciente);
	}
	
	public boolean atualizarPaciente(Paciente paciente) {

		if (ValidacoesAten.validaCpfCliente(paciente)) {
			return dao.atualizar(paciente);
		}
		return false;
	}
}
