package com.ktdsuniversity.watcha.service;

import java.util.List;

import com.ktdsuniversity.watcha.dao.MoviesDao;
import com.ktdsuniversity.watcha.dao.ProducingDao;
import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.MoviesVO;

public class MoviesService {

	private MoviesDao moviesDao;
	private ProducingDao producingDao;
	
	public MoviesService() {
		this.moviesDao = new MoviesDao();
		this.producingDao = new ProducingDao();
	}
	
	public boolean createNewMovie(String title
								 , int minimumAge
								 , String openYear
								 , int runningTime
								 , String genre
								 , String athmosphere
								 , String location
								 , String summary
								 , String poster
								 , List<String> directorsId) {
		
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();
		
		// 영화의 새로운 PK값을 받아온다.
		String newMoviePk = this.moviesDao.makeNextValue(dbSupporter);
		
		MoviesVO moviesVO = new MoviesVO();
		moviesVO.setMovieId(newMoviePk);
		moviesVO.setTitle(title);
		moviesVO.setMinimumAge(minimumAge);
		moviesVO.setOpenYear(openYear);
		moviesVO.setRunningTime(runningTime);
		moviesVO.setGenre(genre);
		moviesVO.setAtmosphere(athmosphere);
		moviesVO.setLocation(location);
		moviesVO.setSummary(summary);
		moviesVO.setPoster(poster);
		
		int insertMovieCount = 0;
		try {
			insertMovieCount = this.moviesDao.insertNewMovie(dbSupporter, moviesVO);
		}
		catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
		}
		
		int insertDirectorsCount = 0;
		
		
		// 영화 등록에 성공했다면 
		if (insertMovieCount > 0) {
			// 제작 정보를 insert 한다.
			// 영화 1 ----n제작n------ 1 감독 (하나의 영화는 여러 명의 감독이 제작할 수 있기 때문에 감독을 List형태로 가져온다. 데이터베이스의 관계 때문.
//			directorsId.forEach((directorId) -> {
//				// 람다는 외부 변수에 대한 존재를 알지 못 한다. 람다에서 값을 초기화할 수도 없다. final을 사용하라고 하는 이유도 값이 변경되지 않는 것을 보장해야 하기 때문이다.
//				insertDirectorsCount += this.producingDao.insertNewProducing(dbSupporter, directorId, newMoviePk);
//			});
			for (String directorId : directorsId) {
				try {
					insertDirectorsCount += this.producingDao.insertNewProducing(dbSupporter, directorId, newMoviePk);
				}
				catch (RuntimeException re) {
					re.printStackTrace();
					dbSupporter.rollback();
					dbSupporter.close();
					return false;
				}
			}
		}

		dbSupporter.close();
		return insertDirectorsCount > 0;
	}
}
