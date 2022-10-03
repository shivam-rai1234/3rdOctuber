package com;

public class Oppsconcept extends ParentClass implements InterfaceQuestion3{
//in line number 3 we do multiple inharitance as well multi level inharitance 
//In this code I include all 4 piller of Oops concept 
	//1-Inheritance
	//1.1-multiple Inheritance
	//1.2-multi level Inheritance
	//2.Abstraction (with AbstractQuestion3 class I implement abstraction mathos as well class)
	//3.Polymorphism
	//3.1 override polymorphism(line 18 show )
	//3.2 overloading polymorphism(line 30 show )
	//4.Incapsulation as well.
	
	

	@Override
	public String checknumber(String n) {
		// TODO Auto-generated method stub
		 n="y";
		return "good";
	}

	public String checkoption(String m) {
		// TODO Auto-generated method stub
		 m="n";
		return "bad";
	}
//overloading 
	public String checknumber(String A,String B) 
	{
		return "this is method Overloading";
	}
}



	




	


