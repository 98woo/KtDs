package chap08_String;

public class StringExam {
	
	public static void changeStr(String str) {
		str += "바뀌었을까요?";
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		String message = "원본입니다.";
		changeStr(message); 
		System.out.println(message);
	}

}









