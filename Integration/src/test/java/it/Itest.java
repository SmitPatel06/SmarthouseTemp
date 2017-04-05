package it;

import static org.junit.Assert.*;

import org.junit.Test;

import a.A1;
import b.B1;

public class Itest {

	@Test
	public void test() {
		assertEquals(new A1().sum(new B1().createNum(1),3), 5);
		assertEquals(new c.C().cc(), 42);
	}

}
