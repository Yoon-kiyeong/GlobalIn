package com.my;

import java.util.Scanner;

public class main07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		char operator = sc.next().charAt(0);
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		int result;
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
			break;
		case '/':
			result = num1 / num2;
			 System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
			 break;
		}
	}
}
