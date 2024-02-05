package chap01_oop_exam;

public class CalcOperator {
	
	public int get(CalcType type, int num1, int num2) {
		
		System.out.println(type.getSymbol() + "을 합니다.");
		
		if (type == CalcType.ADD) {
			return num1 + num2;
		}			
		// 래퍼런스 타입임에도 == 를 쓰는 이유 -> enum은 단 하나의 인트선스만 만들 수 있기 때문이다.
		// enum을 정의할 때 메모리에 올라간다.(생성된다.)
		else if (type == CalcType.SUB) {
			return num1 - num2;
		}
		else if (type == CalcType.MUL) {
			return num1 * num2;
		}
		else if (type == CalcType.DIV) {
			return num1 / num2;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		CalcOperator calc = new CalcOperator();
		
		int gender = 2;
		
		int result = calc.get(CalcType.ADD, 10, 5);
		System.out.println(result);
		
		result = calc.get(CalcType.SUB, 10, 5);
		System.out.println(result);
		
		result = calc.get(CalcType.MUL, 10, 5);
		System.out.println(result);
		
		result = calc.get(CalcType.DIV, 10, 5);
		System.out.println(result);
		
		// int형 변수를 파라미터로 쓸 수 있기 때문에, 변수를 (다른 의미의) 넣었을 떄 의미를 알 수 없다.
//		result = calc.get(gender, 10, 5);
		System.out.println(result);
	}
}
