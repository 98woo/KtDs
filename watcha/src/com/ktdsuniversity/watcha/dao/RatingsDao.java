package com.ktdsuniversity.watcha.dao;

import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.RatingsVO;

public class RatingsDao {

	public int insertNewRating(DBSupporter dbSupporter, RatingsVO ratingsVO) {
		
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO RATINGS ");
		query.append("  (RATING_ID ");
		query.append(" , RATING ");
		query.append(" , DESCRIPTION ");
		query.append(" , MOVIE_ID ");
		query.append(" , USER_ID) ");
		query.append(" VALUES ");
		query.append("  ('RT-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_RATINGS_PK.NEXTVAL, 6, '0') ");
		query.append(" , ? ");
		query.append(" , ? ");
		query.append(" , ? ");
		query.append(" , ?) ");
		
		return dbSupporter.insert(query.toString(), new Object[] {
				ratingsVO.getRatingId(),
				ratingsVO.getRating(),
				ratingsVO.getDescription(),
				ratingsVO.getMovieId(),
				ratingsVO.getUserId()
		});
	}

	public int deletedRatingsByMovieId (DBSupporter dbSupporter, String movieId) {
			
		StringBuffer query = new StringBuffer();
		query.append(" DELETE MOVIES ");
		query.append("   FROM MOIVES ");
		query.append("  WHERE MOVIE_ID = ? ");
		
		return dbSupporter.delete(query.toString(), new Object[] {movieId});
	}
	
	
}
