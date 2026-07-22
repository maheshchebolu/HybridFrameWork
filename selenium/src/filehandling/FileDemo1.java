package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {


		File f1 = new File("C:\\Documents mahesh\\sai.txt");
		
		f1.createNewFile();
		
		System.out.println("File created");
	}

}
