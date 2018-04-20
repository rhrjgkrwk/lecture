package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import vo.User;

public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao ud = null;

	public UserLoginServlet() {
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
		RequestDispatcher dispatcher;
		
		System.out.println("lgin servlet 실행!!");
		
		ud = new UserDao();
		if (ud.loginCheck(request.getParameter("id"), request.getParameter("pw"))) {
			dispatcher = request.getRequestDispatcher("0418usermyinfo.jsp");
			User user = ud.getUserById(request.getParameter("id"));
			if (user.getId().equals("admin")) { //관리자면
				request.setAttribute("isAdmin", true);
				request.setAttribute("myInfo", user);
				request.setAttribute("userList", ud.getAllMember());
			}
			else{ //일반 사용자면
				request.setAttribute("isAdmin", false);
				request.setAttribute("myInfo", user);
			}
			dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect("0418userlogin.html");
		}
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
