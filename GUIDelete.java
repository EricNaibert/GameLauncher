package gameLauncher;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDelete {

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
	public static JButton deleteButton;

	public static void deleteButton() {

		gameLauncherIcon = new ImageIcon(images.ImagesSetUp.gameLauncherLabel);
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 7, 10);

		ImageIcon deleteIcon = new ImageIcon(images.ImagesSetUp.deleteButton);
		deleteButton = new JButton();
		deleteButton.setPreferredSize(GUI.dimension);
		deleteButton.setIcon(deleteIcon);

		ActionListener actionListenerDelete = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				AdicionarJogoAoLauncher.deleteRefresh = true;
				
				frame = new JFrame();
				frame.setTitle("Deletar Jogo do Launcher");
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame.setSize(1200, 620);
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

				JLabel headerLabel = new JLabel("Deletar Jogo do Launcher");
				headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
				headerLabel.setForeground(Color.WHITE);
				headerPanel.add(headerLabel);

				gamePanel = new JPanel(new GridBagLayout());
				gamePanel.setBackground(Color.DARK_GRAY);
				grid = new GridBagConstraints();

				scroll = new JScrollPane(gamePanel);
				scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
				scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scroll.getVerticalScrollBar().setUnitIncrement(20);
				scroll.setBackground(Color.WHITE);
				scroll.setBorder(null);

				panel.add(headerPanel, BorderLayout.NORTH);
				panel.add(scroll, BorderLayout.CENTER);
				
				AdicionarJogoAoLauncher.adicionarJogoAoDeleteGUI();

				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				
				AdicionarJogoAoLauncher.adicionarJogoAoDeleteGUI();

			}
		};
		
		deleteButton.addActionListener(actionListenerDelete);
		GUI.headerPanel.add(deleteButton);
		

	}

}

