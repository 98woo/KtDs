package chap01_oop_exam;

public class _01_ReturnMethodExam {
	
	/**
	 * 숫자를 원하는 수만큼 곱한 결과를 반환한다.
	 * @param num 곱한 숫자
	 * @param time 곱할 횟수
	 * @return 숫자를 곱한 결과
	 */
	public static int getMultiply(int num, int time) {
		int result = num * time;
		return result;
	}
	
	public static void main(String[] args) {
		int multiplyResult = getMultiply(3, 15);
		System.out.println(multiplyResult);
		
		multiplyResult = getMultiply(2, 6);
		System.out.println(multiplyResult);
	}

}
