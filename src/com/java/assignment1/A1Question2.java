package com.java.assignment1;

public class A1Question2 
{
		public static void main(String args[]) 
		{
			System.out.println("All Armstrong number falling between the range of 100 and 999 are : ");
			
			
			for (int num = 100 ; num <= 999 ;	num++) {
				int temp = num;
				int rem ,result=0;
				
				while(temp != 0) {
					
					rem = temp%10;
					result=result+rem*rem*rem;
					temp =temp/10;
				}
				

				if (result==num) {
					System.out.println(num);
				}
			
			}
				

		}
	}
