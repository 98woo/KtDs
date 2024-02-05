package chap06_staticvar;

public class StringUtils {
	
	private double version = 1.0;
	
	public double getVersion() {
		return this.version;
	}

	
//	public static String repeat1(String str, int times) {
//		System.out.println(version);
//		System.out.println(getVersion());
//	}
	
	
	public static String repeat2(String str, int times) {		
		return str.repeat(times);
	}
	
}






