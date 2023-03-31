package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.LiskovSubstitutionWorks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BitFasterFileScribbler extends FileScribbler {

	public BitFasterFileScribbler(String scribblerUserID) {
		super(scribblerUserID);
	}

	/*
	 * Here, we have to make sure that this being the derived class shouldn't lead
	 * to code break in case the super class is referenced to derived class object.
	 */

	public void scribbleFile(String inputFilePath, String userID) throws IOException, FileNotFoundException {

		if (!isUserVerified(userID))
			return;

		String destinationFilePath = "C:\\Users\\personalSpace\\Documents\\scribbledFile.txt";

		BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFilePath));

		String content = "";

		while ((content = bufferedReader.readLine()) != null) {

			bufferedWriter.write(content);
			bufferedWriter.newLine();
			bufferedWriter.flush();

		}

		bufferedReader.close();
		bufferedWriter.close();

	}

}