package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.filehandling.model.FileExistApplication;

public class FileExistApplicationTest {

	@Test
	public void testForFileExistance() 
	{
		FileExistApplication fileExist = new FileExistApplication();
		assertEquals(true, fileExist.checkFileExist());
	}
	
	@Test
	public void testForFileNotExistance() 
	{
		FileExistApplication fileExist = new FileExistApplication();
		assertEquals(true, fileExist.checkFileExist());
	}

}
