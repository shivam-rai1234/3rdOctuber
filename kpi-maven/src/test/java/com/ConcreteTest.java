package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConcreteTest {
	@Test
	public void evaluatesExpression() 
	{
		Concrete1 a=new Concrete1();
		Concrete1 b=new Concrete1();
		Concrete2 a1=new Concrete2();
		Concrete2 b1=new Concrete2();
		Concrete3 a2=new Concrete3();
		Concrete3 b2=new Concrete3();
		Concrete4 a3=new Concrete4();
		
		
		Concrete4 b3=new Concrete4();
		
		String n=a.property();
		String n2=a1.property();
		String n3=a2.property();
		String n4=a3.property();
		String m=b.feature();
		String m2=b1.feature();
		String m3=b2.feature();
		String m4=b3.feature();
		assertEquals("tough",n);
		assertEquals("big",m);
		assertEquals("soft",n2);
		assertEquals("very big",m2);
		assertEquals("very hard",n3);
		assertEquals("small",m3);
		assertEquals("very soft",n4);
		assertEquals("very small",m4);
	}

}
