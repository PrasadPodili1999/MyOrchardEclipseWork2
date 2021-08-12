package com.mt.readfiles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) {
		
		String path="C:\\JavaFiles/File2.txt";
		File f1=new File(path);
		FileReader fr=null;
		try
		{
			int length=(int)f1.length();
			char[] c=new char[length];
			fr=new FileReader(path);
			fr.read(c);
			System.out.println(c);
			System.out.println("reading data completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
