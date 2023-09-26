package com.exam;

import java.util.Scanner;

/*
 * 두 정수를 입력받아 나눗셈을 하고 몫을 구하는 프로그램을 구현하시오
 * 단, 사용자가 나누는 수에 0이 입력 되었을 때 ArithemticException을 발생시키도록 예외처리
 * 
 * 결과
 * 나누는 수 : 100
 * 나눌 수 : 0
 * 
 * console화면에 다음과 같이 출력하면 됨
 * Exception in thread "main" java.lang.ArithemticException : / by zero
 */
public class ExceptEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나누는 수 : ");
		int a = sc.nextInt();
		System.out.print("나눌 수 : ");
		int b = sc.nextInt();
		System.out.println(a / b);
	}
}
