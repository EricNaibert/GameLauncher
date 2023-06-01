package gameLauncher;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

	public static JFrame frame;
	private static JPanel panel;
	public static JPanel headerPanel;
	private static JScrollPane scroll;
	public static Dimension dimension;
	public static JButton gameCard;
	public static Insets insets;
	public static JPanel gamePanel;
	public static GridBagConstraints grid;
	public static ImageIcon gameLauncherIcon;
	public static JButton addButton;
	public static JButton refreshButton;

	public static void gameLibrary() {
		
		gameLauncherIcon = new ImageIcon(images.ImagesSetUp.gameLauncherLabel);
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 7, 10);
		
		frame = new JFrame();
		frame.setTitle("Game Launcher");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280, 720);
		frame.setIconImage(gameLauncherIcon.getImage());
		frame.setBackground(Color.DARK_GRAY);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder());
		panel.setBackground(Color.DARK_GRAY);
		frame.add(panel);
		

		headerPanel = new JPanel();
		headerPanel.setLayout(flow);
		headerPanel.setBorder(BorderFactory.createCompoundBorder(
		BorderFactory.createMatteBorder(0, 40, 0, 40, Color.DARK_GRAY), BorderFactory.createMatteBorder(0, 0, 4, 0, Color.LIGHT_GRAY)));
		headerPanel.setBackground(Color.DARK_GRAY);
		
		JLabel headerLabel = new JLabel("Game Launcher");
		headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
		headerLabel.setForeground(Color.WHITE);
		headerPanel.add(headerLabel);
		
		JLabel spaceLabel = new JLabel("BLANKSPACE");
		spaceLabel.setForeground(Color.DARK_GRAY);
		headerPanel.add(spaceLabel);

		addButton = new JButton();
		dimension = new Dimension();
		dimension.height = 50;
		dimension.width = 60;
		addButton.setPreferredSize(dimension);
		headerPanel.add(addButton);
		
		refreshButton = new JButton();
		refreshButton.setPreferredSize(dimension);
		headerPanel.add(refreshButton);
		
		BotaoSettings.settingsButton();
		
		BotaoInfo.infoButton();
		
		gamePanel = new JPanel(new GridBagLayout());
		gamePanel.setBackground(Color.DARK_GRAY);
		grid = new GridBagConstraints();
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AdicionarJogoAoPath.addGame();
				
			}
		};
		
		ActionListener listener2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AdicionarJogoAoLauncher.adicionarJogo();
				
			}
		};
		
		addButton.addActionListener(listener);
		refreshButton.addActionListener(listener2);
		
		scroll = new JScrollPane(gamePanel);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.getVerticalScrollBar().setUnitIncrement(20);
		scroll.setBackground(Color.WHITE);
		scroll.setBorder(null);
		
		panel.add(headerPanel, BorderLayout.NORTH);
		panel.add(scroll, BorderLayout.CENTER);
		
		TXTHandler.lerColor();
		AdicionarJogoAoLauncher.adicionarJogo();
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}


}
