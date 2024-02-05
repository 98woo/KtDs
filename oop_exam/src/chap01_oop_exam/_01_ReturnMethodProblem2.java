package chap01_oop_exam;

/*
 * 교재 168페이지 문제
 */
public class _01_ReturnMethodProblem2 {
	public static void main(String[] args) {
		int processTime = 245;
		int minutes = getMinutes(processTime);
		int seconds = getSeconds(processTime);
		
		System.out.println(minutes + "분 " + seconds + "초");
	}
	
	/**
	 * 수행시간(초)를 파라미터로 받아서, 분(minutes)만 구해 반환시킨다.
	 * @param processTime 수행시간(초)
	 * @return 수행시간(초)를 분(minutes)으로 변환한 결과
	 */
	public static int getMinutes(int processTime) {
		int minutes = processTime / 60;
		return minutes;
	}
	
	/**
	 * 수행시간(초)을 파라미터로 받아서, 분을 제외한 나머지 초(seconds)만 구해 반환시킨다.
	 * @param processTime 수행시간(초)
	 * @return 수행시간(초)을 분(seconds)을 제외한 나머지 초(seconds)로 변환한 결과
	 */
	public static int getSeconds(int processTime) {
		int seconds = processTime % 60;
		return seconds;
	}
}
