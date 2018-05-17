package application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReservationCreatorControllerTest {

	
	@Test
	public void priceCalculatorTester() {
		ReservationCreatorController controller = new ReservationCreatorController();
		
		assertEquals(2500,(int) controller.priceCalculator("Diak", 5));
		assertEquals(0,(int) controller.priceCalculator("Gyerek", 2));
		assertEquals(1000,(int) controller.priceCalculator("Nyugdijas", 2));
		assertEquals(5000,(int) controller.priceCalculator("Felnott", 5));
		assertEquals(0,(int) controller.priceCalculator("Diak", 0));
		assertEquals(1000,(int) controller.priceCalculator("", 1));
		
	}
	
}
