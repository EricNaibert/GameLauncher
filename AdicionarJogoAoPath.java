package gameLauncher;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 

public class AdicionarJogoAoPath {

	public static ArrayList<String> pathGame = new ArrayList<>();
	public static ArrayList<String> pathCover = new ArrayList<>();
	public static ArrayList<String> readPathGame = new ArrayList<>();
	public static ArrayList<String> readPathCover = new ArrayList<>();
	private static JFrame frame;
	private static JPanel panel;
	public static GridBagConstraints c;
	private static JLabel label, label2, labelTittle;
	private static JFileChooser textFieldJogo;
	private static JFileChooser textFieldCover;
	private static JButton addButton;
	private static boolean firstTime = true;

	public static void addGame() {

		frame = new JFrame();
		frame.setSize(600, 300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setIconImage(GUI.gameLauncherIcon.getImage());

		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		panel.setBackground(Color.DARK_GRAY);

		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0, 5, 10, 5);
		frame.add(panel);

		labelTittle = new JLabel();
		labelTittle.setFont(new Font("Arial", 1, 25));
		labelTittle.setForeground(Color.white);
		c.gridx = 1;
		c.gridy = 1;
		panel.add(labelTittle, c);

		campoJogo();
		campoCover();

		addButton = new JButton();
		c.gridx = 1;
		c.gridy = 4;
		c.ipadx = 200;
		addButton.addActionListener(listener);
		panel.add(addButton, c);

		if(TXTHandler.returnLanguage==1) {
			frame.setTitle("Add Game to Library");
			labelTittle.setText("Add Game");
			addButton.setText("Add");
			label.setText("Game Directory");
			label2.setText("Cover Image Directory");
		} else {
			frame.setTitle("Adicionar Jogo na Biblioteca");
			labelTittle.setText("Adicionar Jogo");
			addButton.setText("Adicionar");
			label.setText("Diretório do Jogo");
			label2.setText("Diretório da Imagem de Capa");
		}

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	public static ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				String getGamePath = textFieldJogo.getSelectedFile().getAbsolutePath();
				String getCoverPath = textFieldCover.getSelectedFile().getAbsolutePath();
				TXTHandler.letTXT();

				if(getGamePath.isEmpty() || getCoverPath.isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Por favor, adicione o diretório do jogo e cover");
				} else if(getGamePath.contains("\"") || getCoverPath.contains("\"")){
					JOptionPane.showMessageDialog(GUI.frame, "Por favor, adicione os diretórios sem aspas");
				} else {

					if(TXTHandler.linhaGame.length()>4 && firstTime == true) {
						firstTime = false;
						String getSavedGamePath = TXTHandler.linhaGame.substring(1, TXTHandler.linhaGame.length()-1);
						String getSavedCoverPath = TXTHandler.linhaCover.substring(1, TXTHandler.linhaCover.length()-1);

						String[] storageSavedGamePath = getSavedGamePath.split(", ");
						String[] storageSavedCoverPath = getSavedCoverPath.split(", ");

						for(int i = 0; i<storageSavedGamePath.length; i++) {
							pathGame.add(storageSavedGamePath[i]);
							pathCover.add(storageSavedCoverPath[i]);
						}
					}

					pathGame.add(getGamePath);
					pathCover.add(getCoverPath);

					TXTHandler.salvarTXT();
					if(TXTHandler.returnLanguage==1) {
						JOptionPane.showMessageDialog(frame, "Game Successfully Added");
					} else {
						JOptionPane.showMessageDialog(frame, "Jogo Adicionado Com Sucesso");
					}
					
					firstTime = false;


				}
				
			} catch(NullPointerException e2) {
				if(TXTHandler.returnLanguage==1) {
					JOptionPane.showMessageDialog(frame, "Please, add the game AND the image cover directory!");
				} else {
					JOptionPane.showMessageDialog(frame, "Por favor, adicione o diretório do jogo E da cover image!");
				}
				
			}

		}


	};

	public static void campoJogo() {
		label = new JLabel();
		label.setFont(new Font("Arial", 1, 19));
		label.setForeground(Color.white);
		c.gridx = 0;
		c.gridy = 2;
		panel.add(label, c);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				textFieldJogo = new JFileChooser();
				textFieldJogo.setFont(new Font("Arial", 0, 19));
				textFieldJogo.setBackground(Color.DARK_GRAY);
				textFieldJogo.setForeground(Color.white);

				if(textFieldJogo.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(frame, "Saved Successfully");
				}
			}
		};

		JButton textFieldJogoButton = new JButton();
		textFieldJogoButton.addActionListener(actionListener);
		c.gridx = 1;
		c.gridy = 2;
		panel.add(textFieldJogoButton, c);

		if(TXTHandler.returnLanguage==1) {
			textFieldJogoButton.setText("Choose Directory");
		} else {
			textFieldJogoButton.setText("Escolha o Diretório");
		}

	}

	public static void campoCover() {
		label2 = new JLabel();
		label2.setFont(new Font("Arial", 1, 19));
		label2.setForeground(Color.white);
		c.gridx = 0;
		c.gridy = 3;
		panel.add(label2, c);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				textFieldCover = new JFileChooser();
				textFieldCover.setFont(new Font("Arial", 0, 19));
				textFieldCover.setBackground(Color.DARK_GRAY);
				textFieldCover.setForeground(Color.white);

				if(textFieldCover.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(frame, "Saved Successfully");
				}


			}
		};

		JButton textFieldCoverButton = new JButton();
		textFieldCoverButton.addActionListener(actionListener);
		c.gridx = 1;
		c.gridy = 3;
		panel.add(textFieldCoverButton, c);

		if(TXTHandler.returnLanguage==1) {
			textFieldCoverButton.setText("Choose Directory");
		} else {
			textFieldCoverButton.setText("Escolha o Diretório");
		}



	}
}
