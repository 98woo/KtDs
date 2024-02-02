package ref11_vending_machine_fileio.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import constants.AppendType;

public class NIOFileUtil {
	
	public static File findFile(String fileName, File from) {
		if (from == null) {
			from = new File("C:\\");
		}
		if (from.exists() && from.isDirectory()) {
			File[] itemIndir = from.listFiles();
			
			if (itemIndir != null) {
				for (File item : itemIndir) {
					if (item.isDirectory()) {
						File result = findFile(fileName, item);
						if (result != null) {
							return result;
						}
					}
					else if (item.getName().equals(fileName)) {
						return item;
					}
				}
			}
		}
		else if (from.getName().equals(fileName)) {
			return from;
		}
		return null;
	}
	
	public static void writeFile(String parent, String name, String description, AppendType appendType) {
		File file = new File(parent, name);
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		if ( appendType == AppendType.OVER_WRITE ) {
			int index = 2;
			while (file.exists()) {
				file = new File("C:\\java\\outputs", "java output (" + (index++) + ").txt");
			}
		}
		
		List<String> fileDesc = new ArrayList<>();
		fileDesc.add(description);
		
		try {
//			Set<StrandardOpenOption> defualtOption =
//			Set.of(StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
			if ( appendType == AppendType.APPEND ) {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
			}
			else {
				Files.write(file.toPath(), fileDesc, Charset.forName("UTF-8"));
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(file.getAbsolutePath());
	}
}
