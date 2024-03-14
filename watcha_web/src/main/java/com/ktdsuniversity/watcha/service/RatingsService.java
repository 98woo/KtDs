package com.ktdsuniversity.watcha.service;

import com.ktdsuniversity.watcha.dao.RatingsDao;
import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.RatingsVO;

public class RatingsService {

	private RatingsDao ratingsDao;
	
	public RatingsService() {
		this.ratingsDao = new RatingsDao();
	}
	
	public boolean createNewRating (String ratingId
								  , double rating
								  , String description
								  ,	String movieId
								  ,	String userId) {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();
		
		RatingsVO ratingsVO = new RatingsVO();
		
		ratingsVO.setRatingId(ratingId);
		ratingsVO.setRating(rating);
		ratingsVO.setDescription(description);
		ratingsVO.setMovieId(movieId);
		ratingsVO.setUserId(userId);
		
		int insertedCount = 0;
		try {
			insertedCount = this.ratingsDao.insertNewRating(dbSupporter, ratingsVO);
		}
		catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
			return false;
		}
		dbSupporter.close();
		return insertedCount >  0;
	}
}
