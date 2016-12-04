package info.michalak;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(
		description = "a simple servlet",  //This tag describes Servlet
		urlPatterns = {"/SimpleServlet","/SimpleServlet2"	
			//***Important** urlPatterns tag adresses Servlet under 
//			http://localhost:8080/JavaServlet/SimpleServlet and
//			http://localhost:8080/JavaServlet/SimpleServlet
		})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SimpleServlet() {
        super();
    }

	
// doGet Method gets automatically executed when Servlet is accessed by url
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String getName = request.getParameter("userName"); //username parameter passet from browser to tomcat in request 
		
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter(); //Prints In html
			
		writer.println("This was passt in request" + getName) ;
		    
		 
			
			
		
		
//not important	
	System.out.println("Hello from servlet"); // Executes every time someones accesses Servlet url in console(depends on tomcat Server settings)
	System.out.println(request.getProtocol());
	}

}
