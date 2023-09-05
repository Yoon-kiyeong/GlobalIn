package com.my;

import java.util.Scanner;

public class Main14 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(((a + b) >c) == true && ((a + c) > b) == true && ((b + c) > a) == true) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 되지 않습니다.");
		}
	}
}
