package hello_java_world;

public class _04_ForProblem2 {
	public static void main(String[] args) {
		
		// 1부터 100 중 홀수의 합을 구하시오
		int sum1 = 0;
		int sum2 = 0;
		
		// 방법1 : 권장x (for문에서 i는 1만큼 증가하도록 사용)
		for(int i = 1; i < 101; i += 2) {
			sum1 += i;
		}
		
		// 방법2 : 권장
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 1) {
				sum2 += i;
			}
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
