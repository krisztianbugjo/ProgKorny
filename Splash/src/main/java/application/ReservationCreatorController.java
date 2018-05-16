package application;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import models.Reservation;

/**
 * A foglalások létrehozásáért felelős osztály.
 * 
 * @author Krisz
 *
 */

public class ReservationCreatorController {

	/**
	 * A kijelölt foglalásokat tartalmazó lista.
	 */

	List<Reservation> selectedReservations = new ArrayList<Reservation>();
	/**
	 *Az összes eddigi foglalást tartalmazó lista.
	 */
	List<Reservation> list = new ArrayList<Reservation>();
	
	/**
	 * Logolásért felelős adattag.
	 */
	
	private static Logger logger = LoggerFactory.getLogger(ReservationCreatorController.class);
	
	/**
	 * A {@code date25} változó inicializálása.
	 */
	String date25 = "";
	
	/**
	 * A {@code date50} változó inicializálása.
	 */
	
	String date50 = "";

	/**
	 * Változó mely visszaadja az aktuális napot.
	 */
	LocalDate today = LocalDate.now();

	/**
	 * A Foglaláskezelő oldalon elhelyezkedő gombok, Dátum választók, Címkék.
	 */
	@FXML
	private Button btn_vissza;
	
	/**
	 * A Foglaláskezelő oldalon elhelyezkedő gombok, Dátum választók, Címkék.
	 */
	public Label priceLabel25, priceLabel50, warning25, warning50;
	
	/**
	 * A Foglaláskezelő oldalon elhelyezkedő gombok, Dátum választók, Címkék.
	 */
	public DatePicker RC25DatePicker, RC50DatePicker;
	
	/**
	 * A Foglaláskezelő oldalon elhelyezkedő gombok, Dátum választók, Címkék.
	 */
	public ChoiceBox<String> CB50, CB25;
		
	/**
	 * A Foglaláskezelő oldalon elhelyezkedő gombok az 25-es medencéhez.
	 */
	public Button RC2500, RC2501, RC2502, RC2503, RC2504, RC2505, RC2510, RC2511, RC2512, RC2513, RC2514, RC2515,
			RC2520, RC2521, RC2522, RC2523, RC2524, RC2525, RC2530, RC2531, RC2532, RC2533, RC2534, RC2535;
	
	/**
	 * A Foglaláskezelő oldalon elhelyezkedő gombok az 50-es medencéhez.
	 */
	public Button RC5000, RC5001, RC5002, RC5003, RC5004, RC5005, RC5010, RC5011, RC5012, RC5013, RC5014, RC5015,
			RC5020, RC5021, RC5022, RC5023, RC5024, RC5025, RC5030, RC5031, RC5032, RC5033, RC5034, RC5035;

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
	 * Az eddigi foglalások betöltése a fájlból 25 méteres medencében.
	 */

	@FXML
	public void load25() {
		
		logger.info("A 25 meteres medence foglalasai betoltve.");
		
		setToDefault25();
		getDate25();
		String id25 = "";
		JsonHandler handler = new JsonHandler();
		list = handler.read();
		for (Reservation reservation : list) {

			if (reservation.getDate().equals(date25)) {
				id25 = "RC" + reservation.getPoolId() + reservation.getLane() + reservation.getTime();

				if (reservation.getDate().equals(date25)) {
					switch (id25) {
					case "RC2500":
						RC2500.setStyle("-fx-background-color: red");
						break;
					case "RC2501":
						RC2501.setStyle("-fx-background-color: red");
						break;
					case "RC2502":
						RC2502.setStyle("-fx-background-color: red");
						break;
					case "RC2503":
						RC2503.setStyle("-fx-background-color: red");
						break;
					case "RC2504":
						RC2504.setStyle("-fx-background-color: red");
						break;
					case "RC2505":
						RC2505.setStyle("-fx-background-color: red");
						break;
					case "RC2510":
						RC2510.setStyle("-fx-background-color: red");
						break;
					case "RC2511":
						RC2511.setStyle("-fx-background-color: red");
						break;
					case "RC2512":
						RC2512.setStyle("-fx-background-color: red");
						break;
					case "RC2513":
						RC2513.setStyle("-fx-background-color: red");
						break;
					case "RC2514":
						RC2514.setStyle("-fx-background-color: red");
						break;
					case "RC2515":
						RC2515.setStyle("-fx-background-color: red");
						break;
					case "RC2520":
						RC2520.setStyle("-fx-background-color: red");
						break;
					case "RC2521":
						RC2521.setStyle("-fx-background-color: red");
						break;
					case "RC2522":
						RC2522.setStyle("-fx-background-color: red");
						break;
					case "RC2523":
						RC2523.setStyle("-fx-background-color: red");
						break;
					case "RC2524":
						RC2524.setStyle("-fx-background-color: red");
						break;
					case "RC2525":
						RC2525.setStyle("-fx-background-color: red");
						break;
					case "RC2530":
						RC2530.setStyle("-fx-background-color: red");
						break;
					case "RC2531":
						RC2531.setStyle("-fx-background-color: red");
						break;
					case "RC2532":
						RC2532.setStyle("-fx-background-color: red");
						break;
					case "RC2533":
						RC2533.setStyle("-fx-background-color: red");
						break;
					case "RC2534":
						RC2534.setStyle("-fx-background-color: red");
						break;
					case "RC2535":
						RC2535.setStyle("-fx-background-color: red");
						break;
					}
				}
			}
		}
	}

