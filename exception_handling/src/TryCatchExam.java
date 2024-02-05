import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TryCatchExam {
		
	public static void main(String[] args) {
		
		// 시스템 드라이브에서 특정 경로에 있는 파일 또는 폴더를 읽어온다
		File imageFile = new File("C:\\abcdefg");
		
		try {
			Files.readAllLines(imageFile.toPath()); // NoSuchFileException
		} catch(IOException ioe) {
//		} catch(Exception ioe) { // Exception마다 처리 방법이 다르기 때문에 최대한 구체적인 예외를 작성해주자
			String message = ioe.getMessage();
			System.out.println(message);
			ioe.printStackTrace();
		} finally {
			System.out.println("File을 읽고 finally가 실행되었습니다."); // finally: 반드시 실행 보장
		}
	
	
		try {
			Class.forName("IfArrayIndexOutOfException2"); // ClassNotFoundException
		} catch(ClassNotFoundException cnfe) {
			String message = cnfe.getMessage();
			System.out.println(message);
			
			// 상세한 예외 목록(stack trace)
			cnfe.printStackTrace();
		} 
		
		// 여러가지 예외를 한번에 던질 떄
		// 1. catch(): 발생할 예외만큼 작성 -> java 1.6 코드 중복
		try {
			Class.forName("IfArrayIndexOutOfException2"); // ClassNotFoundException
			Files.readAllLines(imageFile.toPath()); // IOException에 대한 처리가 없음 -> 빨간줄~
		} catch(ClassNotFoundException cnfe) {
			String message = cnfe.getMessage();
			System.out.println(message);
			cnfe.printStackTrace();
		} catch(IOException ioe) {
			String message = ioe.getMessage();
			System.out.println(message);
			ioe.printStackTrace();
		}
		
		// 2. catch() 1번, | 로 발생할 예외 전부 적어주기 (예외 처리가 같을 때 - 코드중복)
		try {
			Class.forName("IfArrayIndexOutOfException2"); // ClassNotFoundException
			Files.readAllLines(imageFile.toPath()); // IOException
		} catch(ClassNotFoundException | IOException cnfe) {
			String message = cnfe.getMessage();
			System.out.println(message);
			cnfe.printStackTrace();
		} 
		
	}
}
