package chap01_oop_exam;

public class _01_ReturnMethodProblem3 {
	
	public static int getFahrenheit(int celsius) {
		int fahrenheit = (celsius * 9 / 5) + 32;
		return fahrenheit;
	}
	
	public static void main(String[] args) {
		/*
		 * 변경공식: (섭씨 × 9/5) + 32 = 화씨
		 */
		int celsius = 30;
		int fahrenheit= getFahrenheit(celsius);
		
		System.out.println(fahrenheit);
	}
}
