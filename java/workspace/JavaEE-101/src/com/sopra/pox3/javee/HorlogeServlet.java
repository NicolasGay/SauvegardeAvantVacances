package com.sopra.pox3.javee;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HorlogeServlet extends HttpServlet {
	
	Date d = new Date();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("<html><head></head><body>Coucou ! Voici la date !</br></body></html>");
		resp.getWriter().print(d);
		
		String p1 = req.getParameter("param1");
		String p2 = req.getParameter("param2");
		
		resp.getWriter().println("<html><head></head><body></br> Valeur du paramètre 1 : </body></html>"+p1);
		resp.getWriter().println("<html><head></head><body></br> Valeur du paramètre 2 : </body></html>"+p2);
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("<html><head></head><body>Coucou ! Voici la date !</br></body></html>");
		resp.getWriter().print(d);
		
		String p1 = req.getParameter("param1");
		String p2 = req.getParameter("param2");
		
		resp.getWriter().println("<html><head></head><body></br> Valeur du paramètre 1 : </body></html>"+p1);
		resp.getWriter().println("<html><head></head><body></br> Valeur du paramètre 2 : </body></html>"+p2);
		
	}


}
