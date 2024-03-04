package com.atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atm {
	static Scanner input = new Scanner(System.in);
	static User user;
	private static Map<Integer, User> map=new HashMap<>();

	public static void main(String[] args) {
		System.out.println("\t\t\tWelcome To  NMKL ATM");
		do {
			System.out.println("Please Enter your user_id :");
			int user_id = input.nextInt();
				System.out.println("Please Enter your user_pin:");
				int user_pin = input.nextInt();
				if (authenticateUser(user_id, user_pin)) {
					boolean service_loop = true;
					do {
						System.out.println("\t Our Services ");
						System.out.println("1.Check Balance \n2.Deposite \n3.Withdraw \n4.Go Back");
						int user_input = input.nextInt();
						switch (user_input) {
						case 1: {
							System.out.println(checkBalance());
							break;
						}
						case 3: {
							System.out.println("Please Enter Withdrawal Amount : ");
							System.out.println(withdraw(input.nextDouble()));
							break;
						}
						case 2: {
							System.out.println("Please Enter Deposite Amount : ");
							System.out.println(deposite(input.nextDouble()));
							break;
						}
						case 4: {
							service_loop = false;
							System.out.println("\t\t\tTHANK YOU !!!!");
							break;
						}
						default: {
							System.out.println("Invalid Input");
							break;
						}
						}
					} while (service_loop);
				} 			 
		} while (true);
	}

	public static boolean authenticateUser(int uid, int pin) {
		user = map.get(uid);
		if(user ==null) {
			System.out.println("user id is not Exist so create new user !!");
			createUser();
			}
		return user != null && user.getUser_pin() == pin;

	}

	public static String checkBalance() {
		return "Your Balance is : " + user.getAccountBalance();
	}

	public static String deposite(double money) {
		user.addBalance(money);
		System.out.println("Money Deposited Successfully !!");
		return "Available Balance is : " + user.getAccountBalance();
	}

	public static String withdraw(double money) {
		if (user.getAccountBalance() > money) {
			user.withdraw(money);
			return "Available Balance is : " + user.getAccountBalance();
		} else
			return "Insufficient Balance";
	}

	public static void createUser() {
		System.out.println("create your user_id : ");
		int id = input.nextInt();
		System.out.println("create your user_pin : ");
		int pass = input.nextInt();
		map.put(Integer.valueOf(id),new User(id,pass));
		System.out.println("User Created Successfull !!");
	}
}
