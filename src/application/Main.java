package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Stage primaryStage;
	private static BorderPane mainPane;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Mini Game FX");
			showMainView();
			showMenuView();
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("View.fxml"));
		mainPane = loader.load();
		Scene scene = new Scene(mainPane, 400, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showMenuView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("MenuView.fxml"));
		Parent root = loader.load();
		mainPane.setCenter(root);
	}
	
	public static void showNewGame() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("NewGame.fxml"));
		Parent root = loader.load();
		mainPane.setCenter(root);
	}
	
	public static void showContinue() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Continue.fxml"));
		Parent root = loader.load();
		mainPane.setCenter(root);
	}
	
	public static void showHighScore() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("HighScore.fxml"));
		Parent root = loader.load();
		mainPane.setCenter(root);
	}
	
	public static void showHelp() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Help.fxml"));
		Parent root = loader.load();
		mainPane.setCenter(root);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
