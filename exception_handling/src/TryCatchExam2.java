import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import exception_handling.exceptions.ReadFailException;

public class TryCatchExam2 {
	
	// 사용자 예외: try-catch안에서도 예외 원인을 알수있게 해주자
	// main()에서 try-catch하지 않아도 오류 메세지와 원인을 알 수 있음
	// 실무 코드
	public static List<String> readFile2(File path) {
		try {
			return Files.readAllLines(path.toPath());
		} catch(IOException ioe) {
			throw new ReadFailException("파일을 읽을 수 없습니다.", ioe);
		}

	}
	
	// 예외 위임하기 -> 호출하는 곳에서 예외 처리해~ 
	// 예외 위임하기2. 걍 던져버림 -> 이딴식으로 코드 작성 NOPE
	public static List<String> readFile(File path) throws IOException {
		return Files.readAllLines(path.toPath());
	}
	
	// 예외 위임하기1. 예외를 캐치해서 다른 예외로 감싸서 던지는 것
	public static int convertToInt(String str) throws Exception {
		
		// 말도 안되는 코드! 이런 방법도 있구나~
		try {
			int number = Integer.parseInt(str);
			return number;
		} catch(NumberFormatException nfe) {
			// ReferenceType Instance
			Exception exception = new Exception(str + "는 숫자로 변환할 수 없습니다.", nfe);
//			RuntimeException exception = new RuntimeException(str + "는 숫자로 변환할 수 없습니다.", nfe);
			throw exception; // throw: 예외 던짐(발생), 메서드 종료 -> catch를 하지 않는다면 예외 발생한 곳까지 던짐!
		} finally {
			System.out.println("변환이 완료되었습니다."); // finally: 반드시 실행 보장 (throw 전에 finally 먼저 실행)
		}
//		return 0;
	}
		
	public static void main(String[] args) {
		
		File imageFile = new File("C:\\abcdefg");
//		readFile(imageFile); // try-catch 필요 : ExceptionType
		readFile2(imageFile); // try-catch 필요X : RuntimeExceptionType
		
		// convertToInt("AAA"); 
		// throw로 예외 던졌으니 -> try-catch 해줘야함
		try {
			int num = convertToInt("AAA"); 
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
