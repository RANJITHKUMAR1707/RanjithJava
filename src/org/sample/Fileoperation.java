package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Fileoperation {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\tuesday\\class");

		FileUtils.write(f, "Hi Iam Ranjith");

		FileUtils.write(f, "PERI", false);

		FileUtils.write(f, "college", true);
		
		List<String> rl = FileUtils.readLines(f);
		
		for (String string : rl) {
			
			System.out.println(string);
		}
		
		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);
		
		boolean delete = f.delete();
		System.out.println(delete);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
