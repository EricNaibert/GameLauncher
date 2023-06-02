package gameLauncher;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AdicionarJogoAoLauncher {

	public static int i;
	public static String[] storageSavedGamePath;
	public static String[] storageSavedCoverPath;
	private static int x = 1;
	private static int y = 1;
	private static int refreshCheck;
	public static boolean deleteRefresh = true;
	private static boolean firstTime = true;

	public static void adicionarJogo() {

		TXTHandler.letTXT();

		String getSavedGamePath = TXTHandler.linhaGame.substring(1, TXTHandler.linhaGame.length()-1);
		String getSavedCoverPath = TXTHandler.linhaCover.substring(1, TXTHandler.linhaCover.length()-1);

		storageSavedGamePath = getSavedGamePath.split(", ");
		storageSavedCoverPath = getSavedCoverPath.split(", ");

		if(TXTHandler.linhaGame.length() > 4 || TXTHandler.linhaCover.length() > 4) {
			
			try {
				GUI.gamePanel.remove(GUI.gamePanel);
				x = 1;
				y = 1;

			} catch (Exception e) {

				System.out.println("Ainda n�o tem");
			}
			
			if(refreshCheck != storageSavedGamePath.length || firstTime == true) {

				for(i = 0; i<storageSavedGamePath.length; i++) {
					
					GUI.gameCard = new JButton();
					GUI.gameCard.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					GUI.gameCard.setPreferredSize(new Dimension(200, 200));

					ImageIcon icone = new ImageIcon(storageSavedCoverPath[i]);

					Image image = icone.getImage();
					Image imageNew = image.getScaledInstance(205, 270, java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconeFinal = new ImageIcon(imageNew);

					GUI.gameCard.setIcon(iconeFinal);

					GUI.grid.fill = GridBagConstraints.HORIZONTAL;
					GUI.grid.gridheight = 2;
					GUI.grid.ipady = 70;
					GUI.grid.insets = new Insets(10, 20, 10, 0);
					GUI.grid.gridx = x;
					GUI.grid.gridy = y;
					
					SwitchButton.buttonSwitch();
					GUI.gamePanel.add(GUI.gameCard, GUI.grid);

					GUI.gamePanel.updateUI();

					if(x >= 5) {
						y = y + 4;
						x = 1;
					} else {
						x++;
					}
				}


			}
			
			refreshCheck = storageSavedCoverPath.length;
			firstTime = false;

		} else {
			JOptionPane.showMessageDialog(GUI.frame, "Por favor, adicione um jogo e cover antes de atualizar a janela");
		}



	}
	
	public static void adicionarJogoAoDeleteGUI() {

		TXTHandler.letTXT();

		String getSavedGamePath = TXTHandler.linhaGame.substring(1, TXTHandler.linhaGame.length()-1);
		String getSavedCoverPath = TXTHandler.linhaCover.substring(1, TXTHandler.linhaCover.length()-1);

		storageSavedGamePath = getSavedGamePath.split(", ");
		String[] storageSavedCoverPath = getSavedCoverPath.split(", ");

		if(TXTHandler.linhaGame.length() > 4 || TXTHandler.linhaCover.length() > 4) {
			
			try {
				GUIDelete.gamePanel.remove(GUIDelete.gamePanel);
				x = 1;
				y = 1;

			} catch (Exception e) {

				System.out.println("Ainda n�o tem");
			}
			
			if(deleteRefresh == true) {

				for(i = 0; i<storageSavedGamePath.length; i++) {
					
					GUIDelete.gameCard = new JButton();
					GUIDelete.gameCard.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					GUIDelete.gameCard.setPreferredSize(new Dimension(200, 200));

					ImageIcon icone = new ImageIcon(storageSavedCoverPath[i]);

					Image image = icone.getImage();
					Image imageNew = image.getScaledInstance(205, 270, java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconeFinal = new ImageIcon(imageNew);

					GUIDelete.gameCard.setIcon(iconeFinal);

					GUIDelete.grid.fill = GridBagConstraints.HORIZONTAL;
					GUIDelete.grid.gridheight = 2;
					GUIDelete.grid.ipady = 70;
					GUIDelete.grid.insets = new Insets(10, 20, 10, 0);
					GUIDelete.grid.gridx = x;
					GUIDelete.grid.gridy = y;
					
					SwitchButton.buttonSwitchDelete();
					GUIDelete.gamePanel.add(GUIDelete.gameCard, GUIDelete.grid);

					GUIDelete.gamePanel.updateUI();

					if(x >= 5) {
						y = y + 4;
						x = 1;
					} else {
						x++;
					}
				}


			}
			
			deleteRefresh = false;

		} else {
			JOptionPane.showMessageDialog(GUI.frame, "Por favor, adicione um jogo e cover antes de atualizar a janela");
		}



	}



}
