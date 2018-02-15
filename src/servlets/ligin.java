package servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
/**
 * Servlet implementation class LoginController
 */
public class ligin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		System.out.print(un);
		
		if(un.equals("admin") && pw.equals("admin"))
		{
			response.sendRedirect("success.html");
			return;
		}
		else
		{
			response.sendRedirect("error.html");
			return;
		}
	}
}