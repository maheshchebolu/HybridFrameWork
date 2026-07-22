package filehandling;

import java.io.File;

public class FolderDemo2 {

	public static void main(String[] args) {


		File f1 = new File("C:\\Documents mahesh\\reports");
		
		System.out.println(f1.mkdir());
		
		System.out.println("Folder created");
	}

}
