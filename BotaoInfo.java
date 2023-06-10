package gameLauncher;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BotaoInfo {
	
	public static JButton infoButton;
	
	public static void infoButton() {
		
		String version = "1.4.0";
		ImageIcon addInfoIcon = new ImageIcon(images.ImagesSetUp.infoButtonBlue);
		infoButton = new JButton();
		infoButton.setPreferredSize(GUI.dimension);
		infoButton.setIcon(addInfoIcon);
		
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame();
				frame.setSize(800, 600);
				frame.setTitle("Info");
				frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.setIconImage(GUI.gameLauncherIcon.getImage());

				JPanel panel = new JPanel();
				panel.setLayout(new GridBagLayout());
				panel.setBackground(Color.DARK_GRAY);

				GridBagConstraints c = new GridBagConstraints();
				c.fill = GridBagConstraints.HORIZONTAL;
				c.insets = new Insets(0, 5, 10, 5);
				frame.add(panel);
				
				Image image = GUI.gameLauncherIcon.getImage();
				Image imageNew = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
				ImageIcon iconeFinal = new ImageIcon(imageNew);
				
				JLabel labelIcon = new JLabel();
				labelIcon.setIcon(iconeFinal);
				labelIcon.setFont(new Font("Arial", 1, 25));
				labelIcon.setForeground(Color.white);
				c.gridx = 1;
				c.gridy = 1;
				panel.add(labelIcon, c);

				JLabel label = new JLabel();
				label.setFont(new Font("Arial", 1, 25));
				label.setForeground(Color.white);
				c.gridx = 1;
				c.gridy = 2;
				panel.add(label, c);
				
				JLabel labelInfo = new JLabel();
				labelInfo.setFont(new Font("Arial", 0, 25));
				labelInfo.setForeground(Color.white);
				c.gridx = 1;
				c.gridy = 3;
				panel.add(labelInfo, c);
				
				JLabel labelInfo2 = new JLabel();
				labelInfo2.setFont(new Font("Arial", 0, 25));
				labelInfo2.setForeground(Color.white);
				c.gridx = 1;
				c.gridy = 4;
				panel.add(labelInfo2, c);
				
				JLabel labelInfo3 = new JLabel();
				labelInfo3.setFont(new Font("Arial", 0, 25));
				labelInfo3.setForeground(Color.white);
				c.gridx = 1;
				c.gridy = 5;
				panel.add(labelInfo3, c);
				
				JLabel labelInfo4 = new JLabel();
				labelInfo4.setFont(new Font("Arial", 0, 25));
				labelInfo4.setForeground(Color.white);
				c.gridx = 1;
				c.gridy = 6;
				panel.add(labelInfo4, c);
				
				JLabel labelContact = new JLabel();
				labelContact.setFont(new Font("Arial", 0, 25));
				labelContact.setForeground(Color.YELLOW);
				labelContact.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				labelContact.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					try {
						Desktop.getDesktop().browse(new URI("https://github.com/EricNaibert"));
						
					} catch (Exception e2) {
						e2.printStackTrace();

					}
				}
				
				
				});
				c.gridx = 1;
				c.gridy = 7;
				panel.add(labelContact, c);
				
				JLabel labelVersion = new JLabel();
				labelVersion.setFont(new Font("Arial", 2, 17));
				labelVersion.setForeground(Color.white);
				c.gridx = 1;
				c.gridy = 8;
				panel.add(labelVersion, c);
				
				if(TXTHandler.returnLanguage==1) {
					label.setText("Informations");
					labelInfo.setText("#1 - Use the Button \"Add\" to add a game to the launcher.");
					labelInfo2.setText("<html><p><b>#2</b> - You must type the game directory AND</p>"
							+ "<p> the \"cover image\" directory.</p></html>");
					labelInfo3.setText("<html><p><b>#3</b> - For games, the supported extensions are: \".exe\", \".jar\", \".lnk\" and \".url\".</p></html>");
					labelInfo4.setText("<html><p><b>#4</b> - For images, the supported extensions are: \".jpeg\" and \".png\".</p></html>");
					labelVersion.setText("Version " + version);
					
					labelContact.setText("Contact me on GitHub!");
					
				} else {
					label.setText("Informações");
					labelInfo.setText("#1 - Use o botão \"Adicionar\" para adicionar um jogo ao launcher.");
					labelInfo2.setText("<html><p><b>#2</b> - Você deve informar o diretório do jogo e</p>"
							+ "<p> o diretório da \"cover image\".</p></html>");
					labelInfo3.setText("<html><p><b>#3</b> - Para os jogos, as extensões suportadas são: \".exe\", \".jar\", \".lnk\", \".url\".</p></html>");
					labelInfo4.setText("<html><p><b>#4</b> - Para imagens, as extensões suportadas são \".jpeg\" e \".png\".</p></html>");
					labelVersion.setText("Versão " + version);
					
					labelContact.setText("Entre em contato comigo no GitHub!");
				}
				

				frame.setLocationRelativeTo(null);
				frame.setVisible(true);

				
			}
		};
		
		
		infoButton.addActionListener(actionListener);
		GUI.headerPanel.add(infoButton);
		
		
		
	}

}
