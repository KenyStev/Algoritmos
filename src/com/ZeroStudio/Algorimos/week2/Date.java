package com.ZeroStudio.Algorimos.week2;

public class Date implements Comparable<Date>{

	private final int year, month, day;
	
	public Date(int y, int m, int d) {
		year=y;
		month=m;
		day=d;
	}

	@Override
	public int compareTo(Date that) {
		if(this.year 	< that.year) 	return -1;
		if(this.year 	> that.year) 	return +1;
		if(this.month 	< that.month) 	return -1;
		if(this.month 	> that.month) 	return +1;
		if(this.day 	< that.day) 	return -1;
		if(this.day 	> that.day) 	return +1;
		return 0;
	}

}
