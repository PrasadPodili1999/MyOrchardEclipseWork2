package com.mt.sequenceinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceIputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("C:\\JavaFiles/File1.txt");
		File f2=new File("C:\\JavaFiles/File2.txt");
		FileInputStream fis1=new FileInputStream(f1);
		FileInputStream fis2=new FileInputStream(f2);

		SequenceInputStream si=new SequenceInputStream(fis2, fis1);
		int i=0;
		while((i=si.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

}
