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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
// doGet Method gets automatically executed when Servlet is accessed by url
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from servlet"); // Executes every time someones accesses Servlet url in console(depends on tomcat Server settings)
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter(); //Prints In html
			writer.println("<h3> Print Writter HELLO </h3>");
			
			
		
		
	response.getWriter().append("Served at: ").append(request.getContextPath());

	System.out.println(request.getProtocol());
	}

}
