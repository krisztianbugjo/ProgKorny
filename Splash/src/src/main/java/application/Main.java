package application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Az alkalmazás fő osztálya, ez indítja el az egész alkamazást.
 * 
 * @author Krisz
 * 
 */
public class Main extends Application {

	/**
	 * A logololásért felelős adattag.
	 */

	private static Logger logger = LoggerFactory.getLogger(Main.class);

	/**
	 * Az alkamazás indítását vezénylő függvény.
	 */

	@Override
	public void start(Stage stage) throws Exception {
		logger.info("A program elindult.");
		Parent root = FXMLLoader.load(getClass().getResource("/views/mainPage.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add("application.css");

		stage.setTitle("Splash");
		stage.setScene(scene);

		stage.show();
	}

	/**
	 * A Main függvény.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		launch(args);
	}
}
