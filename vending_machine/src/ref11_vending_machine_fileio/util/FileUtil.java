package ref11_vending_machine_fileio.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import ref11_vending_machine_fileio.Product;

public class FileUtil {
	
	/**
	 * 파일을 쓴다
	 * @param parent 파일을 쓸 경로
	 * @param filename 쓸 파일의 이름
	 * @param description 파일에 쓸 내용
	 * @param append 이어서 쓸 것인지 여부
	 */
	public static void writeFile(String parent, String filename, String description, boolean append) {

		File file = new File(parent, filename);

		if(! file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		List<String> originalFileDescription = new ArrayList<>();
		
		if( !append ) {
			int index = 2;
			while(file.exists()) {
				file = new File(file.getParent(), 
						"java_output (" + (index++) + ").txt");
			}
		} else {
			originalFileDescription.addAll(FileUtil.getAllLines(file));
		}

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file, Charset.forName("UTF-8"));
			bw = new BufferedWriter(fw);
			
			if(append) {
				for(String originalFileLine : originalFileDescription) {
					bw.write(originalFileLine);
				}
			}
			bw.write(description + "\n");
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
	}
	
	// 파일 읽어오기
	public static List<String> getAllLines(File file) {

		if(file.exists() && file.isFile()) {
			
			FileReader reader = null;
			BufferedReader bufferedReader = null;
			
			try {
				reader = new FileReader(file, Charset.forName("UTF-8"));
				bufferedReader = new BufferedReader(reader);
				
				// 반환시킬 리스트 : 원본내용 유지시키기 위해서
				List<String> lineList = new ArrayList<>();
		
				String line = null;		
				while((line = bufferedReader.readLine()) != null) {
					lineList.add(line + "\n");
				}
				
				return lineList;
				
			} catch(IOException ioe) {
				System.out.println(ioe.getMessage());
			} finally {
				if(bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch(IOException ioe) {
						
					}
				}
				if(reader != null ) {
					try {
						reader.close();
					} catch(IOException ioe) {
						
					}
				}
			}	
		}
		// 텅빈 리스트 반환
		return new ArrayList<>();
	}

	public static List<Product> readCSVFile(String parent, String fileName) {
		
		File file = new File(parent, fileName);
		
		// 파일 존재 여부, 파일 여부 확인
		if(file.exists() && file.isFile()) {
			
			// 파일 내용을 전송시킬 파이프 생성
			FileReader reader = null;
			BufferedReader bufferedReader = null;
			
			// File과 관련된 클래스들은 Exception 계열의 예외가 발생 -> try-catch 필수!
			try {
				// 파일을 인코딩(다국어 처리)해서 byte 단위로 가져오기
				reader = new FileReader(file, Charset.forName("UTF-8"));
				// 가져온 파일을 line 단위(\n 기준)로 할당
				bufferedReader = new BufferedReader(reader);
				
				List<Product> csvList = new ArrayList<>();
				Product product = null;
				String[] splittedCsvLine = null;
				
				String line = null;
				
				// 더이상 파일에서 가져올 라인이 없을 때까지 파일 내용 출력
				while((line = bufferedReader.readLine()) != null) {
					// 매 라인 읽어와서
					product = new Product(); // 인스턴스화
					
					splittedCsvLine = line.trim().split(","); // 공백제거 & ,로 자르기
					product.setName(splittedCsvLine[0].trim());
					product.setPrice(Integer.parseInt(splittedCsvLine[1].trim()));
					product.setQuantity(Integer.parseInt(splittedCsvLine[2].trim()));
					
					// List에 할당시킨다
					csvList.add(product);
				}
				return csvList;
				
			} catch(IOException ioe) {
				// 파일에서 오류가 나면 처리 방법이 없기 때문에, 오류 메세지만 출력
				System.out.println(ioe.getMessage());
			// 메모리 누수가 있을 수 있기 때문에 작업이 끝난 파이프(reader, bufferdeReader)는 닫아주기
			} finally {
				// 파일을 닫을 때는 열었던 순서의 반대로 닫아준다.
				if(bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch(IOException ioe) {
						
					}
				}
				if(reader != null ) {
					try {
						reader.close();
					} catch(IOException ioe) {
						
					}
				}
			}	
		}
		return null;
	}
}
