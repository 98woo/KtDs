package hello_java_world;

public class _02_Operator {
	
	public static void main(String[] args) {
	
		
		int number = 10;
		
		int addedNumber = number + 2;
		System.out.println(number);
		
		int subtractedNumber = number - 2;
		System.out.println(subtractedNumber);
		
		int multipliedNumber = number * 3;
		System.out.println(multipliedNumber);
		
		
		int devidedNumber = number / 3;
		System.out.println(devidedNumber); // 3

		
		double devidedNumber1 = number / 3;
		System.out.println(devidedNumber1); // 3.0
	
		
		double devidedNumber2 = (double) number / 3;
		System.out.println(devidedNumber2); // 3.3333333333333335
		
		
		double devidedNumber3 = number / 3.0;
		System.out.println(devidedNumber3); // 3.3333333333333335
		
		
		int devidedRemainNember = number % 3;
		System.out.println(devidedRemainNember);
		
		
		String numberString = "A";
		byte byteNumber = Byte.parseByte(numberString);
		System.out.println(byteNumber);

	}

}
