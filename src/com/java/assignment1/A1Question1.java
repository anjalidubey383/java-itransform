package com.java.assignment1;
import java.util.Scanner;

public class A1Question1 {
	public static void main(String args[]) {
		System.out.println("Enter the number to check whether is is Armstrong number or not : ");
		Scanner input = new Scanner(System.in);
		int num,rem,result=0;
		num = input.nextInt();
		int temp=num;
		   while (num != 0)
	        {
	            rem = num % 10;
	            result += Math.pow(rem, 3);
	            num /= 10;
	        }
	        if(result == temp)
	            System.out.println(temp + " is an Armstrong number.");
	        else
	            System.out.println(temp + " is not an Armstrong number.");
	    }

}
