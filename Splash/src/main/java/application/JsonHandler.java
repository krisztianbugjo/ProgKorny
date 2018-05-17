package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import models.Reservation;

/**
 * JSon fájl irását/olvasását irányító osztály.
 */

public class JsonHandler {

	private static Logger logger = LoggerFactory.getLogger(ReservationCreatorController.class);

	/**
	 * A fájl írását írányító függvény. A függvény megkap egy listát, melyben 4
	 * paraméter van, majd ezeket a megfelelő helyre írja a fájlban.
	 */
	public void jWrite(List<Reservation> list) {

		JSONObject MainObj = new JSONObject();
		JSONArray JsonList = new JSONArray();
		for (Reservation reservation : list) {

			JSONObject obj = new JSONObject();
			obj.put("pool_id", reservation.getPoolId());
			obj.put("date", reservation.getDate());
			obj.put("lane_id", reservation.getLane());
			obj.put("time", reservation.getTime());
			JsonList.add(obj);
		}
		MainObj.put("reservations", JsonList);

		ClassLoader classLoader = getClass().getClassLoader();

		try (FileWriter file = new FileWriter(classLoader.getResource("reservations.json").getFile())) {

			file.write(MainObj.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * A fájlból kiolvassa az összes foglalást, és kigyűjti őket egy listába.
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */

	public List<Reservation> read() throws  FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		List<Reservation> reservations = new ArrayList<Reservation>();

		try {
			

			Object obj;

			ClassLoader classLoader = getClass().getClassLoader();
			obj = parser.parse(new FileReader(classLoader.getResource("reservations.json").getFile()));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray reservationJSonArray = (JSONArray) jsonObject.get("reservations");
			Iterator<JSONObject> iterator = reservationJSonArray.iterator();
			while (iterator.hasNext()) {

				JSONObject jsonObjectIterator = (JSONObject) iterator.next();

				String poolId = (String) jsonObjectIterator.get("pool_id");
				String laneId = (String) jsonObjectIterator.get("lane_id");
				String time = (String) jsonObjectIterator.get("time");
				String date = (String) jsonObjectIterator.get("date");

				Reservation reservation = new Reservation(poolId, date, laneId, time);
				reservations.add(reservation);

			}

		} catch (FileNotFoundException e) {
			logger.error(e.toString());
			throw new FileNotFoundException();
			// e.printStackTrace();
		} catch (IOException e) {
			logger.error(e.toString());
			throw new IOException();
			// e.printStackTrace();
		} catch (ParseException e) {
			logger.error(e.toString());
			throw new ParseException(0);
			
			// e.printStackTrace();
		}
		return reservations;
	}

}
