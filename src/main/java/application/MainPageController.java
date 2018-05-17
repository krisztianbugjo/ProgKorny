package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * A főmenüt irányító osztály.
 * 
 * @author Krisz
 *
 */
public class MainPageController {

	/**
	 * A főmenün elhelyezkedő gombok.
	 */
	@FXML
	private Button btn_megtekintes, btn_arjegyzek, btn_foglalas;

	/**
	 * Az eddigi foglal�sok megtekintésére szolgáló oldalt tölti be, a megfelelő
	 * gomb lenyomása után.
	 * 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void megtekintes(ActionEvent event) throws IOException {
		Stage stage = (Stage) btn_megtekintes.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/views/reservations.fxml"));

		Scene scene = new Scene(root);
		scene.getStylesheets().add("application.css");
		stage.setScene(scene);

	}

	/**
	 * Új foglalás létrehozását szolgáló oldalt tölti be, a megfelelő gomb lenyomása
	 * után.
	 * 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void foglalas(ActionEvent event) throws IOException {
		Stage stage = (Stage) btn_foglalas.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/views/reservationCreator.fxml"));

		Scene scene = new Scene(root);
		scene.getStylesheets().add("application.css");
		stage.setScene(scene);
	}

	/**
	 * Az árjegyzék megtekintésére szolgáló oldalt töltib be, a megfelelő gomb
	 * lenyomása után.
	 * 
	 * @param event
	 * @throws IOException
	 */

	@FXML
	public void ar(ActionEvent event) throws IOException {
		Stage stage = (Stage) btn_arjegyzek.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/views/prices.fxml"));

		Scene scene = new Scene(root);
		scene.getStylesheets().add("application.css");
		stage.setScene(scene);
	}
}
