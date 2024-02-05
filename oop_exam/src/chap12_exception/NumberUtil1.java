package chap12_exception;

public class NumberUtil1 {
	
	/**
	 * 문자를 숫자로 변경
	 * @param str 숫자형태의 문자열
	 * @return 문자를 숫자로 변경한 결과 (숫자 형태의 문자가 아니라면, NumberFormatException 에러 발생)
	 */
	public static int convertToInt(String str) {
		
		// 문자를 숫자로 바꾸는 방법
		// validation check
		if(str.matches("^[0-9]+$")) {
			int number = Integer.parseInt(str);
			return number;
		}
		return 0;
	}
	
	/**
	 * 문자를 숫자로 변경
	 * @param str 숫자형태의 문자열
	 * @param defaultValue str이 숫자형태의 문자가 아닐 때, 반환될 값
	 * @return 문자를 숫자로 변경한 결과
	 */
	public static int convertToInt(String str, int defaultValue) {
		int number = 0;
		
		try {
			number = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
		
		return number;
	}
	
	public static void main(String[] args) {
		
//		int[] scoreArray = new int[3];
//		scoreArray[4] = 4; // ArrayIndexOutOfBoundsException

//		String address = null;
//		System.out.println(address.contains("서울")); // NullPointerException
		
		// NumberFormatException
		String name = "춘식";
//		if (name.matches("^[0-9]+$")) { // 숫자 형식인지 확인 -> 예외 방어
//			int num = NumberUtil1.convertToInt(name);
//			System.out.println(num); 
//		}
		int num = NumberUtil1.convertToInt(name);
		System.out.println(num); 
		
		String str = "100";
		int number = NumberUtil1.convertToInt(str);
		System.out.println(number);
		
		str = "이름";
//		number = NumberUtil1.convertToInt(str);
//		System.out.println(number); // NumberFormatException
		number = NumberUtil1.convertToInt(str, -1);
		System.out.println(number);
	}

}
