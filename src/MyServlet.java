import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/MyServlet")
@WebServlet(name = "Servlet", urlPatterns= {"/Servlet"})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
    	
	}
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		// Get variables from input
		String name = request.getParameter("name");
		String symbol = request.getParameter("symbol");
		String price = request.getParameter("price");
		String yield = request.getParameter("yield");
		
		//Display results in html
		try {
		out.println("<html><body>");
		out.println("<h3>This is your Input</h3>");
		out.println("<table style='width:100%; border:1px solid black;'>");
		out.println("<tbody>");
		out.println("<tr><td>Stock Name</td><td>" + name + "<td></tr>");
		out.println("<tr><td>Stock Symbol</td><td>" + symbol + "<td></tr>");
		out.println("<tr><td>Stock Price</td><td>" + price + "<td></tr>");
		out.println("<tr><td>Stock Yield</td><td>" + yield + "<td></tr>");
		out.println("<tr><td><p style='text-align:center;'><a href=\"http://localhost:8080/MyServletProject/input.html\">Add A New Stock Quote</a></p><td></tr>");
		out.println("</tbody>");
		out.println("</table>");
		} catch(Exception e) {
			out.println("An error has occured please ensure you entered valid information.");
		}
		
	}

   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
