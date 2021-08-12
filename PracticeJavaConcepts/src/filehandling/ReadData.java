package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		FileReader fr=null;
		File f1=new File("C:\\JavaFile/File1.txt");
		try
		{
			fr=new FileReader("C:\\JavaFile/File1.txt");
			int size=(int)f1.length();
			char[] c1=new char[size];
			fr.read(c1);
			System.out.println(c1);
			System.out.println("data read successfully!!!");
		}
		catch(IOException e)
		{
			System.out.println("while reading data exception occured!!");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