	/**
	 * Az eddigi foglalások betöltése fájlból az 50 méteres medencében.
	 */

	@FXML
	public void load50() {
		logger.info("Az 50 meteres medence foglalasai betoltve.");
		setToDefault50();
		getDate50();
		String id50 = "";
		JsonHandler handler = new JsonHandler();
		list = handler.read();
		for (Reservation reservation : list) {

			if (reservation.getDate().equals(date50)) {
				id50 = "RC" + reservation.getPoolId() + reservation.getLane() + reservation.getTime();
				if (reservation.getDate().equals(date50)) {
					switch (id50) {
					case "RC5000":
						RC5000.setStyle("-fx-background-color: red");
						break;
					case "RC5001":
						RC5001.setStyle("-fx-background-color: red");
						break;
					case "RC5002":
						RC5002.setStyle("-fx-background-color: red");
						break;
					case "RC5003":
						RC5003.setStyle("-fx-background-color: red");
						break;
					case "RC5004":
						RC5004.setStyle("-fx-background-color: red");
						break;
					case "RC5005":
						RC5005.setStyle("-fx-background-color: red");
						break;
					case "RC5010":
						RC5010.setStyle("-fx-background-color: red");
						break;
					case "RC5011":
						RC5011.setStyle("-fx-background-color: red");
						break;
					case "RC5012":
						RC5012.setStyle("-fx-background-color: red");
						break;
					case "RC5013":
						RC5013.setStyle("-fx-background-color: red");
						break;
					case "RC5014":
						RC5014.setStyle("-fx-background-color: red");
						break;
					case "RC5015":
						RC5015.setStyle("-fx-background-color: red");
						break;
					case "RC5020":
						RC5020.setStyle("-fx-background-color: red");
						break;
					case "RC5021":
						RC5021.setStyle("-fx-background-color: red");
						break;
					case "RC5022":
						RC5022.setStyle("-fx-background-color: red");
						break;
					case "RC5023":
						RC5023.setStyle("-fx-background-color: red");
						break;
					case "RC5024":
						RC5024.setStyle("-fx-background-color: red");
						break;
					case "RC5025":
						RC5025.setStyle("-fx-background-color: red");
						break;
					case "RC5030":
						RC5030.setStyle("-fx-background-color: red");
						break;
					case "RC5031":
						RC5031.setStyle("-fx-background-color: red");
						break;
					case "RC5032":
						RC5032.setStyle("-fx-background-color: red");
						break;
					case "RC5033":
						RC5033.setStyle("-fx-background-color: red");
						break;
					case "RC5034":
						RC5034.setStyle("-fx-background-color: red");
						break;
					case "RC5035":
						RC5035.setStyle("-fx-background-color: red");
						break;
					}
				}
			}
		}
	}

	/**
	 * A lefoglalandó / kitörlendő pályák adatainak gyűjtésére szolgáló eljárás. 
	 */

	@FXML
	public void collect(ActionEvent event) throws IOException {
		logger.info("Mezo kivalasztva");
		
		Button button = (Button) event.getSource();
		String title = button.getId();
		String pool_id, date, lane_id, time;
		pool_id = title.substring(2, 4);
		if (pool_id.equals("25")) {
			date = date25;
		} else {
			date = date50;
		}

		lane_id = title.substring(4, 5);
		time = title.substring(5, 6);

		button.setStyle("-fx-background-color: blue");

		Reservation reservation = new Reservation(pool_id, date, lane_id, time);

		selectedReservations.add(reservation);

	}

