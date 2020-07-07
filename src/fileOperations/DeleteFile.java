package fileOperations;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	
	void deletefromrepository()
	{
		System.out.println ("Enter the Filename");
		Scanner reader = new Scanner(System.in);
		String filename = reader.nextLine();
		String directory = "";
		File f = new File(directory+filename);
		if (!f.exists())
		{
			System.out.println("File doesn't exists");
		}
		else
		{
			Boolean Success = f.delete();
			if (Success)
			{
				System.out.println("File deleted Successfully");
			}
			else
			{
				System.out.println("Failed to Delete the File");
			}
		}
	}

}
