import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/Display 10 Times"})
public class Display10Times extends HttpServlet{

	
		
		
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
			
			response.setContentType("text/html;charset = UTF-8");
			
			try(PrintWriter out = response.getWriter()){
				out.print("<!DOCTYPE HTML>");
				out.print("<html>");
				out.print("<head>");
				out.print("<title>JSP to display Kathmandu,Nepal 10 Times.</title>");
				for( int i= 1;i<=10;i++) {
					out.print("<h1>Kathmandu,Nepal.</h1>");
				}
				out.print("</head>");
				out.print("</html>");	
			}
		}
	


}
