package com.capgemini.filehandling.test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

import com.capgemini.filehandling.model.GrepApplication;

public class GrepApplicationTest {

	@Test
	public void testToCheckStringIsPresentOrNot() throws IOException 
	{
		GrepApplication grep = new GrepApplication();
		
		TreeMap<Integer, String> map1 = grep.checkString();
		int a= 0;
		for(Entry<Integer, String> m : map1.entrySet())
		{
			System.out.println(" " + m.getKey() + " " + m.getValue() );
			while(map1.size() > a)
			{
				assertThat(m.getValue(), containsString("CoreJava"));
			}
		}
	}

	
	
}
