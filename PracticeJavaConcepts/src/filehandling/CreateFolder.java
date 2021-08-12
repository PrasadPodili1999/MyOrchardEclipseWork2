package filehandling;
import java.io.File;
import java.io.IOException;
public class CreateFolder {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("C:\\JavaFile/File1.txt");
		if(f1.exists()==false)
		{
			try
			{
				f1.createNewFile();
				System.out.println("folder created successfully");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("folder already existed");
		}
		
	}

}
