package application;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.junit.Test;

import models.Reservation;

public class JsonHandlerTest {

	
	 @Test
	 public void reservetionReaderTester() throws FileNotFoundException {
		 JsonHandler handler = new JsonHandler();
		 Reservation reservation = new Reservation("25", "2018513", "2", "4");
		 List<Reservation> list = new ArrayList<>();
		 list.add(reservation);
		 handler.jWrite(list);
		 
		 try {
			assertEquals(new Reservation("25", "2018513", "2", "4"), handler.read().get(0));
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	 }
}
