package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Person
 */
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String sex = request.getParameter("sex");
		String job = request.getParameter("job");
		String[] mailing = request.getParameterValues("mailing");

		String[] t = {"<h4>", "</h4>"};
		out.println(t[0]+name+t[1]);
		out.println(t[0]+id+t[1]);
		out.println(t[0]+pw+t[1]);
		out.println(t[0]+sex+t[1]);
		out.println(t[0]+job+t[1]);
		for (int i = 0; i < mailing.length; i++) {
			out.println(t[0]+mailing[i]+t[1]);
		}
		
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String sex = request.getParameter("sex");
		String job = request.getParameter("job");
		String[] mailing = request.getParameterValues("mailing");

		String[] t = {"<h4>", "</h4>"};
		out.println(t[0]+name+t[1]);
		out.println(t[0]+id+t[1]);
		out.println(t[0]+pw+t[1]);
		out.println(t[0]+sex+t[1]);
		out.println(t[0]+job+t[1]);
		for (int i = 0; i < mailing.length; i++) {
			out.println(t[0]+mailing[i]+t[1]);
		}
		
		
		out.close();
	}

}
