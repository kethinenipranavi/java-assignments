package com.capgemini.filehandling.model;

import java.io.File;

public class FileExistApplication {

	public boolean checkFileExist()
	{
		File file = new File("C:\\pranavi\\core-java\\Basic-Assignments\\src\\ArmstrongNumber.java");
		if(file.exists())
		{
			System.out.println("File Exists");
			return true;
		}
		else
		{
			System.out.println("File does not Exists");
			return false;
		}
	}
}
