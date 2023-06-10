package gameLauncher;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BotaoSettings {

	public static JButton settingsButton;
	public static String pathFilesUnsaved;
	private static String home = System.getProperty("user.home");
	private static String pathColor = home+File.separator+"GameLauncher"+File.separator+"colorSave.txt";
	private static String pathLanguage = home+File.separator+"GameLauncher"+File.separator+"languageSave.txt";

	public static void settingsButton() {

		ImageIcon addSettingsIcon = new ImageIcon(images.ImagesSetUp.settingsButtonBlue);
		ImageIcon settingsHeaderIcon = new ImageIcon(images.ImagesSetUp.settingsLabel);
		ImageIcon settingsHeaderIconEnglish = new ImageIcon(images.ImagesSetUp.settingsLabelEnglish);
		ImageIcon settingsFrameIcon = new ImageIcon(images.ImagesSetUp.gameLauncherLabel);
		settingsButton = new JButton();
		settingsButton.setPreferredSize(GUI.dimension);
		settingsButton.setIcon(addSettingsIcon);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame();
				frame.setSize(400, 450);
				frame.setTitle("Settings");
				frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.setIconImage(settingsFrameIcon.getImage());

				FlowLayout flow = new FlowLayout(FlowLayout.LEADING, 15, 5);

				JPanel panel = new JPanel();
				panel.setLayout(flow);
				panel.setBackground(Color.DARK_GRAY);
				frame.add(panel);

				Image image = settingsHeaderIcon.getImage();
				Image imageNew = image.getScaledInstance(300, 150, java.awt.Image.SCALE_SMOOTH);
				ImageIcon iconeFinal = new ImageIcon(imageNew);
				
				Image image2 = settingsHeaderIconEnglish.getImage();
				Image imageNew2 = image2.getScaledInstance(300, 150, java.awt.Image.SCALE_SMOOTH);
				ImageIcon iconeFinal2 = new ImageIcon(imageNew2);

				JLabel labelIcon = new JLabel();
				labelIcon.setForeground(Color.white);
				panel.add(labelIcon);

				JLabel labelInfo = new JLabel();
				labelInfo.setFont(new Font("Arial", 1, 25));
				labelInfo.setForeground(Color.white);
				panel.add(labelInfo);

				JLabel blankSpace2 = new JLabel();
				blankSpace2.setText("###########################");
				blankSpace2.setFont(new Font("Arial", 1, 10));
				blankSpace2.setForeground(Color.DARK_GRAY);
				panel.add(blankSpace2);

				Dimension dimension = new Dimension();
				dimension.height = 55;
				dimension.width = 55;

				JButton buttonBlue = new JButton();
				buttonBlue.setIcon(new ImageIcon(images.ImagesSetUp.ColorBlue));
				buttonBlue.addActionListener(actionListenerBlue);
				buttonBlue.setPreferredSize(dimension);
				panel.add(buttonBlue);

				JButton buttonGreen = new JButton();
				buttonGreen.setIcon(new ImageIcon(images.ImagesSetUp.ColorGreen));
				buttonGreen.addActionListener(actionListenerGreen);
				buttonGreen.setPreferredSize(dimension);
				panel.add(buttonGreen);

				JButton buttonPurple = new JButton();
				buttonPurple.setIcon(new ImageIcon(images.ImagesSetUp.ColorPurple));
				buttonPurple.addActionListener(actionListenerPurple);
				buttonPurple.setPreferredSize(dimension);
				panel.add(buttonPurple);

				JButton buttonLime = new JButton();
				buttonLime.setIcon(new ImageIcon(images.ImagesSetUp.ColorLime));
				buttonLime.addActionListener(actionListenerLime);
				buttonLime.setPreferredSize(dimension);
				panel.add(buttonLime);

				JButton buttonRed = new JButton();
				buttonRed.setIcon(new ImageIcon(images.ImagesSetUp.ColorRed));
				buttonRed.addActionListener(actionListenerRed);
				buttonRed.setPreferredSize(dimension);
				panel.add(buttonRed);

				JLabel blankSpace3 = new JLabel();
				blankSpace3.setText("######################################################");
				blankSpace3.setFont(new Font("Arial", 1, 10));
				blankSpace3.setForeground(Color.DARK_GRAY);
				panel.add(blankSpace3);

				JLabel labelLanguage = new JLabel();
				labelLanguage.setFont(new Font("Arial", 1, 25));
				labelLanguage.setForeground(Color.white);
				panel.add(labelLanguage);

				JLabel blankSpace = new JLabel();
				blankSpace.setText("#####################################");
				blankSpace.setFont(new Font("Arial", 1, 10));
				blankSpace.setForeground(Color.DARK_GRAY);
				panel.add(blankSpace);

				Dimension dimensionFlags = new Dimension();
				dimensionFlags.height = 50;
				dimensionFlags.width = 70;

				JButton buttonEnglish = new JButton();
				buttonEnglish.setIcon(new ImageIcon(images.ImagesSetUp.USFlag));
				buttonEnglish.addActionListener(actionListenerLanguageEN);
				buttonEnglish.setPreferredSize(dimensionFlags);
				panel.add(buttonEnglish);

				JButton buttonPortuguese = new JButton();
				buttonPortuguese.setIcon(new ImageIcon(images.ImagesSetUp.BRFlag));
				buttonPortuguese.addActionListener(actionListenerLanguageBR);
				buttonPortuguese.setPreferredSize(dimensionFlags);
				panel.add(buttonPortuguese);
				
				if(TXTHandler.returnLanguage==1) {
					labelIcon.setIcon(iconeFinal2);
					labelLanguage.setText("Language");
					labelInfo.setText("Button Color");
				} else {
					labelIcon.setIcon(iconeFinal);
					labelLanguage.setText("Linguagem");
					labelInfo.setText("Cor dos Botões");
				}

				frame.setLocationRelativeTo(null);
				frame.setVisible(true);

			}
		};


		settingsButton.addActionListener(actionListener);
		GUI.headerPanel.add(settingsButton);



	}

	private static ActionListener actionListenerBlue = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			ButtonColorChanger.changeToBlue();

			try {

				FileWriter fileWriter = new FileWriter(pathColor);

				PrintWriter printWriter = new PrintWriter(fileWriter);

				printWriter.println("blue");

				printWriter.close();

			} catch (IOException exception) {
				// TODO Auto-generated catch block
				exception.printStackTrace();
			}

		}
	};

	private static ActionListener actionListenerGreen = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			ButtonColorChanger.changeToGreen();
			try {

				FileWriter fileWriter = new FileWriter(pathColor);

				PrintWriter printWriter = new PrintWriter(fileWriter);

				printWriter.println("green");

				printWriter.close();

			} catch (IOException exception) {
				// TODO Auto-generated catch block
				exception.printStackTrace();
			}

		}
	};

	private static ActionListener actionListenerPurple = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			ButtonColorChanger.changeToPurple();

			try {

				FileWriter fileWriter = new FileWriter(pathColor);

				PrintWriter printWriter = new PrintWriter(fileWriter);

				printWriter.println("purple");

				printWriter.close();

			} catch (IOException exception) {
				// TODO Auto-generated catch block
				exception.printStackTrace();
			}

		}
	};

	private static ActionListener actionListenerLime = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			ButtonColorChanger.changeToLime();

			try {

				FileWriter fileWriter = new FileWriter(pathColor);

				PrintWriter printWriter = new PrintWriter(fileWriter);

				printWriter.println("lime");

				printWriter.close();

			} catch (IOException exception) {
				// TODO Auto-generated catch block
				exception.printStackTrace();
			}

		}
	};

	private static ActionListener actionListenerRed = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			ButtonColorChanger.changeToRed();

			try {

				FileWriter fileWriter = new FileWriter(pathColor);

				PrintWriter printWriter = new PrintWriter(fileWriter);

				printWriter.println("red");

				printWriter.close();

			} catch (IOException exception) {
				// TODO Auto-generated catch block
				exception.printStackTrace();
			}

		}
	};

	private static ActionListener actionListenerLanguageBR = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			try {

				FileWriter fileWriter = new FileWriter(pathLanguage);
				PrintWriter printWriter = new PrintWriter(fileWriter);

				printWriter.println("portuguese");
				printWriter.close();
				JOptionPane.showMessageDialog(GUI.frame, "Idioma alterado com sucesso! O programa irá fechar para salvar as alterações!");
				System.exit(0);
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}


		}
	};

	private static ActionListener actionListenerLanguageEN = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			try {

				FileWriter fileWriter = new FileWriter(pathLanguage);
				PrintWriter printWriter = new PrintWriter(fileWriter);

				printWriter.println("english");
				printWriter.close();
				JOptionPane.showMessageDialog(GUI.frame, "Language changed successfully! The program will close to save changes!");
				System.exit(0);
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}


		}
	};


}
