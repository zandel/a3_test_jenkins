
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import part2_DynWeb_Jenkins.SomeFunctions;

/** * Servlet implementation class parkingReg      */

public class CallTwoFunctions extends HttpServlet {
	
	private static final long serialVersionUID = 1L;       
    /**     * @see HttpServlet#HttpServlet()     */
    public CallTwoFunctions() {        super();           }
	/**	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)	 */    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Here are we in the TopUpAccount servlet");
		
		String regNumber = request.getParameter("registration");
		
		SomeFunctions obj1 = new SomeFunctions();
		
		int firstResult = obj1.function_1(   Integer.parseInt( regNumber )    ) ;
		String secondResult = obj1.function_2(    firstResult   ) ;
		
		
		//-------------------
		System.out.println( regNumber  );	
		System.out.println("----------xxx-----------------");
							
		
		try {			
			request.setAttribute( "registration", regNumber );	
			request.setAttribute( "result1", firstResult );	
			request.setAttribute( "result2", secondResult );	
			
			RequestDispatcher rdx = getServletContext().getRequestDispatcher( "/FunctionReceipt.jsp"  );			
			rdx.forward( request, response );			
		}	catch( Exception e ) {
				e.printStackTrace();		
	    }		
	}    
}
