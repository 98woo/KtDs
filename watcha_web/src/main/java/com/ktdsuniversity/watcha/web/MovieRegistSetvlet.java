package com.ktdsuniversity.watcha.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ktdsuniversity.watcha.service.MoviesService;

/**
 * Servlet implementation class MovieRegistSetvlet
 */
public class MovieRegistSetvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MoviesService moviesService;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieRegistSetvlet() {
        super();
        this.moviesService = new MoviesService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/regist.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 서버(servlet)로 전송된 파라미터를 받아온다.
		String title = request.getParameter("title");
		String genre = request.getParameter("genre");
		String location = request.getParameter("location");
		String summary = request.getParameter("summary");
		int minimumAge = Integer.parseInt(request.getParameter("minimumAge"));
		
		// 2. 데이터베이스에 저장한다.
		this.moviesService.createNewMovie(title, minimumAge, "", 0, genre, "", location, summary, "", null);
		
		// 3. 영화 목록 페이지로 이동한다.
		response.sendRedirect("/watcha_web/movies");
	}

}
