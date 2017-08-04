package com.sopra.pox3.javee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.getWriter().print("<html><head></head><body>Coucou tout le monde !</body></html>");
		// on travaille au niveau de la Servlet. A ce niveau, on n'est pas censé
		// comprendre la réponse : c'est le navigateur qui interprêtera resp
	}
}
