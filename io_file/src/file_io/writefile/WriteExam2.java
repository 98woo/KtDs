package file_io.writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import file_io.fileInfo.ReadAndPrintExam;

public class WriteExam2 {
	
	/**
	 * 파일을 쓴다
	 * @param parent 파일을 쓸 경로
	 * @param filename 쓸 파일의 이름
	 * @param append 이어서 쓸 것인지 여부
	 */
	public static void writeFile(String parent, String filename, boolean append) {

		File file = new File(parent, filename);

		if(! file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		// 원본 파일 내용 저장
		List<String> originalFileDescription = new ArrayList<>();
		
		if( !append ) {
			// 원본 파일에 이어서 쓰지 않을 것이라면
			int index = 2;
			while(file.exists()) {
				file = new File(file.getParent(), 
						"java_output (" + (index++) + ").txt");
			}
		} else {
			// 원본 파일에 이어서 쓸 것이라면
			// 기존의 파일 내용을 읽어와서 List<String>으로 반환 받는다.
			// 반환 받은 내용을 originalFileDescription에 addAll 한다.
			originalFileDescription.addAll(ReadAndPrintExam.getAllLines(file));
		}

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file, Charset.forName("UTF-8"));
			bw = new BufferedWriter(fw);
			
			// 읽어온 내용 쓰기
			if(append) {
				for(String originalFileLine : originalFileDescription) {
					bw.write(originalFileLine);
				}
			}
			// 추가할 내용 쓰기
			bw.write("1. 파일에 추가로 씁니다.\n");
			bw.write("2. 파일에 추가로 씁니다.\n");
			bw.write("3. 파일에 추가로 씁니다.\n");
			bw.flush();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException ioe) {
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch(IOException ioe) {
				}
			}
		}
		System.out.println(file.getAbsolutePath());
	}
	
	public static void main(String[] args) {
		writeFile("C:\\java\\outputs", "java_output.txt", false);
		writeFile("C:\\java\\outputs", "java_output.txt", true);
		writeFile("C:\\java\\outputs", "java_output.txt", true);
		writeFile("C:\\java\\outputs", "java_output.txt", false);
	}
}
