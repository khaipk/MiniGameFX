package application;

import java.io.IOException;

import javafx.fxml.FXML;

public class HighScoreController {

	private Main main;
	
	@FXML
	private void showMenu() throws IOException {
		main.showMenuView();
	}
}
