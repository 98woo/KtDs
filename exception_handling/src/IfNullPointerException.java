

public class IfNullPointerException {
	
	public static void main(String[] args) {
		
		String name1 = null;
		String name2 = "이름";

//		System.out.println(name.equals("이름")); // NullPointerException
		System.out.println(strCheck(name1).equals("이름"));
		System.out.println(strCheck(name2).equals("이름"));


	}
	
	public static String strCheck(String name) {
		if(name == null) {
			return "ERORR";
		}
		return name;
	}

}
