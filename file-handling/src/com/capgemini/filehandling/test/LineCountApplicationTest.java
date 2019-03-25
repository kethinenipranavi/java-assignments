package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.filehandling.model.LineCountApplication;

public class LineCountApplicationTest {

	@Test
	public void testForCountingLines() throws IOException 
	{
		LineCountApplication lineCount = new LineCountApplication();
		assertEquals(20, lineCount.checkLineCount());
	}

}
