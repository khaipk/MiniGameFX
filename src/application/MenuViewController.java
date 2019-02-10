package application;

import java.io.IOException;

import javafx.fxml.FXML;

public class MenuViewController {
	
	private Main main;
	
	@FXML
	private void newGame() throws IOException {
		main.showNewGame();
	}
	@FXML
	private void continueGame() throws IOException {
		main.showContinue();
	}
	@FXML
	private void highScore() throws IOException {
		main.showHighScore();
	}
	@FXML
	private void help() throws IOException {
		main.showHelp();
	}
	@FXML
	private void exit() {
		System.exit(0);
	}
	
}
