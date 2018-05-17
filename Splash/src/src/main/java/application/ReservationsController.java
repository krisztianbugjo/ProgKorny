package application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import models.Reservation;

/**
 * A foglalások megtekintéséért felelős osztály.
 * 
 * @author Krisz
 *
 */
public class ReservationsController {
	
	/**
	 * Logolásért felelős adattag.
	 */
	
	private static Logger logger = LoggerFactory.getLogger(ReservationCreatorController.class);

	/**
	 * Foglalásokat tartalmazó lista.
	 */
	List<Reservation> list = new ArrayList<Reservation>();
	
	/**
	 * A gomb hatására visszalépünk a főmenübe.
	 */

	@FXML
	private Button btn_vissza;

	/**
	 * A 25 méteres medence foglalásához használt gombok.
	 */
	public Button Reservation2500, Reservation2510, Reservation2520, Reservation2530, Reservation2501, Reservation2511,
			Reservation2521, Reservation2531, Reservation2502, Reservation2512, Reservation2522, Reservation2532,
			Reservation2503, Reservation2513, Reservation2523, Reservation2533, Reservation2504, Reservation2514,
			Reservation2524, Reservation2534, Reservation2505, Reservation2515, Reservation2525, Reservation2535;

	/**
	 * Az 50 méteres medence foglalásához használt gombok.
	 */
	public Button Reservation5000, Reservation5010, Reservation5020, Reservation5030, Reservation5001, Reservation5011,
			Reservation5021, Reservation5031, Reservation5002, Reservation5012, Reservation5022, Reservation5032,
			Reservation5003, Reservation5013, Reservation5023, Reservation5033, Reservation5004, Reservation5014,
			Reservation5024, Reservation5034, Reservation5005, Reservation5015, Reservation5025, Reservation5035;

	/**
	 * Az 50 méteres medencében használt dátum választó.
	 */
	public DatePicker date50;

	/**
	 * A 25 méteres medencében használt dátum választó.
	 */
	public DatePicker date25;

	/**
	 * Változó mely visszaadja az aktuális napot.
	 */

	LocalDate today = LocalDate.now();

	/**
	 * A gomb hatására visszatérünk a főoldalra.
	 * 
	 * @param event
	 * @throws IOException
	 */

	@FXML
	public void vissza(ActionEvent event) throws IOException {
		Stage stage = (Stage) btn_vissza.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/views/mainPage.fxml"));

		Scene scene = new Scene(root);
		scene.getStylesheets().add("application.css");
		stage.setScene(scene);

	}

	/**
	 * Az eddigi foglalások megtekintése a 25 méteres medencében.
	 */

