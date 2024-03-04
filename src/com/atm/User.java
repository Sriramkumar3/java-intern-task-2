package com.atm;

public class User {
	public int  user_id;
	private int user_pin;
	private double accountBalance;
	
	public User(int uid,int pin) {
		this.user_id=uid;
		this.user_pin=pin;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int uid) {
		this.user_id = uid;
	}

	public int getUser_pin() {
		return user_pin;
	}

	public void setUser_pin(int pin) {
		this.user_pin = pin;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public double addBalance(double money) {
		return accountBalance+=money;
	}

	public void withdraw(double money) {
		accountBalance-=money;
	}	
	
}
