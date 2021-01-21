package controller;

import java.io.IOException;

import utility.EligibiltyCheck;

@WebServlet(urlPatterns= {"/eligiblemain"})
public class Eligibility extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String points=request.getParameter("points");
	EligibiltyCheck elch = new EligibiltyCheck();
	boolean spaceEligible = elch.checkQuizAnswer(points);
	
	if(false)
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/success.html");
		rd.forward(request, response);	
	}
	else
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
		rd.forward(request, response);
		
	}

}
}
