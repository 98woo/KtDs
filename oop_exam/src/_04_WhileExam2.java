

import java.util.Scanner;

public class _04_WhileExam2 {
	
	public static void startGame() {

		/**
		 *  UpDown 게임을 실행하는 메소드 정의
		 */
		Scanner keyboard = new Scanner(System.in);
		double randomNumber = Math.random();
		
		int answer = (int) (randomNumber * 100);
		int value = 0;
		
		while(true) {
			
			System.out.print("숫자를 입력하세요");
			value = keyboard.nextInt();
			
			if(answer == value) {
				System.out.println("정답입니다.");
				break; // 무한반복 종료
			} else if(answer > value) {
				System.out.println("Up!");
			} else {
				System.out.println("Down!");
			}
		}
		
	}
	
	public static void main(String[] args) {
		// UpDown 게임을 실행하기 위해 메소드 호출
		startGame();
	}
}
