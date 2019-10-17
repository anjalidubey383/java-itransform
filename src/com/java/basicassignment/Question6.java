package com.java.basicassignment;

import java.util.Scanner;

public class Question6 {
	public static void main(String args[]) {
		System.out.println("which action you want to perform : ");
		Scanner input = new Scanner(System.in);
		Accounts acc = new Accounts();
		int i;
		do {
			System.out.println("1. Deposite");
			System.out.println("2. Withdraw");
			System.out.println("3. Check total");
			System.out.println("4. Exit");

			System.out.print("Choose ur choice:");
			i = input.nextInt();
			switch (i) {
			case 1:
				acc.deposite();
				break;
			case 2:
				acc.withdraw();
				break;
			case 3:
				acc.checktotal();
				break;

			case 4:
				break;

			}
		} while (i != 4);

	}
}

class Accounts {
	float balance = 1000;
	Scanner input = new Scanner(System.in);

	public void deposite() {
		System.out.println("Enter the ammount you want to add : ");

		float a;
		a = input.nextFloat();
		this.balance = balance + a;
		System.out.println("Rs " + a + "  is Sucessfully added.");
		System.out.println("New Balance is :" + balance);
	}

	public void checktotal() {
		// TODO Auto-generated method stub
		System.out.println("Balance :" + balance);
	}

	public void withdraw() {
		System.out.println("Enter the ammount you want to withdraw : ");
		float b;
		b = input.nextFloat();
		if(b>balance) {
			System.out.println("Balance is insufficiant." );
		}
		else {
			balance =balance-b;
			System.out.println("Rs " + b + "  is Sucessfully withdraw.");
			System.out.println("New Balance is :" + balance);
			
		}
	}

	void print() {

	}
}
