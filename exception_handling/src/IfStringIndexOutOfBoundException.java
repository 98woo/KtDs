
public class IfStringIndexOutOfBoundException {
	
	public static void main(String[] args) {
		
		String logoFilePath = "C:\\images\\logo.png";
		
		/*
		 * logoFilePath 인스턴스에서 logo.png만 추출해 출력해보세요.
		 */
		String findStr = "logo.png";
		int firstIndex = logoFilePath.indexOf(findStr);
		int length = findStr.length();
		String str = logoFilePath.substring(firstIndex, firstIndex + length);

//		강사님 방법		
//		int lastIndexOfBackslash = logoFilePath.lastIndexOf("\\") + 1;
//		String fileName = logoFilePath.substring(lastIndexOfBackslash);
		
		System.out.println("1번: " + str);
		
		
		/*
		 * logoFilePath 인스턴스에서 "images"만 출력해보세요
		 */
		findStr = "images";
		firstIndex = logoFilePath.indexOf(findStr);
		length = findStr.length();
		str = logoFilePath.substring(firstIndex, firstIndex + length);
		
		System.out.println("2번: " + str);
		
		/*
		 * logoFilePath 인스턴스에서 "user_images"만 출력해보세요
		 */
		findStr = "user_images";
		firstIndex = logoFilePath.indexOf(findStr);
		length = findStr.length();
		
		// if(firstIndex >= 0 ) : 권장하지 않음, contains 추천i
		if(logoFilePath.contains(findStr)) {
			// StringIndexOutOfBoundException: Range [-1, 10)
			str = logoFilePath.substring(firstIndex, firstIndex + length); 
			System.out.println("3번: " + str);
		} else {
			System.out.println("3번: Error!");
		}
		
		
		/*
		 * logoFilePath 인스턴스에서 확장자(png)만 출력해보세요
		 */
		int lastIndex = logoFilePath.lastIndexOf(".");
		str = logoFilePath.substring(lastIndex+1);
		System.out.println("4번: " + str);
		
		
		String downloadFilePath = "C:\\images\\logo";
		
		/*
		 * downloadFilePath 인스턴스에서 파일의 확장자를 추출해 출력해보세요.
		 */
		if(downloadFilePath.contains(".")) {
			// StringIndexOutOfBoundException: Range [-1, n)
			lastIndex = downloadFilePath.lastIndexOf(".");
			str = downloadFilePath.substring(lastIndex+1);
			System.out.println("5번: " + str);
		} else {
			System.out.println("5번: 확장자없음!");
		}
	
	}
}
