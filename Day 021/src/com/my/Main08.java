package com.my;

import java.util.Scanner;
public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 점수를 입력 : ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("입력하신 정수는 짝수입니다.");
		} else {
			System.out.println("입력하신 정수는 홀수입니다.");
		}
	}
}
