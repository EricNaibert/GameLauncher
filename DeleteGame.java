package gameLauncher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DeleteGame {
	
	public static ArrayList<String> deleteArrayGame = new ArrayList<String>();
	public static ArrayList<String> deleteArrayCover = new ArrayList<String>();
	
	public static ActionListener launchGame0 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(0);
			deleteArrayCover.remove(0);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame1 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(1);
			deleteArrayCover.remove(1);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame2 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(2);
			deleteArrayCover.remove(2);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame3 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(3);
			deleteArrayCover.remove(3);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame4 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(4);
			deleteArrayCover.remove(4);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame5 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(5);
			deleteArrayCover.remove(5);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame6 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(6);
			deleteArrayCover.remove(6);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame7 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(7);
			deleteArrayCover.remove(7);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame8 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(8);
			deleteArrayCover.remove(8);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame9 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(9);
			deleteArrayCover.remove(9);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame10 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(10);
			deleteArrayCover.remove(10);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame11 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(1);
			deleteArrayCover.remove(1);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame12 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(2);
			deleteArrayCover.remove(2);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame13 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(3);
			deleteArrayCover.remove(3);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame14 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(4);
			deleteArrayCover.remove(4);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame15 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(5);
			deleteArrayCover.remove(5);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame16 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(6);
			deleteArrayCover.remove(6);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame17 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(7);
			deleteArrayCover.remove(7);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame18 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(8);
			deleteArrayCover.remove(8);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame19 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(9);
			deleteArrayCover.remove(9);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};
	
	public static ActionListener launchGame20 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i<AdicionarJogoAoLauncher.storageSavedGamePath.length; i++) {
				deleteArrayGame.add(AdicionarJogoAoLauncher.storageSavedGamePath[i]);
				deleteArrayCover.add(AdicionarJogoAoLauncher.storageSavedCoverPath[i]);
			}
			
			deleteArrayGame.remove(10);
			deleteArrayCover.remove(10);
			TXTHandler.deletarTXT();
			JOptionPane.showMessageDialog(GUIDelete.frame, "Jogo deletado com sucesso");
			System.exit(0);
		}
	};

}
