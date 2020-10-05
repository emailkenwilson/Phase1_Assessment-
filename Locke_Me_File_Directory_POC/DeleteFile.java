package wireframe;

import java.util.ArrayList;

public class DeleteFile {
	
	public ArrayList<String> DeleteFileOption(ArrayList<String> FileDirectory, String FileName) {
		
		boolean FileExists = FileDirectory.contains(FileName); 
		  
        if (FileExists) 
        {
        	FileDirectory.remove(FileName);
            System.out.println(FileName+" "+"has been deleted from Root Directory");
        }
        else
        {
            System.out.println(FileName+" "+"is not in the Root Directory"); 
        }
		return FileDirectory;
				
	}
}
