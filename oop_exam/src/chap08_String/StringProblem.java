package chap08_String;

import java.util.Scanner;

public class StringProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String defaultWord = "자전거";
		String preWord = "";
		int count = 0;
		
		// 게임 시작시, 시작단어 설정
		if(count == 0) {
			System.out.println("끝말잇기 시작단어: " + defaultWord);
			preWord = defaultWord;
			count++;
		}
			
		while(true) {

			// 단어 입력받아 공백 제거
			System.out.print("단어를 입력해주세요: ");
			String inputWord = sc.nextLine().trim();
			System.out.println("입력단어: " + inputWord);

			// 단어길이 검증
			if(inputWord.length() < 3) {
				System.out.println("3글자 이상의 단어를 입력해주세요. 끝말잇기 게임을 종료합니다. \n릴레이 횟수: " + count);
				sc.close();
				return;
			}
			
			// 단어 시작 검증
			String lastWord = preWord.substring(preWord.length()-1); // 이전 단어 마지막 글자
			
			if(!(inputWord.startsWith(lastWord))) {
				System.out.println("문자가 일치하지 않습니다. 끝말잇기 게임을 종료합니다. \n릴레이 횟수: " + count);
				sc.close();
				return;
			}
			
			preWord = inputWord;
			count++;
		}
	}
}
