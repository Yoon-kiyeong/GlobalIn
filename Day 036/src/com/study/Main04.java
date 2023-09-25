package com.study;

public class Main04 {
	public static void main(String[] args) {
		Archer archer1 = new Archer("애쉬", "상");
		Archer archer2 = new Archer("애쉬", "상");
		System.out.println(archer1 == archer2);
		System.out.println(archer1.equals(archer2));
	}
}
