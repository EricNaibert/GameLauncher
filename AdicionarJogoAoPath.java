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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdicionarJogoAoPath {

	public static ArrayList<String> pathGame = new ArrayList<>();
	public static ArrayList<String> pathCover = new ArrayList<>();
	public static ArrayList<String> readPathGame = new ArrayList<>();
	public static ArrayList<String> readPathCover = new ArrayList<>();
	private static JFrame frame;
	private static JPanel panel;
	public static GridBagConstraints c;
	private static JLabel label;
	private static JTextField textFieldJogo;
	private static JTextField textFieldCover;
	private static JButton addButton;
	private static boolean firstTime = true;

	public static void addGame() {

		frame = new JFrame();
		frame.setSize(500, 300);
		frame.setResizable(false);
		frame.setTitle("Adicionar na Biblioteca");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setIconImage(GUI.gameLauncherIcon.getImage());

		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		panel.setBackground(Color.DARK_GRAY);

		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0, 5, 10, 5);
		frame.add(panel);

		label = new JLabel();
		label.setText("Adicionar Jogo");
		label.setFont(new Font("Arial", 1, 25));
		label.setForeground(Color.white);
		c.gridx = 1;
		c.gridy = 1;
		panel.add(label, c);

		campoJogo();
		campoCover();

		addButton = new JButton();
		addButton.setText("Adicionar");
		c.gridx = 1;
		c.gridy = 4;
		c.ipadx = 200;
		addButton.addActionListener(listener);
		panel.add(addButton, c);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	public static ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String getGamePath = textFieldJogo.getText();
			String getCoverPath = textFieldCover.getText();
			TXTHandler.letTXT();
			
			if(getGamePath.isEmpty() || getCoverPath.isEmpty()) {
				JOptionPane.showMessageDialog(frame, "Por favor, adicione o diretório do jogo e cover");
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
				JOptionPane.showMessageDialog(frame, "Jogo Adicionado Com Sucesso");
				textFieldJogo.setText("");
				textFieldCover.setText("");
				firstTime = false;
				
				
			}

		}


	};

	public static void campoJogo() {
		label = new JLabel();
		label.setText("Diretório do Jogo");
		label.setFont(new Font("Arial", 1, 19));
		label.setForeground(Color.white);
		c.gridx = 0;
		c.gridy = 2;
		panel.add(label, c);

		textFieldJogo = new JTextField();
		textFieldJogo.setFont(new Font("Arial", 0, 19));
		textFieldJogo.setBackground(Color.DARK_GRAY);
		textFieldJogo.setForeground(Color.white);
		c.gridx = 1;
		c.gridy = 2;
		panel.add(textFieldJogo, c);
	}

	public static void campoCover() {
		label = new JLabel();
		label.setText("Diretório do Cover");
		label.setFont(new Font("Arial", 1, 19));
		label.setForeground(Color.white);
		c.gridx = 0;
		c.gridy = 3;
		panel.add(label, c);

		textFieldCover = new JTextField();
		textFieldCover.setFont(new Font("Arial", 0, 19));
		textFieldCover.setBackground(Color.DARK_GRAY);
		textFieldCover.setForeground(Color.white);
		c.gridx = 1;
		c.gridy = 3;
		panel.add(textFieldCover, c);
	}
}
