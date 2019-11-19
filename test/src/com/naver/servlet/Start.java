package com.naver.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Start
 */
@WebServlet("/cookielogin")
public class Start extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Start() {
		super();//???
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");	//찬미 오류수정
		String id = "";
		String cookie = request.getHeader("Cookie");
		if (cookie != null) {
			Cookie cookies[] = request.getCookies();
			for (int i = 0; i < cookies.length; i++) {		//찬미 오류수정
				if (cookies[i].getName().contentEquals("id")) {
					cookies[i].getValue();
				}
			}
		}
		RequestDispatcher dispatcher =request.getRequestDispatcher("jsp/login.jsp");
		request.setAttribute("id", id);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("uec-kr");
		doGet(request, response);
	}

}
