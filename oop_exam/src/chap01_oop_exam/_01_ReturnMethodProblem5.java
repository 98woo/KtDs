package chap01_oop_exam;

public class _01_ReturnMethodProblem5 {
	
	/**
	 * 성인여부 판단
	 * @param age 나이
	 * @return 성인여부
	 */
	public static boolean isAdult(int age) {
		return age >= 19;
	}
	
	/**
	 * 성인여부에 따른 비행기 요금 
	 * @param age 나이
	 * @return 비행기 요금
	 */
	public static int calculateFare(int age) {
		int flightFare = 0;
		if(isAdult(age)) {
			flightFare = 300_000;
		} else {
			flightFare = 120_000;
		}
		return flightFare;
	}

	public static void main(String[] args) {
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int sum = calculateFare(father) + calculateFare(mother) + calculateFare(daughter);
		
		if(money >= sum) {
			System.out.println("여행가자!");
		} else {
			System.out.println("다음에 가자!");
		}
		
	}
	
}
