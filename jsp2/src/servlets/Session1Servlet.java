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
		/* �α��� ���� ��
		1. ����������
		2. ȸ������ ����
		3. ��ȣ����
		4. �ֹ�����
		5. �����Ȳ
		
		*/
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		System.out.println(request.getParameter("id"));
		
		
		
		if (request.getParameter("id")!=null && request.getParameter("id").equals("coonyang")) {
			//�̹� ���ǿ� �α��� ������ �ִ� ���
			if (session.getAttribute("vo") != null
					&& (((LoginVO) (session.getAttribute("vo"))).getId()).equals(request.getParameter("id"))) {
				out.println("<h1>�̹� �α��� �Ǿ��ֽ��ϴ�.</h1>");
			}
			//���� ��� ���� ���� ����.
			else{
				LoginVO vo = new LoginVO(request.getParameter("id"), request.getParameter("pw"));
				session.setAttribute("vo", vo);
			}
		}
		else{
			out.println("<script> alert('�߸��� ���̵��Դϴ�.'); </script>");
		}
				
		
		
		if(session.getAttribute("vo")!=null){
			out.println("<h1>My Info</h1>");
			out.println("<ol>");
			out.println("<li><h3>�� ���� ����</h3></li>");
			out.println("<li><h3>ȸ�� ���� ����</h3></li>");
			out.println("<li><h3>�ֹ� ����</h3></li>");
			out.println("<li><h3>��� ��Ȳ</h3></li>");
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
