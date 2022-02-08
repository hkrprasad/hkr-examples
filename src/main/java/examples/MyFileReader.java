package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class MyFileReader {
	
	String fileName;
	Vector<String> linesInFile;
	
	public MyFileReader(String argFileName) {
		fileName = argFileName;
		
	}

	public Vector<String> getLinesInFile(){
		readFile();
		return linesInFile;
	}
	
	private void readFile() {
		
		if (fileName == null || fileName.equals("")) {
			System.out.print("There is no file to read");
			return;
		} else {
			FileReader fileReader;
			BufferedReader br;
			File file = new File(fileName);
			if (file.exists() && file.isFile())
			{
				if (linesInFile == null)
					linesInFile = new Vector<String>();
				else
					linesInFile.clear();
				
				try {
					fileReader = new FileReader(file);
					br = new BufferedReader(fileReader);
					String oneLine;
					while( (oneLine = br.readLine()) != null ){
						System.out.println(oneLine);	
						linesInFile.addElement(oneLine);
					}
					br.close();
					
				} catch(FileNotFoundException exp) {
					System.out.println("The file " + fileName + " does not exist");
				} catch (IOException ioExp) {
					System.out.println("Error reading the file " + fileName);
				} 
				
			} else {
				System.out.println("The file " + fileName + " does not exist");
			}	
		}
	}
	
}
