package generic_collection;

public class ScoreListGeneric<T> {
	
	// ScoreList가 관리할 배열
	private Object[] scoreArray;
	
	// 배열 내에 들어있는 아이템들의 수 (배열의 길이와는 관계 없다)
	private int size;
	
	public ScoreListGeneric() {
		this.scoreArray = new Object[2];
	}
	
	/**
	 * scoreArray 배열에 값을 추가
	 * @param score 제네릭에 할당된 타입의 인스턴스 혹은 값
	 */
	public void add(T score) {
		if(size >= scoreArray.length) {
			Object[] tempScoreArray = new Object[scoreArray.length + 2];
			System.arraycopy(scoreArray, 0, tempScoreArray, 0, scoreArray.length);
			scoreArray = tempScoreArray;
		}
		scoreArray[size] = score;
		size += 1;
	}
	
	/**
	 * scoreArray 배열에서 index값 반환
	 * @param index 반환시킬 배열의 인덱스
	 * @return 인덱스에 들어있는 인스턴스 혹은 값
	 */
	public T get(int index) {
		// 예외 처리!
		if(index >= size) {
			throw new IndexOutOfBoundsException(index);
		}
		return (T) scoreArray[index];
	}
	
	/**
	 * scoreArray 배열에 인스턴스 혹은 값이 들어있는 개수 구하기
	 * <pre>
	 *  int[] scoreArray = new int[100];
	 *  scoreArray[0] = 100;
	 *  scoreArray[1] = 100;
	 * </pre>
	 * size()의 결과는 2가 반환된다.
	 * @return scoreArray 배열에 인스턴스 혹은 값이 들어있는 개수
	 */
	public String size() {
		return "배열의 길이: " + this.scoreArray.length +
				", 값의 개수" + this.size;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ScoreList [ ");
		// null값은 출력x -> 값이 들어있는 크키만큼만 반복해라
		for(int i = 0; i < size; i++) {
			sb.append(scoreArray[i] + " ");
		}
		sb.append("]"); 
		return sb.toString();
	}
}
