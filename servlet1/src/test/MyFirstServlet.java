package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// http://ip:port/first/MyFirstServlet ���� �� ���α׷��� ȣ���� �� �ִ�.
// �������� ���� http://ip:port/first/MyFirstServlet �� ��û�Ǹ� servlet ���α׷��� doget�޼ҵ带 �����Ѵ�.


/**
 * Servlet implementation class MyFirstServlet
 */
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8"); //html �ؼ��� utf-8 ���ڵ� ������� �ؼ��ض�.
		PrintWriter pw = response.getWriter();
		//pw.append("Served at: ").append(request.getContextPath());
		pw.println("<h1>�Ӵ� = Hello</h1>");
		pw.println("<h3>����Ǿ���. = Running</h3>");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
