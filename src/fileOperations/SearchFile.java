package fileOperations;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
	void searchfileinrepository() {
		System.out.println("Enter the filename");
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		String filename=reader.nextLine();
		String directory="";
		File f=new File(directory+filename);
		if (f.exists()) {
			System.out.println("File exists");
		}
		else
		{
			System.out.println("File does'nt exists");
		}
	}

}
