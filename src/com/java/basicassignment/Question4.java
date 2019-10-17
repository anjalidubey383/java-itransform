package com.java.basicassignment;

public class Question4 {

	public static void swap(Date d1 , Date d2)
	{
		Date temp=d1;
		d1=d2;
		d2=temp;
		System.out.println("day= "+d1.getDay()+" "+"month= "+d1.getMonth()+" "+"Year= "+d1.getYear());
		System.out.println("day= "+d2.getDay()+" "+"month= "+d2.getMonth()+" "+"Year= "+d2.getYear());
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Date d=new Date();
		
		Date d3 = new Date();
		d3.setDay(21);
		d3.setMonth(9);
		d3.setYear(1996);
		
		Date d4 = new Date();
		d4.setDay(14);
		d4.setMonth(8);
		d4.setYear(1991);
		 System.out.println("Before Swap :");
		d3.printDate();
		d4.printDate();
		System.out.println("After Swap :");
		swap(d3,d4);
		
		}

}
