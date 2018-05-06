

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class redrtPages
 */
@WebServlet("/redrtPages")
public class redrtPages extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public redrtPages() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name1=request.getParameter("in1");
		String name2=request.getParameter("in2");
		String name3=request.getParameter("in3");
		String name4=request.getParameter("in4");
		String name="";
		if(name1!=null) {
			name=name1;
		}
		else if(name2!=null) {
			name=name2;
		}
		else if(name3!=null) {
			name=name3;
		}
		else if(name4!=null) {
			name=name4;
		}
		
		PrintWriter out=response.getWriter();
		out.write("<p>"+name+"</p>");
		if(name.equals("Insert")) {
			response.sendRedirect("addEmp.html");
		}
		else if(name.equals("Display")) {
		response.sendRedirect("ViewServlet");

		}
		else if(name.equals("Delete")){
			response.sendRedirect("ViewServlet");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
