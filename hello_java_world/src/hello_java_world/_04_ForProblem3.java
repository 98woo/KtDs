package hello_java_world;

public class _04_ForProblem3 {
	public static void main(String[] args) {
		
		// 1부터 100 중 3,5,6의 배수만 출력하시오
		for(int i = 1; i < 101; i++) {
			if(i % 5 == 0 
			&& i % 6 == 0 
			&& i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