	/**
	 * Az órak meghatározásához szükséges adatokat gyűjtiössze, az 50 méteres
	 * medencével rendelkező foglalásokéból.
	 */
	@FXML
	public void calculate50() {
		
		Integer sum = 0;
		Integer price = 0;
		for (Reservation reservation : selectedReservations) {
			sum = sum + 1;
		}
		String actualDate50 = CB50.getValue();
		price = priceCalculator(actualDate50, sum);

		String stringPrice = price.toString();
		priceLabel50.setText(stringPrice + "Ft");

	}

	/**
	 * Az órak meghatározásához szükséges adatokat gyűjtiössze, a 25 méteres
	 * medencével rendelkező foglalásokéból.
	 */

	@FXML
	public void calculate25() {
		Integer sum = 0;
		Integer price = 0;
		for (Reservation reservation : selectedReservations) {
			sum = sum + 1;
		}
		String actualDate25 = CB25.getValue();
		price = priceCalculator(actualDate25, sum);

		String stringPrice = price.toString();
		priceLabel25.setText(stringPrice + "Ft");

	}

	/**
	 * A Collect függvény által a kiválasztott mezőket lefoglalja a 25 méteres
	 * medencébe.
	 * 
	 * @param event
	 * @throws IOException
	 */

	@FXML
	public void reserve25(ActionEvent event) throws IOException {
		logger.info("25-os medencebe a foglalas megtortent.");
		warning25.setText("");
		int fail = 0;
		JsonHandler handler = new JsonHandler();
		for (Reservation reservation : list) {
			for (Reservation selectedReservation : selectedReservations) {
				if (reservation.equals(selectedReservation)) {
					fail = fail + 1;
				}
			}
		}
		if (fail > 0) {
			warning25.setText("Egy vagy tobb mezo mar foglalt!");
			selectedReservations = new ArrayList<Reservation>();
			load25();
		} else {

			list.addAll(selectedReservations);
			calculate25();
			handler.jWrite(list);
			selectedReservations = new ArrayList<Reservation>();
			load25();
		}
	}

	/**
	 * A Collect függvény által a kiválasztott mezőket lefoglalja az 50 méteres
	 * medencébe.
	 * 
	 * @param event
	 * @throws IOException
	 */

	@FXML
	public void reserve50(ActionEvent event) throws IOException {
		logger.info("50-es medencebe a foglalas megtortent.");
		warning50.setText("");
		int fail = 0;
		JsonHandler handler = new JsonHandler();
		for (Reservation reservation : list) {
			for (Reservation selectedReservation : selectedReservations) {
				if (reservation.equals(selectedReservation)) {
					fail = fail + 1;
				}
			}
		}
		if (fail > 0) {
			warning50.setText("Egy vagy tobb mezo mar foglalt!");
			selectedReservations = new ArrayList<Reservation>();
			load50();
		} else {

			list.addAll(selectedReservations);
			calculate50();
			handler.jWrite(list);
			selectedReservations = new ArrayList<Reservation>();
			load50();
		}
	}

	/**
	 * A Collect függvény által a kiválasztott mezőket törli a 25 méteres
	 * medencébe.
	 * 
	 * @param event
	 * @throws IOException
	 */

	@FXML
	public void delete25(ActionEvent event) throws IOException {
		logger.info("A 25-os medencebol egy vagy tobb foglalas torolve lett.");
		JsonHandler handler = new JsonHandler();
		list.removeAll(selectedReservations);
		handler.jWrite(list);
		selectedReservations = new ArrayList<Reservation>();
		load25();

	}

	/**
	 * A Collect függvény által a kiválasztott mezőket törli az 50 méteres
	 * medencébe.
	 * 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void delete50(ActionEvent event) throws IOException {
		logger.info("Az 50-es medencebol egy vagy tobb foglalas torolve lett.");
		JsonHandler handler = new JsonHandler();
		list.removeAll(selectedReservations);
		handler.jWrite(list);
		selectedReservations = new ArrayList<Reservation>();
		load50();

	}

	/**
	 * Az oldal megnyitása után lefutó eljárás. Alapértelmezett értékeket állít be.
	 */

	@FXML
	public void initialize() {
		logger.info("Alapertelmezett ertekek beallitva.");
		CB50.getItems().add("Felnott");
		CB50.getItems().add("Gyerek");
		CB50.getItems().add("Nyugdijas");
		CB50.getItems().add("Diak");
		CB50.setValue("Felnott");
		CB25.getItems().add("Felnott");
		CB25.getItems().add("Gyerek");
		CB25.getItems().add("Nyugdijas");
		CB25.getItems().add("Diak");
		CB25.setValue("Felnott");
		RC25DatePicker.setValue(today);
		RC50DatePicker.setValue(today);
		load25();
		load50();
	}

