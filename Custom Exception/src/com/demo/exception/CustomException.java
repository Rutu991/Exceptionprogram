package com.demo.exception;

public class CustomException {
public static void main(String[] args) {
		
	MyGreatTime pc = new MyGreatTime();
	try {

	pc.setMinutes1(1000);

	} catch (ValueException e) {
	
	e.printStackTrace();
	System.out.println(pc.getMinutes());
	}


	}

}
