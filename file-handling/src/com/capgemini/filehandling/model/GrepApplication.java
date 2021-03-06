package com.capgemini.filehandling.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrepApplication {
	public int line;
	public int count;

	public TreeMap<Integer, String> checkString() throws IOException {
		String word = "exist";
		String content;
		int result = 0;
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		FileReader reader = new FileReader("C:\\pranavi\\core-java\\Basic-Assignments\\src\\ArmstrongNumber.java");
		BufferedReader breader = new BufferedReader(reader);
		while ((content = breader.readLine()) != null) {
			int count = 0;

			Pattern p = Pattern.compile(word);
			Matcher m = p.matcher(content);

			++line;

			while (m.find()) {
				count++;
			}
			if (count > 0) {
				System.out.println("Line Number" + line + "contains count of exist is" + count);
				map.put(line, content);
			}
		}
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		breader.close();
		reader.close();
		return map;
	}

}
