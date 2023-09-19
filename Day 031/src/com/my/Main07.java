package com.my;

public class Main07 {
	private String name; // 이름
	private long balance; // 잔액

	public Main07() {}

	public Main07(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	//입금 기능
	public void deposit(long amount) {
		balance += amount;
	}
	
	public void withdraw(long amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족합니다");
		} else {
			balance -= amount;
		}
	}
}
