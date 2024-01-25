package chap08_String;

import java.util.Scanner;

public class StringEqual {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// == 비교
		String str1 = "춘식"; // id=23
		String str2 = "춘식"; // id=23
	
		boolean result1 = (str1 == str2); // true
		boolean result2 = (str1.equals(str2)); // true
		
		String str3 = sc.nextLine(); // id=41
		String str4 = sc.nextLine(); // id=44
		
		boolean result3 = (str3 == str4); // false
		boolean result4 = (str3.equals(str4)); // true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
