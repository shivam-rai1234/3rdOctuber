package com;
//diamond structure is not possible in java when we use extends 
//we can partially solve this step with the help of interface 
//but in interface one interface can not overriding another interface value 
//so here another limitation 
public class Diamond4 implements Diamnd2,Diamond3{

	public void check() {
		// TODO Auto-generated method stub
		System.out.println("diamond problem is ");
	}

	public void check(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Using method overloading ad method overriding  ");
	}

	public void check(int a) {
		// TODO Auto-generated method stub
		System.out.println("which is not possible in java that's why we use interface intead of extend");
	}

}
