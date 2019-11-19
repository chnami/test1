package com.naver.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.naver.dao.MemberDAO;

/**
 * Servlet implementation class Login2
 */
@WebServlet("/login_ok_cookie")       
public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr");

		String form_id = request.getParameter("id");
		String form_pass = request.getParameter("pswd");
	
		MemberDAO dao=new MemberDAO();
		int result=dao.isId(form_id, form_pass);
		
		PrintWriter out = response.getWriter();
		Cookie cookie = new Cookie("id", request.getParameter("id"));
		String remember = request.getParameter("remember");
		
		if(remember==null) {
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		} else {
			cookie.setMaxAge(2*60);
			//Ŭ���̾�Ʈ�� ��Ű���� �����մϴ�.
			response.addCookie(cookie);
		}
		if(result==1) {
			HttpSession session = request.getSession();
			session.setAttribute("id", form_id);
			out.write("<script>");
			out.write("alert('"+form_id+"�� ȯ���մϴ�.');");
			out.write("location.href='Success';");
			out.write("</script>");
		} else if(result==0) {
			out.write("<script>");
			out.write("alert('��й�ȣ�� �ٸ��ϴ�.');");
			out.write("location.href='cookielogin';");
			out.write("</script>");
		} else {
			out.write("<script>");
			out.write("alert('���̵� �ٸ��ϴ�.');");
			out.write("location.href='cookielogin';");
			out.write("</script>");
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
