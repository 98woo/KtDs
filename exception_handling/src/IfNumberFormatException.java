
public class IfNumberFormatException {
	
	public static void main(String[] args) {
		
		String numString = "123";
//		int num = Integer.parseInt(numString);
		int num = stringCheck(numString);
		System.out.println(num); // 123
		
		numString = "망곰";
//		num = Integer.parseInt(numString);
		num = stringCheck(numString);
		System.out.println(num); // NumberFormatException
	}
	
	public static int stringCheck(String str) {
		if(str.matches("^[0-9]+$")) {
			return Integer.parseInt(str);
		}
		return -1;
	}
}
