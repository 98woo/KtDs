package com.ktdsuniversity.watcha.dao;

import java.util.List;

import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.MoviesVO;

public class MoviesDao {
	
	/**
	 * 다음 PK의 값을 만들어준다. 시퀀스를 PK를 사용하면 동시성 문제가 발생하기 때문이다. PK를 알아야 할 때는 PK를 따로 조회해서 가져온다.
	 */
	public String makeNextValue(DBSupporter dbSupporter) {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT 'MV-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_MOVIES_PK.NEXTVAL, 6, '0') ");
		query.append("   FROM DUAL");
		
		return dbSupporter.selectOne(query.toString(), null, String.class);
	}
	
	public int insertNewMovie(DBSupporter dbSupporter, MoviesVO moviesVO) {
		
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO MOVIES ");
		query.append("  (MOVIE_ID ");
		query.append(" , TITLE ");
		query.append(" , MINIMUM_AGE ");
		query.append(" , OPEN_YEAR ");
		query.append(" , RUNNING_TIME ");
		query.append(" , GENRE ");
		query.append(" , ATMOSPHERE ");
		query.append(" , LOCATION ");
		query.append(" , SUMMARY ");
		query.append(" , POSTER) ");
		query.append(" VALUES ");
		query.append("  (?/*MOVIE_ID*/ ");
		query.append(" , ?/*TITLE*/ ");
		query.append(" , ?/*MINIMUM_AGE*/ ");
		query.append(" , ?/*OPEN_YEAR*/ ");
		query.append(" , ?/*RUNNING_TIME*/ ");
		query.append(" , ?/*GENRE*/ ");
		query.append(" , ?/*ATMOSPHERE*/ ");
		query.append(" , ?/*LOCATION*/ ");
		query.append(" , ?/*SUMMARY*/ ");
		query.append(" , ?/*POSTER*/) ");
		
		return dbSupporter.insert(query.toString(), new Object[] {moviesVO.getMovieId(), moviesVO.getTitle(), moviesVO.getMinimumAge(), moviesVO.getOpenYear(), moviesVO.getRunningTime(), moviesVO.getGenre(), moviesVO.getAtmosphere(), moviesVO.getLocation(), moviesVO.getSummary(), moviesVO.getPoster()});
	}

	public List<MoviesVO> selectMoviesByDirectorId(DBSupporter dbSupporter, String directorId) {
		
		StringBuffer query = new StringBuffer();
		query.append("SELECT * ");
		query.append("  FROM MOVIES "); 
		query.append(" WHERE MOVIE_ID IN (SELECT MOVIE_ID ");
		query.append("   					 FROM PRODUCING ");
		query.append("   					WHERE DIRECTOR_ID = ?) ");
		
		return dbSupporter.selectList(query.toString(), new Object[] {directorId}, MoviesVO.class);
	}
}
