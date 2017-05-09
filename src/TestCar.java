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
	
	public void testForSuccess2() {
		Car r=new Car();
		r.setCapacity(60);
		assertTrue(r.getEngineCapacity() > 100);
	}
	
	public void testForSuccess3() {
		Car r=new Car();
		r.setCapacity(200);
		assertEquals(200,r.getEngineCapacity());
	}
	

}