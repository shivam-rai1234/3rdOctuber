package com;

import java.util.HashMap;
import java.util.Map;

public class Maping {
	public static int show() {
	Map<String, Integer> shi=new HashMap<String, Integer>();
	shi.put("shivam",100);
	shi.put("saynam",200);
	shi.put("abhitayu",300);
	shi.put("abhishek",400);
	shi.put("saynam",300);
	shi.get("saynam");//get method use to get the value from the key
	System.out.println(shi);
	System.out.println(shi.get("saynam"));
	return shi.get("saynam");
	}
}
