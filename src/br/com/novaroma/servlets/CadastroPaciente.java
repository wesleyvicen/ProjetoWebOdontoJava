package br.com.novaroma.servlets;

import java.io.IOException;
import java.io.PrintWriter;

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
		String cep = request.getParameter("cep");
		String cep2 = request.getParameter("cep2");
		String cepCompleto = cep + cep2;
		paciente.setNome(nomeCompleto);
		paciente.setCpf(request.getParameter("cpf"));
		paciente.setEndereco(request.getParameter("endereco"));
		paciente.setNumero(request.getParameter("numero"));
		paciente.setBairro(request.getParameter("bairro"));
		paciente.setCep(cepCompleto);
		paciente.setUf(request.getParameter("uf"));
		paciente.setCidade(request.getParameter("cidade"));
		paciente.setDistrito(request.getParameter("municipio"));

		if (controlador.inserirPaciente(paciente)) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>Servlet</title></head>");
			out.println("<body>");
			out.println("<h1>" + nome + " Foi Cadastrado com Sucesso! </h1>");
			out.println("<a href='index.html'> HOME </a>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>Servlet</title></head>");
			out.println("<body>");
			out.println("<h1>" + nome + " Não foi Cadastrado com Sucesso! </h1>");
			out.println("<a href='index.html'> HOME </a>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
		}
	}

}
