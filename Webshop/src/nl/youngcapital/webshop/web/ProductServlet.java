package nl.youngcapital.webshop.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/Product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query = request.getQueryString();
		int number = 0;
		if(query.startsWith("id=")){
			String substring = query.substring(3);
			try{
				number = Integer.parseInt(substring);
			} catch(NumberFormatException nfe){
				response.getWriter().print(substring + " is not a number and therefore not allowable for an id.");
			}
		}
		switch(number){
			case 1:
				response.sendRedirect("Appel.html");
				break;
			case 2:
				response.sendRedirect("Peer.html");
				break;
			default:
				response.sendRedirect("index.html");
		}
	}
	
}
