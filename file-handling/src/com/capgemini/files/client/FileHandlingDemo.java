package com.capgemini.files.client;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {
	public static void main(String [] args) throws IOException{
		
		/*
		 * File file = new File("C:\pranavi\core-java\");
		 * System.out.println(file.exists()); File file1 = new
		 * File("C:\pranavi\core-java\"); File folder = new File("C:\pranavi");
		 * System.out.println(file.exists()); System.out.println(file.isFile());
		 * System.out.println(folder.exists());
		 */
		
		/*
		 * File file = new File("test.txt"); if (!file.exists()) { file.createNewFile();
		 * System.out.println("file is created successfully"); }
		 */
		//FileWriter writer= new FileWriter(file);
		//BufferedWriter writer =new BufferedWriter(new FileWriter(file));
		/*
		 * PrintWriter writer = new PrintWriter(new FileWriter(file, true));
		 * writer.println("Hello...");
		 * 
		 * writer.println("How are you??"); writer.println("I hope you are fine...");
		 * writer.println("Bye...");
		 * 
		 * writer.close();
		 * System.out.println("Content has been written successfully..");
		 */
		
/*		FileReader reader = new FileReader(
				"C:\\pranavi\\core-java\\file-handling\\src\\com\\capgemini\\files\\client\\FileHandlingDemo.java");
		BufferedReader bReader = new BufferedReader(reader);

		PrintWriter writer = new PrintWriter("BankAccount.java");

		String content;

		while ((content = bReader.readLine()) != null) {
			// System.out.println(content);
			writer.println(content);
		}
		System.out.println("--success--");
		writer.close();
		bReader.close();
		reader.close();
	}*/
		/*
		 * File windowsDirectory = new File("c:\\windows");
		 * System.out.println(windowsDirectory.isDirectory()); String content[] =
		 * windowsDirectory.list();
		 * 
		 * for (String s : content) { System.out.println(s); }
		 */
		
		File newDir = new File("myDir");
		if(!newDir.exists()) {
			newDir.mkdir();
			System.out.println("Folder is successfully created...");
		}
		
		File file = new File(newDir,"myfile.txt");
		if(!file.exists());
		file.createNewFile();
		System.out.println("file is created successfully..");
	}

}
