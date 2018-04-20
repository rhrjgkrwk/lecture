package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import vo.User;

public class ForwardUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao ud = null;

	public ForwardUserServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init and getConn");
		UserDao.getConn();
	}
	
	@Override
	public void destroy() {
		System.out.println("closeConn");
		UserDao.closeConn();
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
//		UserDao.getConn();
		
		System.out.println("!!!!!!!");
		
		ud = new UserDao();
		User u = new User(request.getParameter("id"), request.getParameter("name"), request.getParameter("pw"),
				request.getParameter("phone"), request.getParameter("email"));
		
		
		
		if (ud.isDuplicate(u)) {
			System.out.println(u.getId()+"는(은) 사용할 수 없는 아이디다.");
		}
		else {
			ud.insertUser(u);
			System.out.println(u.getId()+"는(은) 정삭적으로 등록되었다.");
		}
		
		System.out.println("doget");
		
		
		ServletContext app = request.getServletContext();
		app.setAttribute("newbie", u);
		System.out.println((User)app.getAttribute("newbie"));
		response.sendRedirect("user.jsp");
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
