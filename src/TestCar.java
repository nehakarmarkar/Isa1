import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar {

	@Test
	public void testForFail() {
		Car r=new Car();
		r.setCapacity(60);
		assertEquals(60,r.getEngineCapacity());
	}
	
	public void testForSuccess() {
		Car r=new Car();
		r.setCapacity(100);
		assertEquals(100,r.getEngineCapacity());
	}

}