package hello_java_world;

public class _03_ArithmaticOperator {

	public static void main(String[] args) {
	
		int number1 = 10;
		number1 += 2;
		System.out.println(number1);
		
		int number2 = 10;
		number2 -= 2;
		System.out.println(number2);
		
		int number3 = 10;
		number3 *= 2;
		System.out.println(number3);
		
		int number4 = 10;
		number4 /= 4;
		System.out.println(number4);
		
		int number5 = 10;
		number5 %= 4;
		System.out.println(number5);	
		
		System.out.println("-----");	
		
		// 단항연산자
		int num1 = 10;
		int num2 = 20;
		
		num1++;
		num2++;
		
		System.out.println(num1); // 11
		System.out.println(num2); // 21
		
		System.out.println(num1++); // 11, num1 = 12
		System.out.println(num2++); // 21, num2 = 22
		
		System.out.println(++num1); // 13
		System.out.println(++num2); // 23
		
		num1 = 10;
		num2 = 20;
		
		// 단독으로 사용할 경우 문제없음
		num1--;
		num2--;
		
		System.out.println(num1); // 9
		System.out.println(num2); // 19
		
		System.out.println(num1--); // 9, num1 = 8
		System.out.println(num2--); // 19, num2 = 18
		
		System.out.println(--num1); // 7
		System.out.println(--num2); // 17
		
		
		
	}
}
