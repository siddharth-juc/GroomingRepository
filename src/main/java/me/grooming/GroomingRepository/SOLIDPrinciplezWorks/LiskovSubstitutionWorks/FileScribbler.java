package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.LiskovSubstitutionWorks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileScribbler {

	private final String scribblerUserID;

	public FileScribbler(String scribblerUserID) {
		this.scribblerUserID = scribblerUserID;
	}
	
	public boolean isUserVerified(String userID) {
		
		return this.scribblerUserID.equals(getScribblerUserID());
		
	}
	
	public String getScribblerUserID() {
		
		return scribblerUserID;
		
	}
	
	public void scribbleFile(String inputFilePath, String userID) throws IOException {
		
		if (!isUserVerified(userID))
			return;
		
		String destinationFilePath = "C:\\Users\\personalSpace\\Documents\\scribbledFile.txt";
		
		FileReader fileReader = new FileReader(inputFilePath);
		FileWriter fileWriter = new FileWriter(destinationFilePath);
		
		String content = "";
		
		int pointer;
		
		while ((pointer = fileReader.read()) != -1) {
			
			content += (char) pointer;
			
		}
		
		fileWriter.write(content);
		
		fileReader.close();
		fileWriter.close();
		
	}

}