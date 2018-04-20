package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.LoginVO;

/**
 * Servlet implementation class Session1Servlet
 */
public class Session1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 로그인 했을 때
		1. 내정보보기
		2. 회원정보 수정
		3. 암호변경
		4. 주문내역
		5. 배송현황
		
		*/
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		System.out.println(request.getParameter("id"));
		
		
		
		if (request.getParameter("id")!=null && request.getParameter("id").equals("coonyang")) {
			//이미 세션에 로그인 정보가 있는 경우
			if (session.getAttribute("vo") != null
					&& (((LoginVO) (session.getAttribute("vo"))).getId()).equals(request.getParameter("id"))) {
				out.println("<h1>이미 로그인 되어있습니다.</h1>");
			}
			//없는 경우 세션 새로 생성.
			else{
				LoginVO vo = new LoginVO(request.getParameter("id"), request.getParameter("pw"));
				session.setAttribute("vo", vo);
			}
		}
		else{
			out.println("<script> alert('잘못된 아이디입니다.'); </script>");
		}
				
		
		
		if(session.getAttribute("vo")!=null){
			out.println("<h1>My Info</h1>");
			out.println("<ol>");
			out.println("<li><h3>내 정보 보기</h3></li>");
			out.println("<li><h3>회원 정보 수정</h3></li>");
			out.println("<li><h3>주문 내역</h3></li>");
			out.println("<li><h3>배송 현황</h3></li>");
			out.println("</ol>");
		}
		else {
			
//			/response.sendRedirect("0420sessionform.jsp");
			out.println("<h1>Sign in first</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
