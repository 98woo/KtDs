package hello_java_world;

public class _04_ForProblem1 {
	public static void main(String[] args) {
		
		// 1부터 100까지의 합을 구하시오
		int sum = 0;
		
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
