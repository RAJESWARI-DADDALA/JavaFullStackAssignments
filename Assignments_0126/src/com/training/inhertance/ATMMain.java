package com.training.inhertance;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter Account type : SAVINGS or CURRENT ");

		String accountType = scan.next();

		switch (accountType) {
		case "SAVINGS": {
			Savings savings = new Savings(10000);
			System.out.println(" Deposit / Withdrawel ? \n ");
			String transactionType = scan.next();
			System.out.println(" Enter Amount \n");
			if("deposit".equalsIgnoreCase(transactionType)) {
				double depositAmount = scan.nextDouble();
				savings.deposit(depositAmount);
			}else {
				double withdrawlAmount = scan.nextDouble();
				savings.withdraw(withdrawlAmount);
			}
			System.out.println("Savings Balence : " + savings.getBalence()); 
			break;
		}
		case "CURRENT": {
			
			Current current = new Current(10000);
			System.out.println(" Deposit / Withdrawel ? \n ");
			String transactionType = scan.next();
			System.out.println(" Enter Amount \n");
			if("deposit".equalsIgnoreCase(transactionType)) {
				double depositAmount = scan.nextDouble();
				current.deposit(depositAmount);
			}else {
				double withdrawlAmount = scan.nextDouble();
				current.withdraw(withdrawlAmount);
			}
			System.out.println("Current Balence : " + current.getBalence()); 

			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + accountType);
		}
		
		

	}

}
