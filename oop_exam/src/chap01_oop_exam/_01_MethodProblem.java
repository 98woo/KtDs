package chap01_oop_exam;

public class _01_MethodProblem {
	
	// 1 ~ 100 총합
	public static void printSum() {
		int sum = 0;
		
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	// 1 ~ 100 홀수 총합
	public static void printOddSum() {
		
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 1) {
				sum += i;				
			}
		}
		System.out.println(sum);
	}
	
	// 1 ~ 100 : 3,5,6 배수 출력
	public static void printMulti() {
		for(int i = 1; i < 101; i++) {
			if((i % 6 == 0) 
			&& (i % 5 == 0) 
			&& (i % 3 == 0)) {
				System.out.print(i + " ");
			}
		}
	}
	
	// 별 찍기
	public static void printStar() {
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printSum();
		printOddSum();
		printMulti();
		printStar();
	}
}
