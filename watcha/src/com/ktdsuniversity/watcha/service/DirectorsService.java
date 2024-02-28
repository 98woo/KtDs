package com.ktdsuniversity.watcha.service;

import java.util.List;

import com.ktdsuniversity.watcha.dao.DirectorsDao;
import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.DirectorsVO;

/**
 * DB의 트랜잭션을 관리.
 */
public class DirectorsService {

	private DirectorsDao directorsDao;
	
	public DirectorsService() {
		this.directorsDao = new DirectorsDao();
	}
	
	public boolean createNewDirector(String directorsName, String directorsProfile) {
		
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open(); // Database에 연결하는 역할. Autocommit 비활성화 처리.
		
		DirectorsVO directorsVO = new DirectorsVO();
		directorsVO.setName(directorsName);
		directorsVO.setProfile(directorsProfile);
		
		// insert 처리 중에 예외가 발생한다면, 변경사항들을 모두 ROLLBACK 한다.
		int insertedCount = 0;
		try {
			insertedCount = this.directorsDao.insertNewDirector(dbSupporter, directorsVO);
		}
		catch( RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
		}
		
		dbSupporter.close(); // Database와 연결을 해제한다. 별다른 문제가 없었을 때는 Commit을 처리한다.
		return insertedCount > 0;
	}
	
	// 하이버네이트 jp 솔루션이 이렇게 구동된다.(join 안 쓰고)
	public List<DirectorsVO> findDirectorsWithMovies() {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open(); // Database에 연결하는 역할. Autocommit 비활성화 처리.
		
		// 데이터베이스에 등록된 모든 감독을 조회한다.
		List<DirectorsVO> directors = this.directorsDao.selectAllDirectors(dbSupporter);
		// 감독목록을 반복하면서 해당 감독이 제작한 영화 목록을 조회한다.
		directors.forEach((director) -> {
			List<MoviesVO> actors = this.moviesDao.selectActorsByDirectorId(director.getDirectorsId());
			director.setMovies(movies);
		});
		
		dbSupporter.close();
	}
}