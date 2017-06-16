package nl.youngcapital.demo;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderServlet
 */
@WebServlet("/Header")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String output = "";
		Enumeration<String> headerNames = request.getHeaderNames();
		if(headerNames != null){
			while(headerNames.hasMoreElements()){
				output += request.getHeader(headerNames.nextElement());
				output += "\n";
			}
		}
		
		response.getWriter().print(output);
	}

}
