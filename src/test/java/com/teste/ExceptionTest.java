package com.teste;

import java.util.ArrayList;

import org.junit.Test;

public class ExceptionTest {
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		new ArrayList<Object>().get(0);
	}
	
	//@Rule
	//public ExpectedException thrown = ExpectedException.none();
	
	//@Test
	//public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
	//	List<Object> list = new ArrayList<Object>();
		
	//	thrown.expect(IndexOutOfBoundsException.class);
	//	thrown.expectMessage("Index: 0, size: 0");
	//	list.get(0);
	//}
}



