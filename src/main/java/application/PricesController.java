package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PricesController {

	/**
	 * Az árjegyzék oldal kezelését végző osztály.
	 */
	
	
	
	/**
	 * A gomb hatására visszatérünk a főoldalra.
	 */
	@FXML
	private Button btn_vissza;
	
    public void vissza(ActionEvent event) throws IOException {
        Stage stage = (Stage) btn_vissza.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/views/mainPage.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("application.css");
        stage.setScene(scene);
        
}
	
}
