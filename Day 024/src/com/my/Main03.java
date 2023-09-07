package com.my;

import java.util.Scanner;

/*
 * 사용자로부터 하나의 숫자를 입력받아 그 수 만큼 3의 배수를 출력하는 프로그램을 구현
 */
public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int three = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= three; i++) {
			System.out.print((i *3) + "\t");
		}
	}
}
