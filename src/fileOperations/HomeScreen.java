package fileOperations;
import java.util.Scanner;

public class HomeScreen{
	
public void displayWelcomeScreen()
{
	System.out.println("***************************************");
	System.out.println("      Lockers Private Limited          ");
	System.out.println("***************************************");
	System.out.println("Developer Name - Madan Mohan Challa");
	System.out.println("***************************************");
	System.out.println("");

	
}

void welcome()
{
	AddFile af = new AddFile();
	DeleteFile df = new DeleteFile();
	SearchFile sf = new SearchFile();
	ListFile lf = new ListFile();
	
	System.out.println("***************************************");
	System.out.println("          Enter your Choice");
	System.out.println("***************************************");
	System.out.println("1. List File");
	System.out.println("2. Add File");
	System.out.println("3. Delete File");
	System.out.println("4. Search File");
	System.out.println("5. Exit");

	Scanner scanner = new Scanner(System.in);
	String choice = scanner.nextLine();
	switch (choice) {
		case "2":
		{
			af.addfiletodirectory();
			welcome();
		}
		case "3":
		{
			df.deletefromrepository();
			welcome();
		}
		case "4":
		{
			sf.searchfileinrepository();
			welcome();
		}
		case "1":
		{
			lf.findallfilesrepo();
			welcome();
		}
		case "5":
		{
			System.out.println("Application Exit");
			System.exit(0);
		}
		default:
		{
			System.out.println("Enter the correct choice");
			welcome();
		}
			
	}
}




	public static void main (String[] args) {
		HomeScreen HS = new HomeScreen();
		HS.displayWelcomeScreen();
		HS.welcome();
		
	}
}

