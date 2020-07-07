package fileOperations;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {

	void addfiletodirectory()
	{
		System.out.println("Enter the FileName :");
		Scanner reader = new Scanner(System.in);
		String filename = reader.nextLine();
		String directory = System.getProperty("user.dir");
		
		File f = new File(directory+"\\"+filename);
		if (f.exists())
		{
			System.out.println("File already exists");
		}
		else
		{
			System.out.println("No such file exists, creating now");
			Boolean success = false;
			
			try {
				f.getParentFile().mkdir();
				success = f.createNewFile();
			}
			catch (IOException e)
			{
				System.out.println("Exception while creating file \n");
				//e.printStackTrace();
			}
			finally
			{
				if (success)
				{
					System.out.printf("Successfully created new file: %s%n", f);
				}
				else
				{
					System.out.printf("Failed to create new file: %s%n", f);
					addfiletodirectory();
				}

			}
		}
	}
}
