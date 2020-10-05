package wireframe;
import java.util.ArrayList;
import java.util.Scanner; 

public class MainScreen {
	
	public static void main(String[] args) {
		
		FileDirectory RootDirectory=new FileDirectory();
		ArrayList<String> FileDirectory = RootDirectory.BuildDirectory();
		
		String SessionStatus = "Enter";
				
		while (1==1)
		{
			if (SessionStatus.equals("Enter"))
			{	
				WelcomeScreen WelcomeScreenDetails=new WelcomeScreen();
				WelcomeScreenDetails.WelcomeScreenDisplay();
				
				String userCommand = "";
				@SuppressWarnings("resource")
				Scanner cmdObj = new Scanner(System.in); 						
		
			do {
				System.out.println("\n\nEnter User Command");
				userCommand = cmdObj.nextLine(); 
				
				switch(userCommand) {
		        case "PD" :
		        	DisplayDirectory CurrentDirectory=new DisplayDirectory(); 
		        	CurrentDirectory.DisplayDirectoryOption(FileDirectory);	        	
		           break;
		        case "S" :	        		        	
		        	Scanner FileNameSearchInput = new Scanner(System.in);	        	
		        	System.out.println("Enter File Name");
		        	
		        	String FileNameSearch = FileNameSearchInput.next();	        	
		        	SearchFile FileSearch=new SearchFile();
		        	
		        	FileSearch.SearchFileOption(FileDirectory,FileNameSearch);	        	
		        	break;
		        case "AD" :
		        	Scanner FileNameAddInput = new Scanner(System.in);	        	
		        	System.out.println("Enter File Name");
		        	
		        	String FileNameAdd = FileNameAddInput.next();	        	
		        	AddFile FileAdd=new AddFile();
		        	
		        	FileDirectory = FileAdd.AddFileOption(FileDirectory,FileNameAdd);	        	
		           break;
		        case "DL" :
		        	Scanner FileNameDelInput = new Scanner(System.in);	        	
		        	System.out.println("Enter File Name");
		        	
		        	String FileNameDel = FileNameDelInput.next();	        	
		        	DeleteFile FileDel=new DeleteFile();
		        	
		        	FileDirectory=FileDel.DeleteFileOption(FileDirectory,FileNameDel);
		        	break;
		        case "M" :
		        	WelcomeScreen WelcomeScreenDetailsCMD=new WelcomeScreen();
		    		WelcomeScreenDetailsCMD.WelcomeScreenDisplay();
		           break;			           
		        case "X" :
			           System.out.println("Exiting Application..\n");
			           System.out.println("<<<Application Exited>>>");
			           SessionStatus = "Exit";
			           break;
		        default :
		           System.out.println("Invalid Command...\n");
				}
					 
			} while(!userCommand.equals("E") && !userCommand.equals("X"));
		}
			else if (SessionStatus.equals("Exit"))			
			{	
				String userCommand = "";
				@SuppressWarnings("resource")
				Scanner cmdObj = new Scanner(System.in); 
			
				do{
				System.out.println("Press E to re-enter Application");
				userCommand = cmdObj.nextLine(); 
				switch(userCommand) {
		        case "E" :
		        	System.out.println("<<<Application Entered>>>\n");
		        	SessionStatus = "Enter";
		           break;		           
		        default :
			           System.out.println("Invalid Command");
					}
		           
				} while(!userCommand.equals("E"));				
			}			
		}
	}
}

