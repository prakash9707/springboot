package io.javabrains.springbootstarter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	Addition addobj = new Addition();
	@Test
	void add() {
		int sum = addobj.add(1, 2);
		assertEquals(sum, 3);
		
	}

}
