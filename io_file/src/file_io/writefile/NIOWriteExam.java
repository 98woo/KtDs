package file_io.writefile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
//import constants;


public class NIOWriteExam {
	
	// 가변인자 
	public static int getSum(int ...numbers) {
								// 가변인자는 항상 뒤에 작성해야 한다. 가변인자를 앞에 작성하면 어디까지가 가변인자인지 자바에서 알 수 없기 때문이다.
		
		System.out.println(numbers);
		int sum = 0;
		for (int i : numbers) {
			System.out.println(i);
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		boolean append = true;
		
		File file = new File("C:\\outputs2", "java_outputs2.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		if ( ! append ) {
			int index = 2;
			while (file.exists()) {
				file = new File("C:\\java\\outputs", "java output (" + (index++) + ").txt");
			}
		}
		
		List<String> fileDesc = new ArrayList<>();
		fileDesc.add("파일을 씁니다.1)");
		
		try {
//			Set<StrandardOpenOption> defualtOption =
//			Set.of(StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
			if (! append ) {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"));
			}
			else {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			}
		} catch(IOException e) {
			
		}
	}
	
	
}
