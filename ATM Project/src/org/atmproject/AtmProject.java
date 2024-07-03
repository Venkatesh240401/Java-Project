package org.atmproject;

import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		
		int pin = 1234;
		int balance = 1000;
		
		int CreditAmount = 0;
		int DebitAmount = 0;
		
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		//want to get input by an user
		System.out.println("Enter your pin number : ");
		
		
		int password = scanner.nextInt();

		
		if(password==pin) {
			System.out.println("Enter your name : ");
			name = scanner.next();
			System.out.println("Hi "+name);
			
			while(true) {
				System.out.println("Press 1 to check your balance");
				System.out.println("Press 2 to Credit Amount");
				System.out.println("Press 3 to Debit Amount");
				System.out.println("Press 4 to get receipt");
				System.out.println("Press 5 to EXIT");
				
				int opt = scanner.nextInt();
				switch(opt) {
				case 1:
					System.out.println("Your Available balance is "+balance);
					break;
				case 2:
					System.out.println("How much money did you want to credit to your bank account");
					CreditAmount = scanner.nextInt();
					System.out.println("Successfully credited");
					balance = CreditAmount + balance;
					break;
				case 3:
					System.out.println("How much money did you want to debit from your account");
					DebitAmount=scanner.nextInt();
					if(DebitAmount>balance) {
						System.out.println("Insufficient balance");
					}
					else {
						System.out.println("Successfully debited");
						balance = balance - DebitAmount;
					}
					break;
				case 4:
					System.out.println("Welcome to ABC ATM");
					System.out.println("Available balance : "+balance);
					System.out.println("Amount credited : "+CreditAmount);
					System.out.println("Amount debited : "+DebitAmount);
					System.out.println("Thanks for using the ATM");
					break;
				}
				if(opt == 5) {
					System.out.println("Thank you");
					break;
				}
				
			}
		}
		else {
			System.out.println("Pin number entered is wrong");
		}
		
	}
	
}
