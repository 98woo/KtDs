package generic_collection;

public class ScoreListInt {
	
	private int[] scoreArray;
	private int size;
	
	public ScoreListInt() {
		scoreArray = new int[2];
	}
	
	/**
	 * scoreArray 배열에 값을 추가
	 * @param score
	 */
	public void add(int score) {
		
		if(size >= scoreArray.length) {
			int[] tempScoreArray = new int[scoreArray.length + 2];
			System.arraycopy(scoreArray, 0, tempScoreArray, 0, scoreArray.length);
			scoreArray = tempScoreArray;
		}
		scoreArray[size] = score;
		size += 1;
	}
	
	/**
	 * scoreArray 배열에서 index값 반환
	 * @param index
	 * @return
	 */
	public int get(int index) {
		if(index >= size) {
			throw new IndexOutOfBoundsException(index);
		}
		return scoreArray[index];
	}
	
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ScoreList [ ");
		for(int i = 0; i < size; i++) {
			sb.append(scoreArray[i] + " ");
		}
		sb.append("]"); 
		return sb.toString();
	}
	
	

}
