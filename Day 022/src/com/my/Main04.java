package com.my;

import java.util.Scanner;

/*
 * 사용자로부터 임의의 두 정수와 연산자를 입력받아 계산하는 프로그램을 구현하시오
 * 단, 조건문 if와 연산결과는 모두 정수처리하시오
 */
public class Main04 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 	 
		 System.out.print("첫번째 정수 입력 : ");
		 int num1 = sc.nextInt();
		 System.out.print("연산자 입력 : ");
		 char operator = sc.next().charAt(0); //char형을 Scanner로 받는 메소드
		 System.out.print("두번째 정수입력 : ");
		 int num2 = sc.nextInt();
		 
		 if (operator == '+') {
			 int result = num1 + num2;
			 System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		 } else if ( operator == '-' ) {
			 int result = num1 - num2;
			 System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		 } else if ( operator == '*' ) {
			 int result = num1 * num2;
			 System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		 } else if ( operator == '/' ) {
			 int result = num1 / num2;
			 System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		 }
	}
}
