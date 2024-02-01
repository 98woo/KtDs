package chap99_assignment.part01_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 1 부터 45 중 랜덤한 숫자를 만들어 ArrayList 인스턴스에 넣습니다. 
 * 이때, 생성된 난수의 값이 ArrayList 인스턴스에 이미 존재하는 값이라면, 
 * 인스턴스에 넣어서는 안됩니다.
 * 따라서 ArrayList 인스턴스의 값들은 모두 고유한 값이어야 합니다.
 * ArrayList 내부의 아이템 개수가 6이 될 때까지, 고유한 값들을 넣고
 * 출력하는 코드를 작성하세요.
 */
public class Lotto {
	
	public static List<Integer> getLottoGame(Random random) {
        // 실무코드 : 반복문 내부에서는 변수를 정의하지 않는다
        List<Integer> lottoNumber = new ArrayList<>();
        int randomNumber = 0;

        while(lottoNumber != null && lottoNumber.size() < 6) {
            //int randomNumber = (int) (Math.random() * 45 + 1);
            randomNumber = random.nextInt(45) + 1;
            if (!lottoNumber.contains(randomNumber)) {
                lottoNumber.add(randomNumber);
            }
        }
        lottoNumber.sort((e1, e2) -> e1 - e2);
        return lottoNumber;
	}

    public static void main(String[] args) {

    	Random random = new Random();
    	List<List<Integer>> lottoNumberSet = new ArrayList<>();
        
        // 로또번호를 5번 생상하고 싶으면? (다차원 배열)
        for(int i = 0; i < 5; i++) {
        	lottoNumberSet.add(getLottoGame(random));
        }
        
        for(List<Integer> lotto : lottoNumberSet) {
        	System.out.println(lotto); 
        }
     
    }
}
