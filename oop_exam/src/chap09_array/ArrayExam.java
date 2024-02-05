package chap09_array;

/**
 * 배열 실습
 */
public class ArrayExam {
	
	public static void main(String[] args) {
		
		int[] scoreArray = new int[7];
		
		scoreArray[0] = 1;
		scoreArray[1] = 2;
		scoreArray[2] = 3;
		scoreArray[3] = 4;
		scoreArray[4] = 5;
		scoreArray[5] = 6;
		scoreArray[6] = 7;
		
		System.out.println(scoreArray); // [I@1f32e575
		System.out.println(scoreArray.length); // 7
		
		System.out.println(scoreArray[0]); // 1
		// System.out.println(scoreArray[-1]); // ArrayIndexOutOfBoundsException
		// System.out.println(scoreArray[7]);  // ArrayIndexOutOfBoundsException
		
		int score = scoreArray[4];
		System.out.println(score); // 5
		
		int sum = 0;
		
		// for (초기값; 반복조건체크; 증감식) { ... }
		// index 필요할 때 사용
		for(int i = 0; i < scoreArray.length; i++) {
			System.out.println("for: " + scoreArray[i]);
			sum += scoreArray[i];
		}
		System.out.println(sum);
		
		System.out.println("---------------------------------");
		
		// for-each(향상된 for)
		// for (데이터타입 변수명 : 배열) { ... }
		// index 필요 없이 배열 전체를 순회할 때 사용
		for(int score1 : scoreArray) {
			System.out.println("for-each: " + score1);
		}
		
		
		System.out.println("---------------------------------"); 
		
		String[] names = new String[3];
		
		names[0] = "춘식";
		names[1] = "춘배";
		names[1] = "망곰";
		
		System.out.println(names); // [Ljava.lang.String;@279f2327
		System.out.println(names[1]); // 김춘배
		
		String name = names[0];
		System.out.println(name); // 김춘식
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("for: " + names[i]);
		}	
		
		for(String name1 : names) {
			System.out.println("for-each: " + name1);
		}
	}
}
