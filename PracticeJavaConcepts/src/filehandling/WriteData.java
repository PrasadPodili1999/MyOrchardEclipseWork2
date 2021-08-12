package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
		String path="C:\\JavaFile/File1.txt";
		FileWriter fw=null;
		try
		{
			fw=new FileWriter(path);
			fw.write("hello world prasad");
			fw.flush();
			System.out.println("writing data is done!!!");
		}
		catch(IOException e)
		{
			System.out.println("exception occured while writing data");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