	/**
	 * Visszaállítja a 25 méteres medencében a kezdőállapotot a foglalások terén.
	 */
	public void setToDefault25() {
		RC2500.setStyle("-fx-background-color: green");
		RC2501.setStyle("-fx-background-color: green");
		RC2502.setStyle("-fx-background-color: green");
		RC2503.setStyle("-fx-background-color: green");
		RC2504.setStyle("-fx-background-color: green");
		RC2505.setStyle("-fx-background-color: green");
		RC2510.setStyle("-fx-background-color: green");
		RC2511.setStyle("-fx-background-color: green");
		RC2512.setStyle("-fx-background-color: green");
		RC2513.setStyle("-fx-background-color: green");
		RC2514.setStyle("-fx-background-color: green");
		RC2515.setStyle("-fx-background-color: green");
		RC2520.setStyle("-fx-background-color: green");
		RC2521.setStyle("-fx-background-color: green");
		RC2522.setStyle("-fx-background-color: green");
		RC2523.setStyle("-fx-background-color: green");
		RC2524.setStyle("-fx-background-color: green");
		RC2525.setStyle("-fx-background-color: green");
		RC2530.setStyle("-fx-background-color: green");
		RC2531.setStyle("-fx-background-color: green");
		RC2532.setStyle("-fx-background-color: green");
		RC2533.setStyle("-fx-background-color: green");
		RC2534.setStyle("-fx-background-color: green");
		RC2535.setStyle("-fx-background-color: green");
	}

	/**
	 * Visszaállítja az 50 méteres medencében a kezdőállapotot a foglalások terén.
	 */
	public void setToDefault50() {
		RC5000.setStyle("-fx-background-color: green");
		RC5001.setStyle("-fx-background-color: green");
		RC5002.setStyle("-fx-background-color: green");
		RC5003.setStyle("-fx-background-color: green");
		RC5004.setStyle("-fx-background-color: green");
		RC5005.setStyle("-fx-background-color: green");
		RC5010.setStyle("-fx-background-color: green");
		RC5011.setStyle("-fx-background-color: green");
		RC5012.setStyle("-fx-background-color: green");
		RC5013.setStyle("-fx-background-color: green");
		RC5014.setStyle("-fx-background-color: green");
		RC5015.setStyle("-fx-background-color: green");
		RC5020.setStyle("-fx-background-color: green");
		RC5021.setStyle("-fx-background-color: green");
		RC5022.setStyle("-fx-background-color: green");
		RC5023.setStyle("-fx-background-color: green");
		RC5024.setStyle("-fx-background-color: green");
		RC5025.setStyle("-fx-background-color: green");
		RC5030.setStyle("-fx-background-color: green");
		RC5031.setStyle("-fx-background-color: green");
		RC5032.setStyle("-fx-background-color: green");
		RC5033.setStyle("-fx-background-color: green");
		RC5034.setStyle("-fx-background-color: green");
		RC5035.setStyle("-fx-background-color: green");
	}

	/**
	 * A 25 méteres medencében kiválasztott dátumot alakítja stringé a könnyebb kezelés érdekében.
	 */
	public void getDate25() {
		Integer ev25 = RC25DatePicker.getValue().getYear();
		Integer honap25 = RC25DatePicker.getValue().getMonthValue();
		Integer nap25 = RC25DatePicker.getValue().getDayOfMonth();
		date25 = ev25.toString() + honap25.toString() + nap25.toString();

	}

	/**
	 * Az 50 méteres medencében kiválasztott dátumot alakítja stringé a könnyebb kezelés érdekében.
	 */
	public void getDate50() {
		Integer ev50 = RC50DatePicker.getValue().getYear();
		Integer honap50 = RC50DatePicker.getValue().getMonthValue();
		Integer nap50 = RC50DatePicker.getValue().getDayOfMonth();
		date50 = ev50.toString() + honap50.toString() + nap50.toString();
	}

	/**
	 * Kiszámotja a kiválasztot jegytípusnak és a lefoglalt pályák által
	 * meghatározott fizetendő összeget.
	 * 
	 * @param value
	 * @param sum
	 * @return
	 */

	public Integer priceCalculator(String value, int sum) {
		switch (value) {
		case "Felnott":
			return sum * 1000;
		case "Diak":
			return sum * 500;
		case "Nyugdijas":
			return sum * 500;
		case "Gyerek":
			return 0;
		}

		return sum * 1000;
	}

}
