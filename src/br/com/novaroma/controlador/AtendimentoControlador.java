package br.com.novaroma.controlador;

import java.util.List;

import br.com.novaroma.dao.AtendimentoDao;
import br.com.novaroma.entidades.Atendimento;


public class AtendimentoControlador {
	AtendimentoDao dao = new AtendimentoDao() ;

	public boolean inserirPaciente(Atendimento atendimento) {
		boolean resultado = false;
		if(atendimento.getCpfPaciente() != null & !atendimento.getCpfPaciente().equals("")) {
			this.dao.inserir(atendimento);
			resultado = true;
		}
		else {
			System.out.println("Usuário sem CPF");
		}
		return resultado;
	}

	public List<Atendimento> listarTodosAtend() {
		return dao.listar();
	}

	public List<Atendimento> listarAtendPeloId(long numAtend) {
		return this.dao.listarAtendPeloId(numAtend);
	}

	public boolean updateAtend(Atendimento atendimento) {
		return dao.updateAtend(atendimento);
	}

	public boolean fecharAtend(Atendimento atendimento) {
		return dao.fecharAtend(atendimento);

	}

	public boolean deletarAtend(int numAtend) {
		return dao.deletarAtend(numAtend);
	}
}
