package testpack;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pack1.Junittest1;

public class TestAddition {
	@Test
	public void testAdd() {
		assertEquals(60, Junittest1.addition(30,30));
		assertEquals(80, Junittest1.addition(30,30));
	}
	
}
