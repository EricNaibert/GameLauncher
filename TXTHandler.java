package gameLauncher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class TXTHandler {

	public static String linhaGame, linhaCover;
	public static int returnLanguage;
	private static String linhaCor;
	private static String linhaLanguage;
	private static String home = System.getProperty("user.home");

	public static void salvarTXT() {

		try {
			
			String path1 = home+File.separator+"GameLauncher"+File.separator+"pathGameSave.txt";
			String path2 = home+File.separator+"GameLauncher"+File.separator+"pathCoverSave.txt";

			FileWriter fileWriter = new FileWriter(path1);
			FileWriter fileWriter2 = new FileWriter(path2);

			PrintWriter printWriter = new PrintWriter(fileWriter);
			PrintWriter printWriter2 = new PrintWriter(fileWriter2);
			printWriter.println(AdicionarJogoAoPath.pathGame);
			printWriter2.println(AdicionarJogoAoPath.pathCover);

			printWriter.close();
			printWriter2.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void letTXT() {

		String path1 = home+File.separator+"GameLauncher"+File.separator+"pathGameSave.txt";
		String path2 = home+File.separator+"GameLauncher"+File.separator+"pathCoverSave.txt";

		try {
			FileReader fileReader = new FileReader(path1);
			FileReader fileReader2 = new FileReader(path2);
			BufferedReader br = new BufferedReader(fileReader);
			BufferedReader br2 = new BufferedReader(fileReader2);
			linhaGame = br.readLine();
			linhaCover = br2.readLine();

			br.close();
			br2.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void deletarTXT() {

		try {
			
			String path1 = home+File.separator+"GameLauncher"+File.separator+"pathGameSave.txt";
			String path2 = home+File.separator+"GameLauncher"+File.separator+"pathCoverSave.txt";

			FileWriter fileWriter = new FileWriter(path1);
			FileWriter fileWriter2 = new FileWriter(path2);

			PrintWriter printWriter = new PrintWriter(fileWriter);
			PrintWriter printWriter2 = new PrintWriter(fileWriter2);
			printWriter.println(DeleteGame.deleteArrayGame);
			printWriter2.println(DeleteGame.deleteArrayCover);

			printWriter.close();
			printWriter2.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void lerColor() {

		String path = home+File.separator+"GameLauncher"+File.separator+"colorSave.txt";

		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader br = new BufferedReader(fileReader);
			linhaCor = br.readLine();
			
			if(linhaCor.equals("blue")) {
				ButtonColorChanger.changeToBlue();
			} else if(linhaCor.equals("green")) {
				ButtonColorChanger.changeToGreen();
			} else if(linhaCor.equals("purple")) {
				ButtonColorChanger.changeToPurple();
			} else {
				ButtonColorChanger.changeToLime();
			}

			System.out.println(linhaCor);
			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void readLanguage() {
		
		String path = home+File.separator+"GameLauncher"+File.separator+"languageSave.txt";
		
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader br = new BufferedReader(fileReader);
			linhaLanguage = br.readLine();
			
			if(linhaLanguage.equals("english")) {
				returnLanguage = 1;
			} else if(linhaLanguage.equals("portuguese")) {
				returnLanguage = 2;
			} else {
				JOptionPane.showMessageDialog(GUI.frame, "Something went wrong! Please, report this error to the developer");
			}
			
			br.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
