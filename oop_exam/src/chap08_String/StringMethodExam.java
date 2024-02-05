package chap08_String;

public class StringMethodExam {
	
	public static void main(String[] args) {
		
		// contains()
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul1 = address.contains("서울");
		System.out.println(isSeoul1); // true
		
		// endWith()
		boolean isSeoul2 = address.endsWith("176");
		System.out.println(isSeoul2); // true
		
		// equals() : 대소문자 구분
		String name = "ktdsuniversity";
		boolean isEqual1 = name.equals("ktdsUniversity");
		System.out.println(isEqual1); // false
		
		// equalsIgnorCase() : 대소문자 무시
		boolean isEqual2 = name.equalsIgnoreCase("ktdsUniversity");
		System.out.println(isEqual2); // true
		
		// indexOf() : 처음 위치 / index 0부터 시작 / 없다면 -1 반환
		String alphabets = "abcdefag";
		int letterIndex1 = alphabets.indexOf('c');
		System.out.println(letterIndex1); // 2
		
		// indexOf() : 대소분자 무시
		int letterIndex2 = alphabets.indexOf('C');
		System.out.println(letterIndex1); // 2
		
		// indexOf() : 시작위치 반환
		int letterIndex3 = alphabets.indexOf("def");
		System.out.println(letterIndex1); // 2
		
		// lastIndexOf() : 마지막 위치 / index 0부터 시작 / 없다면 -1 반환
		String message = "abcdefgaijkb";
		int letterIndex4 = message.lastIndexOf('a');
		System.out.println(letterIndex4); // 7
		
		int letterIndex5 = message.lastIndexOf("jj");
		System.out.println(letterIndex5); // -1
		
		// length() : 문자열 길이 반환
		int letterIndex6 = message.length();
		System.out.println(letterIndex6); // 12
		
		// matches() : 정규표현식과 일치하는지 확인
		String phone = "01012341234";
		boolean isNumber = phone.matches("^[0-9]+$");
		System.out.println(isNumber); // true
		
		// replace() : 특정 문자열 변경
		String say = "안녕하세요, 김춘식님. 반갑습니다, 김춘식님.";
		say = say.replace("김춘식", "김춘배"); 
		System.out.println(say); // 안녕하세요, 김춘배님. 반갑습니다, 김춘배님.
		
		// replaceAll() : 특정 문자열 전부 변경 - 정규표현식 사용
		String phoneNum = "010-1234-1234";
		phoneNum = phoneNum.replaceAll("[^0-9]", "");
		System.out.println(phoneNum); // 01012341234
		
		// split() : 특정 문자열 기준으로 자르기
		String phone2 = "010-1234-5678";
		String[] phoneArea = phone2.split("-");
		System.out.println(phoneArea[0]);
		System.out.println(phoneArea[1]);
		System.out.println(phoneArea[2]);
		
		// startWith() : 문자열 시작값 비교
		String phoneKor = "+82-010-1234-1234";
		boolean isKorNum = phoneKor.startsWith("+82");
		System.out.println(isKorNum); // true
		
		// substring() : index 기준으로 문자열 추출하기
		String datetime = "2024-01-25 14:34:22";
		String year = datetime.substring(0, 4);
		System.out.println(year); // 2024
		
		String hour = datetime.substring(11, 13);
		System.out.println(hour); // 14
		
		String time = datetime.substring(11);
		System.out.println(time); // 14:34:22
		
		// trim() : 문자열 앞뒤 공백 제거
		String menu = " coffee ";
		System.out.println(menu.length()); // 8
		System.out.println(menu); // _coffee_
		
		menu = menu.trim();
		System.out.println(menu.length()); // 6
		System.out.println(menu); // coffee
		
		// valueOf() : 문자열 형식으로 형변환 -> 잘 사용 X
		String iStr = String.valueOf(1);
		System.out.println(iStr);
		boolean isString1 = (iStr.equals(1)); // false
		boolean isString2 = (iStr.equals("1")); // true
		System.out.println(isString1 + ", " + isString2);
		
		String iStri = 1 + "";
		System.out.println(iStr);
		isString1 = (iStri.equals(1)); // false
		isString2 = (iStr.equals("1")); // true
		System.out.println(isString1 + ", " + isString2);
	
	}
}
