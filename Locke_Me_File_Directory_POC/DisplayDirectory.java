package wireframe;

import java.util.ArrayList;
import java.util.Collections;

public class DisplayDirectory {
	
	public void DisplayDirectoryOption(ArrayList<String> FileDirectory)
	{
	 Collections.sort(FileDirectory);
	 System.out.println("RootDirectory\\");
	 for(String str: FileDirectory) System.out.print(" \n"+str);
		
	}
}
