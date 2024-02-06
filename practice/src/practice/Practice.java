package practice;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	
	public static void main(String[] args) {
		List<String>[] list = new ArrayList[3];
		List<String> list2 = List.of("str", "asd");
		
		System.out.println(list2.get(0));
		
		list[0].addAll(list2);
		
	}
}
