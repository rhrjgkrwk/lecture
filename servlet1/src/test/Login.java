package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		// User u = new User(request.getParameter(""), request.getParameter(""),
		// request.getParameter(""), request.getParameter(""),
		// request.getParameter(""));
		response.setContentType("text/html;charset=utf-8");
		String id = "";
		String pw = "";
		String ids = "java servlet jsp jquery html";
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		
		PrintWriter out = response.getWriter();
		if (ids.contains(id) && ids.contains(pw)) {
			out.println("<h1 style='background-color: green; text-decoration: bold; color: white;'> 로그인 성공 </h1>");
		}
		else {
			out.println("<h1 style='background-color: red; text-decoration: bold; color: white;'> 로그인 실패 </h1>");
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
