package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.filehandling.model.WordCountApplication;

public class WordCountApplicationTest {

	@Test
	public void testForCountingWords() throws IOException 
	{
		WordCountApplication wordCount = new WordCountApplication();
		assertEquals(74, wordCount.checkWordCount());
	}
	
}
