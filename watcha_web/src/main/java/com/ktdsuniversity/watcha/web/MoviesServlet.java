package com.ktdsuniversity.watcha.web;

import java.io.IOException;
import java.util.List;

import com.ktdsuniversity.watcha.service.MoviesService;
import com.ktdsuniversity.watcha.vo.MoviesVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MoviesServlet
 */
public class MoviesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private MoviesService moviesService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MoviesServlet() {
        super();
        this.moviesService = new MoviesService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JSP 에게 보내주고 싶은 데이터를 작성.
		// JSP에게 "영화 목록" 전송.
					
//		
//		MoviesVO moviesVO = new MoviesVO();
//		moviesVO.setMovieId("영화의 ID");
//		moviesVO.setTitle("테스트 영화 제목");
//		moviesVO.setLocation("한국");
//		
//		
//		// JSP에게 영화 인스턴스를 전송
//		request.setAttribute("moviesVO", moviesVO);
//		
//		List<String> genreList = new ArrayList<>();
//		genreList.add("코미디");
//		genreList.add("액션");
//		genreList.add("로맨스");
//		genreList.add("스릴러");
//		genreList.add("추리");
//		
//		// JSP에게 장르 리스트를 전송
//		request.setAttribute("genreList", genreList);
//									key, value
		request.setAttribute("pageTitle", "영화 목록(Servlet에서 전송)");
		
		List<MoviesVO> moviesList = this.moviesService.findAllMovies();
		request.setAttribute("moviesList", moviesList);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/movies.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
