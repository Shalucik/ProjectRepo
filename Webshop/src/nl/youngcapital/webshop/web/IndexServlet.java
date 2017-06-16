package nl.youngcapital.webshop.web;

import nl.youngcapital.webshop.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> vooraad = new ArrayList<Product>();
		vooraad.add(new DefaultProduct("Appels", 2, "http://www.jamiemagazine.nl/upload/artikel/jm/appel-artikel.jpg"));
		vooraad.add(new DefaultProduct("Peren", 1, "/Peer.jpg"));
		
		request.setAttribute("Appel", new DefaultProduct("Appels", 2, ""));
		request.setAttribute("Peer", new DefaultProduct("Peren", 1, ""));
		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
	}

}
