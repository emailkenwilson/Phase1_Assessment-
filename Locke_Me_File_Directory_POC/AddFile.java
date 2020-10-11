package wireframe;

import java.util.ArrayList;

public class AddFile {
	
	public ArrayList<String> AddFileOption(ArrayList<String> FileDirectory, String FileName) {
		
		FileDirectory.add(FileName);
		System.out.println(FileName+" "+"has been added to the Root Directory");
		
		return FileDirectory;
	}
}
