package hello_java_world;

import java.util.Scanner;

public class _04_WhileExam2 {
	public static void main(String[] args) {
	
		// 키보드의 입력을 변수로 받아올 수 있도록 도와주는 코드
		Scanner keyboard = new Scanner(System.in);
		
		// 난수 생성
		double randomNumber = Math.random();
		
		// 난수를 0 ~ 99 사이의 정수로 변환
		int answer = (int) (randomNumber * 100);
		
		// 사용자가 입력하는 값을 할당받을 변수를 선언
		int value = 0;
		
		while(true) {
			
			// 사용자에게 숫자를 입력하라고 알려줌
			System.out.print("숫자를 입력하세요");
			
			// 사용자가 keyboard 변수를 이용해 숫자를 입력한 수
			// 엔터를 입력하면 value 변수에 값이 할당된다
			value = keyboard.nextInt();
			
			// 컴퓨터가 만든 난수와 사용자가 입력한 숫자가 일치하는지 확인하고
			// 일치한다면 "정답입니다"를 출력한다.
			if(answer == value) {
				System.out.println("정답입니다.");
				break; // 무한반복 종료
			}	
			// 컴퓨터가 만든 난수보다
			// 사용자가 입력한 값이 더 작다면 "UP"을 출력한다
			else if(answer > value) {
				System.out.println("Up!");
			}
			// 컴퓨터가 만든 난수보다
			// 사용자가 입력한 값이 더 작다면 "down"을 출력한다
			else {
				System.out.println("Down!");
			}
		}
	}
}
