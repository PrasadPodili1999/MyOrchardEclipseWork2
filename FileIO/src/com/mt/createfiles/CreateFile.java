package com.mt.createfiles;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		
		String path2="C:\\JavaFiles/File2.txt";
		String path1="C:\\JavaFiles";
		File f1=new File(path1);
		if(f1.exists()==false)
		{
			f1.mkdir();
			System.out.println("new folder created");
			File f2=new File(path2);
			if(f2.exists()==false)
			{
				try {
					f2.createNewFile();
					System.out.println("new file created");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("file already present");
			}
		}
		else
		{
			System.out.println("folder already present");
		}
	}

}
