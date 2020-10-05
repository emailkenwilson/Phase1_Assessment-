package wireframe;

import java.util.ArrayList;

public class SearchFile {

	public void SearchFileOption(ArrayList<String> FileDirectory, String FileName) {
	
		boolean FileExists = FileDirectory.contains(FileName); 
	  
	    if (FileExists) 
	    {
	        System.out.println(FileName+" "+"exists in the Root Directory");
	    }
	    else
	    {
	        System.out.println(FileName+" "+"is not in the Root Directory"); 
	    }			
	}
}
