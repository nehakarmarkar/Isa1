import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar {

	@Test
	public void test() {
		Car r=new Car();
		r.setCapacity(60);
		assertEquals(60,r.getEngineCapacity());
	}

}