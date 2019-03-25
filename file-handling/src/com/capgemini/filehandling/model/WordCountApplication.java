package com.capgemini.filehandling.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication {

	public int checkWordCount() throws IOException
	{
		FileReader reader = new FileReader("C:\\pranavi\\core-java\\Basic-Assignments\\src\\ArmstrongNumber.java");
		BufferedReader breader = new BufferedReader(reader);
		int count = 0;
		String content;
		while ((content=breader.readLine()) != null)
		{
			String s[] = content.split(" ");
			
			for (String string : s) 
			{
				count++;
			}
		}
		System.out.println("Words Counted successfully");
		breader.close();
		reader.close();
		return count;
	}
}
