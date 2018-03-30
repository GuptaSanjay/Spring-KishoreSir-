package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private int i=0;
    private int j=0;
	public void init(ServletConfig config) throws ServletException {
		i++;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		j++;
		PrintWriter out =response.getWriter();
		System.out.println("doGet() is called");
		out.print("<html><body>");
		out.print("<p>value of i="+i+", value of j = "+j+"</p></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		j++;
		PrintWriter out =response.getWriter();
		System.out.println("doGet() is called");
		out.print("<html><body>");
		out.print("<p>value of i="+i+", value of j = "+j+"</p></body></html>");
	}

}