	@FXML
	public void load25() {

		setToDefault25();
		String id25 = "";
		Integer ev25 = date25.getValue().getYear();
		Integer honap25 = date25.getValue().getMonthValue();
		Integer nap25 = date25.getValue().getDayOfMonth();
		String date25 = ev25.toString() + honap25.toString() + nap25.toString();

		JsonHandler handler = new JsonHandler();
			try {
				list = handler.read();
				}catch(FileNotFoundException e) {
					logger.error(e.toString());
				} catch (IOException e) {
					logger.error(e.toString());
					e.printStackTrace();
				} catch (ParseException e) {
					logger.error(e.toString());
					e.printStackTrace();
				}
		for (Reservation reservation : list) {

			if (reservation.getDate().equals(date25)) {
				id25 = "Reservation" + reservation.getPoolId() + reservation.getLane() + reservation.getTime();
				if (reservation.getDate().equals(date25)) {
					switch (id25) {
					case "Reservation2500":
						Reservation2500.setStyle("-fx-background-color: red");
						break;
					case "Reservation2501":
						Reservation2501.setStyle("-fx-background-color: red");
						break;
					case "Reservation2502":
						Reservation2502.setStyle("-fx-background-color: red");
						break;
					case "Reservation2503":
						Reservation2503.setStyle("-fx-background-color: red");
						break;
					case "Reservation2504":
						Reservation2504.setStyle("-fx-background-color: red");
						break;
					case "Reservation2505":
						Reservation2505.setStyle("-fx-background-color: red");
						break;
					case "Reservation2510":
						Reservation2510.setStyle("-fx-background-color: red");
						break;
					case "Reservation2511":
						Reservation2511.setStyle("-fx-background-color: red");
						break;
					case "Reservation2512":
						Reservation2512.setStyle("-fx-background-color: red");
						break;
					case "Reservation2513":
						Reservation2513.setStyle("-fx-background-color: red");
						break;
					case "Reservation2514":
						Reservation2514.setStyle("-fx-background-color: red");
						break;
					case "Reservation2515":
						Reservation2515.setStyle("-fx-background-color: red");
						break;
					case "Reservation2520":
						Reservation2520.setStyle("-fx-background-color: red");
						break;
					case "Reservation2521":
						Reservation2521.setStyle("-fx-background-color: red");
						break;
					case "Reservation2522":
						Reservation2522.setStyle("-fx-background-color: red");
						break;
					case "Reservation2523":
						Reservation2523.setStyle("-fx-background-color: red");
						break;
					case "Reservation2524":
						Reservation2524.setStyle("-fx-background-color: red");
						break;
					case "Reservation2525":
						Reservation2525.setStyle("-fx-background-color: red");
						break;
					case "Reservation2530":
						Reservation2530.setStyle("-fx-background-color: red");
						break;
					case "Reservation2531":
						Reservation2531.setStyle("-fx-background-color: red");
						break;
					case "Reservation2532":
						Reservation2532.setStyle("-fx-background-color: red");
						break;
					case "Reservation2533":
						Reservation2533.setStyle("-fx-background-color: red");
						break;
					case "Reservation2534":
						Reservation2534.setStyle("-fx-background-color: red");
						break;
					case "Reservation2535":
						Reservation2535.setStyle("-fx-background-color: red");
						break;
					}
				}
			}
		}
	}

	/**
	 * Az eddigi foglalások megtekintése az 50 méteres medencében.
	 */

	@FXML
	public void load50() {
		setToDefault50();
		String id50 = "";
		Integer ev50 = date50.getValue().getYear();
		Integer honap50 = date50.getValue().getMonthValue();
		Integer nap50 = date50.getValue().getDayOfMonth();
		String date50 = ev50.toString() + honap50.toString() + nap50.toString();

		JsonHandler handler = new JsonHandler();
		try {
		list = handler.read();
		}catch(FileNotFoundException e) {
			logger.error(e.toString());
		} catch (IOException e) {
			logger.error(e.toString());
			e.printStackTrace();
		} catch (ParseException e) {
			logger.error(e.toString());
			e.printStackTrace();
		}
		for (Reservation reservation : list) {
			id50 = "Reservation" + reservation.getPoolId() + reservation.getLane() + reservation.getTime();
			if (reservation.getDate().equals(date50)) {

				switch (id50) {
				case "Reservation5000":
					Reservation5000.setStyle("-fx-background-color: red");
					break;
				case "Reservation5001":
					Reservation5001.setStyle("-fx-background-color: red");
					break;
				case "Reservation5002":
					Reservation5002.setStyle("-fx-background-color: red");
					break;
				case "Reservation5003":
					Reservation5003.setStyle("-fx-background-color: red");
					break;
				case "Reservation5004":
					Reservation5004.setStyle("-fx-background-color: red");
					break;
				case "Reservation5005":
					Reservation5005.setStyle("-fx-background-color: red");
					break;
				case "Reservation5010":
					Reservation5010.setStyle("-fx-background-color: red");
					break;
				case "Reservation5011":
					Reservation5011.setStyle("-fx-background-color: red");
					break;
				case "Reservation5012":
					Reservation5012.setStyle("-fx-background-color: red");
					break;
				case "Reservation5013":
					Reservation5013.setStyle("-fx-background-color: red");
					break;
				case "Reservation5014":
					Reservation5014.setStyle("-fx-background-color: red");
					break;
				case "Reservation5015":
					Reservation5015.setStyle("-fx-background-color: red");
					break;
				case "Reservation5020":
					Reservation5020.setStyle("-fx-background-color: red");
					break;
				case "Reservation5021":
					Reservation5021.setStyle("-fx-background-color: red");
					break;
				case "Reservation5022":
					Reservation5022.setStyle("-fx-background-color: red");
					break;
				case "Reservation5023":
					Reservation5023.setStyle("-fx-background-color: red");
					break;
				case "Reservation5024":
					Reservation5024.setStyle("-fx-background-color: red");
					break;
				case "Reservation5025":
					Reservation5025.setStyle("-fx-background-color: red");
					break;
				case "Reservation5030":
					Reservation5030.setStyle("-fx-background-color: red");
					break;
				case "Reservation5031":
					Reservation5031.setStyle("-fx-background-color: red");
					break;
				case "Reservation5032":
					Reservation5032.setStyle("-fx-background-color: red");
					break;
				case "Reservation5033":
					Reservation5033.setStyle("-fx-background-color: red");
					break;
				case "Reservation5034":
					Reservation5034.setStyle("-fx-background-color: red");
					break;
				case "Reservation5035":
					Reservation5035.setStyle("-fx-background-color: red");
					break;

				}
			}
		}
	}

