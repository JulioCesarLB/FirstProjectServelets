package br.com.fiap.controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.negocio.UsuarioBO;

/**
 * Servlet implementation class Autentica
 */
@WebServlet("/autentica")
public class Autentica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autentica() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("Login");
		String password = request.getParameter("Password");
		UsuarioBO canal = new UsuarioBO();
		
		if(canal.autentica(login, password)) {
			
			List<String> acoes = canal.recuperaAcoes(login);
			request.setAttribute("acoes", acoes);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "Login ou senha inválidos");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
