package br.com.novaroma.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.novaroma.controlador.PacienteControlador;
import br.com.novaroma.entidades.Paciente;

@WebServlet("/cadastropaciente")
public class CadastroPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PacienteControlador controlador;

	public CadastroPaciente() {
		super();
		controlador = new PacienteControlador();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Paciente paciente = new Paciente();
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String nomeCompleto = nome + " " + sobrenome;
		paciente.setNome(nomeCompleto);
		paciente.setCpf(request.getParameter("cpf"));
		paciente.setEndereco(request.getParameter("endereco"));
		paciente.setNumero(request.getParameter("numero"));
		paciente.setBairro(request.getParameter("bairro"));
		paciente.setCep(request.getParameter("cep"));
		paciente.setUf(request.getParameter("uf"));
		paciente.setCidade(request.getParameter("cidade"));
		paciente.setDistrito(request.getParameter("municipio"));
		controlador.inserirPaciente(paciente);
		try {
			RequestDispatcher view = request.getRequestDispatcher("/CadastroPaciente.jsp");
			request.setAttribute("paciente", controlador.listar());
			view.forward(request, response);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
