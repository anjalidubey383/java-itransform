package com.java.basicassignment;

import java.util.ArrayList;
import java.util.Scanner;


public class Question7 {
	static Scanner scanner = new Scanner(System.in);
	static double sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		scanner = new Scanner(System.in);
		/*
		 * System.out.println("enter the no of marks you want:- "); int
		 * j=scanner.nextInt();
		 */
		ArrayList<Integer> arrayList = new ArrayList<>(3);
		System.out.println("Enter marks of three (3) Subject : ");
		for (int i = 0; i < 3; i++) {
			arrayList.add(scanner.nextInt());
		}
		for (Integer integer : arrayList) {
			if (integer > 60) {
				count++;
			}
		}
		if (count == arrayList.size())
			System.out.println("Passed : All three subject marks are greater then 60.");
		if (count < arrayList.size() && count >= 2)
			System.out.println("Promoted : " + count + " subject marks are greater than 60.");
		if (count < 2 || count == 0)
			System.out.println("Failed : " + count + " subject marks are greater than 60.");
	}
}
