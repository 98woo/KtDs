package hello_java_world;

public class _01_HelloJava {
	
	/**
	 * Document (주석)
	 * 주석: 코드의 설명을 위한 영역, 코드 실행과는 관계없음
	 * 
	 * Java 파일을 실행시키기 위한 코드
	 * public static void main(String[] args)
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Multiline 주석
		System.out.println("Hello, Java world");
		System.out.println("Hello, Java world");
		System.out.println("Hello, Java world");
		System.out.println("Hello, Java world");
		System.out.println("Hello, Java world");
		
		 */
		
		// Singleline 주석
		// System.out.println("Hello, Java world");
		
		
		// int형 number 변수를 정의
		int number;
		
		// number 변수에 값을 할당
		number = 10;
		
		// int형 number2 변수를 정의하고 동시에 값을 할당
		int number2 = 20;
		
		// 소수점
		double pie = 3.14;
//		int pieError = 3.14;
		

		long test1 = 30_000_000_000L;
//		long test2 = 30_000_000_000;
			
		
		
		byte byteNumber = 1;
		System.out.println(byteNumber);
		byteNumber = 2;
		System.out.println(byteNumber);
		
		short shortNumber = 10;
		System.out.println(shortNumber);
		shortNumber = 11;
		System.out.println(shortNumber);
		
		int intNumber = 20;
		System.out.println(intNumber);
		intNumber = 21;
		System.out.println(intNumber);
		
		long longNumber = 30L;
		System.out.println(longNumber);
		longNumber = 31L;
		System.out.println(longNumber);
		
		
		float floatNumber = 1.11f;
//		float floatNumberError = 1.11;
		System.out.println(floatNumber);
		
		double doubleNumber = 2.22;
		System.out.println(doubleNumber);
		
		
		char letter = 'A';
		System.out.println(letter);
		
//		letter = 'AB'; // Invalid character constant
		
		letter = '1';
		System.out.println(letter);
		
		System.out.println(letter+1); // 50
		
		
		// 불리언
		boolean areYouStudent = true;
		System.out.println(areYouStudent);
		
		boolean areYouDesigner = false;
		System.out.println(areYouDesigner);


		// 상수
		final int SPEED_OF_LIGHT = 299_792_458;
		System.out.println(SPEED_OF_LIGHT);
		
//		speedOfLight = 10; // The final local variable speedOfLight cannot be assigned.
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);


		// 묵시적 형변환
		int normalNumber = Integer.MAX_VALUE;
		long bigNumber = normalNumber;
		System.out.println(normalNumber);
		System.out.println(bigNumber);
		
		// 명시적 형변환
		long bigNumber1 = Integer.MAX_VALUE + 1L;
		int normalNumber1 = (int) bigNumber1;
		System.out.println(bigNumber1);
		System.out.println(normalNumber1); // -2147483648
		System.out.println(normalNumber1 + 1); // -2147483647
		
		
		// 정수 -> 부동소수점 : 묵시적 형변환
		int num = 10;
		float fNum = num;
		double dNum = num;
		
		System.out.println(num);
		System.out.println(fNum);
		System.out.println(dNum);
		
		
		// 부동소수점 -> 정수 : 명시적 형변환
		float ffNum = 10.5f;
		int nnum = (int) ffNum;
		System.out.println(ffNum);
		System.out.println(nnum);
		
		double ddNum = 10.11;
		int nnnum = (int) ddNum;
		System.out.println(ddNum);
		System.out.println(nnnum);

		
		double dnum1 = 29.37; // 29.37
		double dnum2 = dnum1 * 10; // 293.7
		System.out.println(dnum2);
		
		dnum2 = Math.round(dnum2); // 294.0
		System.out.println(dnum2);
		
		double dnum3 = dnum2 / 10 ; // 29.4
		System.out.println(dnum3);
		
		
		
		
		
		
		
		
		
		
	}

}
