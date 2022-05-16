package com.demo.exception;

public class MyGreatTime {
	private int minutes = 0;

	public int getMinutes() {
	return minutes;
	}

	public void setMinutes1(int minutes) throws ValueException{

	if(80 < minutes)
	{
	throw new ValueException("try to time set 80 mintues");
	}

	this.minutes = minutes;
	}


}
