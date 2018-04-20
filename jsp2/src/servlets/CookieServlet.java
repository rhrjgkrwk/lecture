package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Cookie getCookieByName(String name, Cookie[] cookies){
    	for (Cookie cookie : cookies) {
			if (cookie.getName().equals(name)) {
				return cookie;
			}
		}
    	return null;
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if (getCookieByName("count", request.getCookies())==null) { //여기서 기존 생성된 쿠키가 있는지 확인.
			Cookie cookie = new Cookie("count", "1");
			cookie.setMaxAge(60*60*24*365);
			response.addCookie(cookie);
		}
		else {
			int count = Integer.parseInt(getCookieByName("count", request.getCookies()).getValue());
			Cookie cookie = new Cookie("count", String.valueOf(count+1));
			cookie.setMaxAge(60*60*24*365);
			response.addCookie(cookie);
		}
		out.println("<h1>");
		out.println(getCookieByName("count", request.getCookies()).getValue());
		out.println("번째 방문하셨습니다.</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
