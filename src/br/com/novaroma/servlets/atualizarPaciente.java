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

@WebServlet("/atualizarPaciente")
public class atualizarPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PacienteControlador controlador;
	
    public atualizarPaciente() {
    	controlador = new PacienteControlador();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Paciente paciente = new Paciente();
		response.setContentType("charset=utf-8");
		paciente.setNome(request.getParameter("nome"));
		paciente.setCpf(request.getParameter("cpf"));
		paciente.setEndereco(request.getParameter("endereco"));
		paciente.setNumero(request.getParameter("numero"));
		paciente.setBairro(request.getParameter("bairro"));
		paciente.setCep(request.getParameter("cep"));
		paciente.setUf(request.getParameter("uf"));
		paciente.setCidade(request.getParameter("cidade"));
		if (controlador.atualizarPaciente(paciente)) {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>Alteração Efetuada com Sucesso</title> <meta charset='utf-8'> </head>");
			out.println("<body>");
			out.println("<h1>" + request.getParameter("nome") + " Foi Atualizado com Sucesso! </h1>");
			out.println("<a href='index.html'> HOME </a>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
		} else {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>Alteração ocorreu um erro</title> <meta charset='utf-8'> </head>");
			out.println("<body>");
			out.println("<h1>" + request.getParameter("nome") + " Não foi Atualizado com Sucesso!</h1>");
			out.println("<a href='index.html'> HOME </a>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
		}
	}

}
