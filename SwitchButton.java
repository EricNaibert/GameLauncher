package gameLauncher;

public class SwitchButton {

	public static void buttonSwitch() {

		switch (AdicionarJogoAoLauncher.i) {

		case 0:
			GUI.gameCard.addActionListener(ChooseGame.launchGame0);
			break;

		case 1:
			GUI.gameCard.addActionListener(ChooseGame.launchGame1);
			break;

		case 2:
			GUI.gameCard.addActionListener(ChooseGame.launchGame2);
			break;

		case 3:
			GUI.gameCard.addActionListener(ChooseGame.launchGame3);
			break;

		case 4:
			GUI.gameCard.addActionListener(ChooseGame.launchGame4);
			break;

		case 5:
			GUI.gameCard.addActionListener(ChooseGame.launchGame5);
			break;

		case 6:
			GUI.gameCard.addActionListener(ChooseGame.launchGame6);
			break;

		case 7:
			GUI.gameCard.addActionListener(ChooseGame.launchGame7);
			break;

		case 8:
			GUI.gameCard.addActionListener(ChooseGame.launchGame8);
			break;

		case 9:
			GUI.gameCard.addActionListener(ChooseGame.launchGame9);
			break;

		case 10:
			GUI.gameCard.addActionListener(ChooseGame.launchGame10);
			break;

		case 11:
			GUI.gameCard.addActionListener(ChooseGame.launchGame11);
			break;

		case 12:
			GUI.gameCard.addActionListener(ChooseGame.launchGame12);
			break;

		case 13:
			GUI.gameCard.addActionListener(ChooseGame.launchGame13);
			break;

		case 14:
			GUI.gameCard.addActionListener(ChooseGame.launchGame14);
			break;

		case 15:
			GUI.gameCard.addActionListener(ChooseGame.launchGame15);
			break;

		case 16:
			GUI.gameCard.addActionListener(ChooseGame.launchGame16);
			break;

		case 17:
			GUI.gameCard.addActionListener(ChooseGame.launchGame17);
			break;

		case 18:
			GUI.gameCard.addActionListener(ChooseGame.launchGame18);
			break;

		case 19:
			GUI.gameCard.addActionListener(ChooseGame.launchGame19);
			break;

		case 20:
			GUI.gameCard.addActionListener(ChooseGame.launchGame20);
			break;

		default:
			GUI.gameCard.addActionListener(ChooseGame.launchGameError);


		}
	}
}
