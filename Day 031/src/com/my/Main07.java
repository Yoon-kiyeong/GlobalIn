package com.my;

public class Main07 {
	private String name; // �̸�
	private long balance; // �ܾ�

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
	
	//�Ա� ���
	public void deposit(long amount) {
		balance += amount;
	}
	
	public void withdraw(long amount) {
		if(balance < amount) {
			System.out.println("�ܾ��� �����մϴ�");
		} else {
			balance -= amount;
		}
	}
}
