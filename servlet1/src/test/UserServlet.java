package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import vo.User;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao ud = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init and getConn");
		UserDao.getConn();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("closeConn");
		UserDao.closeConn();
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
//		UserDao.getConn();
		ud = new UserDao();
		User u = new User(request.getParameter("id"), request.getParameter("name"), request.getParameter("pw"),
				request.getParameter("phone"), request.getParameter("email"));
		if (ud.isDuplicate(u)) {
			out.println(u.getId()+"는(은) 사용할 수 없는 아이디다.");
		}
		else {
			ud.insertUser(u);
			out.println(u.getId()+"는(은) 정삭적으로 등록되었다.");
		}
		
		System.out.println("doget");
		
		response.sendRedirect("memberlist.jsp");
		
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
