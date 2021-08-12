package com.mt.writefiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) {
		
		String path="C:\\JavaFiles/File2.txt";
		//File f1=new File(path);
		FileWriter fw=null;
		try
		{
			fw=new FileWriter(path);
			fw.write("this is writer class");
			fw.flush();
			System.out.println("writing data has completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
