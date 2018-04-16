package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// http://ip:port/first/MyFirstServlet 으로 이 프로그램을 호출할 수 있다.
// 브라우저를 통해 http://ip:port/first/MyFirstServlet 이 요청되면 servlet 프로그램은 doget메소드를 실행한다.


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
		response.setContentType("text/html;charset=utf-8"); //html 해석시 utf-8 인코딩 방식으로 해석해라.
		PrintWriter pw = response.getWriter();
		//pw.append("Served at: ").append(request.getContextPath());
		pw.println("<h1>앙뇽 = Hello</h1>");
		pw.println("<h3>실행되었다. = Running</h3>");
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
