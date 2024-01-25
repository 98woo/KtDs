package chap02_class_exam;

import java.util.Random;

public class CraneGameMachine {
	
	boolean isInsertCoin;
	int dolls;
	
	public void insertCoin() {
		if(dolls > 0) {
			System.out.println("동전을 넣었습니다.");
			isInsertCoin = true;
		}
	}
	
	public int doGame() {
		System.out.println("인형을 뽑아주세요.");
		if(isInsertCoin) {
			Random random = new Random();
			int flag = random.nextInt(2);
			
			if(flag != 0 ) {
				dolls -= flag;
				isInsertCoin = false;
				System.out.println("인형 뽑기 성공!");
				return flag;	
			}
		}
		System.out.println("인형 뽑기 실패!");
		return 0;
	}

}
