package hello_java_world;

public class _03_CompareOperator {
	public static void main(String[] args) {
		
		// 비교연산자의 결과는 항상 boolean(true/false)
		int num1 = 10;
		int num2 = 5;
		
		// boolean의 변수명은 동사로 표현한다
		boolean isEquals = num1 == num2;
		boolean isNum1GreaterThanNum2 = num1 > num2;
		boolean isNum1GreaterOrEqualsThanNum2 = num1 >= num2;
		boolean isNum1LessThanNum2 = num1 < num2;
		boolean isNum1LessOrEqualsThanNum2 = num1 <= num2;
		boolean isNotEquals = num1 != num2;
		
		System.out.println(isEquals); // false
		System.out.println(isNum1GreaterThanNum2); // true
		System.out.println(isNum1GreaterOrEqualsThanNum2); // true
		System.out.println(isNum1LessThanNum2); // false
		System.out.println(isNum1LessOrEqualsThanNum2); // false
		System.out.println(isNotEquals); // true
		
		System.out.println("-----");
		
		boolean and = true && true;
		System.out.println(and); // true
		
		and = true && false;
		System.out.println(and); // false
		
		and = false && true;	 // dead code
		System.out.println(and); // false
		
		and = false && false;	 // dead code
		System.out.println(and); //false
		
		System.out.println("-----");
		
		boolean or = true || true; // dead code
		System.out.println(or); // true
		
		or = true || false;	// dead code
		System.out.println(or); // true
		
		or = false || true;
		System.out.println(or); // true
		
		or = false || false;
		System.out.println(or); // false
		
	}
}
