package br.com.novaroma.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.novaroma.controlador.AtendimentoControlador;
import br.com.novaroma.entidades.Atendimento;

@WebServlet("/IniciarAtendimento")
public class IniciarAtendimento extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AtendimentoControlador controler = new AtendimentoControlador();

	public IniciarAtendimento() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Atendimento atendimento = new Atendimento();
		
		atendimento.setCpfPaciente(request.getParameter("cpf_paciente"));
		atendimento.setNome(request.getParameter("nome"));
		atendimento.setStatus(true);
		atendimento.setDescricao(request.getParameter("descricao"));
		controler.inserirPaciente(atendimento);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>"+ request.getParameter("nome")+ " Foi Cadastrado com Sucesso! </h1>");
		out.println("<a href='index.html'> HOME </a>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

}
