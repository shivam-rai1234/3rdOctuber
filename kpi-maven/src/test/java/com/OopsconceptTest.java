package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OopsconceptTest {
	@Test
	public void evaluatesExpression() 
	{
		Oppsconcept n=new Oppsconcept();
		Oppsconcept m=new Oppsconcept();
		Oppsconcept A=new Oppsconcept();
		Oppsconcept B=new Oppsconcept();
		String num=n.checknumber("y");
		String num1=m.checkoption("n");
		String num2=A.checknumber("y","n");
		assertEquals("good",num);
		assertEquals("bad",num1);
		assertEquals("this is method Overloading",num2);
		
		
		 
	}

}
