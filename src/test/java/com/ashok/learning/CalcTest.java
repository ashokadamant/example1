package com.ashok.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

	@Test
	public void testDivide() {
		//fail("Not yet implemented"); // TODO
		//assertEquals(4,4);
		Calc c=new Calc();
	 assertEquals(5,c.divide(10, 2));
	 assertThrows(ArithmeticException.class,()->c.divide(0, 9),"Exception not thrown");
	 assertEquals(2,2);

		
		
	}

}
