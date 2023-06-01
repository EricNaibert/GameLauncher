package gameLauncher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


public class PathFilesCreate {

	public static void pathFilesSaved() {

		String home = System.getProperty("user.home");
		String pathGameSave = home+File.separator+"GameLauncher"+File.separator+"pathGameSave.txt";
		String pathCoverSave = home+File.separator+"GameLauncher"+File.separator+"pathCoverSave.txt";
		String pathColorSave = home+File.separator+"GameLauncher"+File.separator+"colorSave.txt";

		try {

			Files.createDirectories(Paths.get(""+home+File.separator+"GameLauncher"));
			File file1 = new File(pathGameSave);
			file1.createNewFile();
			File file2 = new File(pathCoverSave);
			file2.createNewFile();
			File file3 = new File(pathColorSave);
			file3.createNewFile();
			
			FileReader fileReader = new FileReader(pathGameSave);
			BufferedReader br = new BufferedReader(fileReader);
			String linha = br.readLine();
			
			if(linha==null) {
				FileWriter fileWriter1 = new FileWriter(pathGameSave);
				FileWriter fileWriter2 = new FileWriter(pathCoverSave);
				FileWriter fileWriter3 = new FileWriter(pathColorSave);
				PrintWriter pW1 = new PrintWriter(fileWriter1);
				PrintWriter pW2 = new PrintWriter(fileWriter2);
				PrintWriter pW3 = new PrintWriter(fileWriter3);
				
				pW1.println("[]");
				pW2.println("[]");
				pW3.println("blue");
			
				pW1.close();
				pW2.close();
				pW3.close();
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