	/**
	 * A 25 méteres medencében visszaállítja a kezdőállapotot a foglalások terén.
	 */

	public void setToDefault25() {
		Reservation2500.setStyle("-fx-background-color: green");
		Reservation2501.setStyle("-fx-background-color: green");
		Reservation2502.setStyle("-fx-background-color: green");
		Reservation2503.setStyle("-fx-background-color: green");
		Reservation2504.setStyle("-fx-background-color: green");
		Reservation2505.setStyle("-fx-background-color: green");
		Reservation2510.setStyle("-fx-background-color: green");
		Reservation2511.setStyle("-fx-background-color: green");
		Reservation2512.setStyle("-fx-background-color: green");
		Reservation2513.setStyle("-fx-background-color: green");
		Reservation2514.setStyle("-fx-background-color: green");
		Reservation2515.setStyle("-fx-background-color: green");
		Reservation2520.setStyle("-fx-background-color: green");
		Reservation2521.setStyle("-fx-background-color: green");
		Reservation2522.setStyle("-fx-background-color: green");
		Reservation2523.setStyle("-fx-background-color: green");
		Reservation2524.setStyle("-fx-background-color: green");
		Reservation2525.setStyle("-fx-background-color: green");
		Reservation2530.setStyle("-fx-background-color: green");
		Reservation2531.setStyle("-fx-background-color: green");
		Reservation2532.setStyle("-fx-background-color: green");
		Reservation2533.setStyle("-fx-background-color: green");
		Reservation2534.setStyle("-fx-background-color: green");
		Reservation2535.setStyle("-fx-background-color: green");
	}

	/**
	 * Az 50 méteres medencében visszaállítja a kezdőállapotot a foglalások terén.
	 */

	public void setToDefault50() {
		Reservation5000.setStyle("-fx-background-color: green");
		Reservation5001.setStyle("-fx-background-color: green");
		Reservation5002.setStyle("-fx-background-color: green");
		Reservation5003.setStyle("-fx-background-color: green");
		Reservation5004.setStyle("-fx-background-color: green");
		Reservation5005.setStyle("-fx-background-color: green");
		Reservation5010.setStyle("-fx-background-color: green");
		Reservation5011.setStyle("-fx-background-color: green");
		Reservation5012.setStyle("-fx-background-color: green");
		Reservation5013.setStyle("-fx-background-color: green");
		Reservation5014.setStyle("-fx-background-color: green");
		Reservation5015.setStyle("-fx-background-color: green");
		Reservation5020.setStyle("-fx-background-color: green");
		Reservation5021.setStyle("-fx-background-color: green");
		Reservation5022.setStyle("-fx-background-color: green");
		Reservation5023.setStyle("-fx-background-color: green");
		Reservation5024.setStyle("-fx-background-color: green");
		Reservation5025.setStyle("-fx-background-color: green");
		Reservation5030.setStyle("-fx-background-color: green");
		Reservation5031.setStyle("-fx-background-color: green");
		Reservation5032.setStyle("-fx-background-color: green");
		Reservation5033.setStyle("-fx-background-color: green");
		Reservation5034.setStyle("-fx-background-color: green");
		Reservation5035.setStyle("-fx-background-color: green");
	}

	/**
	 * Az oldal megnyílásakor alapértelmezett értékeket állít be.
	 */

	@FXML
	public void initialize() {
		date25.setValue(today);
		load25();
		date50.setValue(today);
		load50();
	}

}