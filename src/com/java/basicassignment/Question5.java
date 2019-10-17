package com.java.basicassignment;

import java.util.Scanner;

public class Question5 
{		
	public static void main(String args[])
	{
		int ch=0;
		float num1,num2,answer;		
		ComplexNumber cal = new ComplexNumber() ;
		Scanner input =  new Scanner(System.in);
 
		System.out.print("Enter the first Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		ComplexNumber Object1  = new ComplexNumber(num1,num2);
 
		System.out.print("Enter the Second Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		ComplexNumber Object2  = new ComplexNumber(num1,num2);
		do
		{
			System.out.println("1.Add");
			System.out.println("2.Subtract");			
			System.out.println("3.Multiplication");			
			System.out.println("4.Swap");
			System.out.println("5.Exit");
			System.out.print("Choose ur choice:");
			ch = input.nextInt();
			switch(ch)
			{
				case 1:				
					cal.AddNumbers(Object1,Object2);
					break;				
				case 2:
					cal.SubtractNumbers(Object1,Object2);
					break;
				case 3:				
					cal.MultiplyNumbers(Object1,Object2);
					break;				
				case 4:				
					cal.swap(Object1 ,Object2);
					break;				
				case 5:	
					break;
				
			}
		}while(ch!=5);
	
	}

	
}
 
