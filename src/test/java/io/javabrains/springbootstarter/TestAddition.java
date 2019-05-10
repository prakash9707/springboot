package io.javabrains.springbootstarter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestAddition {

	

		Addition addobj = new Addition();
		@Test
		public void add() {
			int sum = addobj.add(1, 2);
			assertEquals(sum, 3);
			
		}
		
		@Test
		public void adds() {
			int sum = addobj.add(1, 1);
			assertEquals(sum, 2);
		}
		

	}



