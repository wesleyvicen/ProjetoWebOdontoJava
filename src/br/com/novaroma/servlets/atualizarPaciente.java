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
		paciente.setNome(request.getParameter("nome"));
		paciente.setCpf(request.getParameter("cpf"));
		paciente.setEndereco(request.getParameter("endereco"));
		paciente.setNumero(request.getParameter("numero"));
		paciente.setBairro(request.getParameter("bairro"));
		paciente.setCep(request.getParameter("cep"));
		paciente.setUf(request.getParameter("uf"));
		paciente.setCidade(request.getParameter("cidade"));
		paciente.setDistrito(request.getParameter("municipio"));
		String nome = request.getParameter("nome");
		
		if (controlador.atualizarPaciente(paciente)) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>Alteração Efetuada com Sucesso</title></head>");
			out.println("<body>");
			out.println("<h1>" + nome + " Foi Atualizado com Sucesso! </h1>");
			out.println("<a href='index.html'> HOME </a>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>Alteração ocorreu um erro</title></head>");
			out.println("<body>");
			out.println("<h1>" + nome + " Não foi Atualizado com Sucesso!</h1>");
			out.println("<a href='index.html'> HOME </a>");
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
		}
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
