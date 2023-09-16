package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {

	// 덧셈
	public static int add(int x, int y) {
		return x + y;
	}

	// 뺄셈
	public static int min(int x, int y) {
		return x - y;
	}

	// 곱셈
	public static int multi(int x, int y) {
		return x * y;
	}

	// 나눗셈
	public static int div(int x, int y) {
		return x / y;
	}

	// 나머지
	public static int pert(int x, int y) {
		return x % y;
	}

	// 출력 기능
	public static void print(int a, char b, int c, int d) {
		System.out.println();
		System.out.println(a + " " + b + " " + c + " = " + d);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, sum = 0;
		char oper = 0; // 아스키코드로 받겠단 의미로 0

		System.out.print("첫번째 수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		do {
			System.out.print("연산자 입력 : (+,-,*,/,%) ");
			oper = (char) System.in.read(); // 문자로 바꾸기 위해 char로 형변환
			System.in.read();
			System.in.read();
//			System.in.skip(2);
		} while (oper != '+' && oper != '-' && oper != '*' && oper != '/' && oper != '%'); // 해당 연산자가 아닐때 반복되는 조건식

		System.out.print("두번째 수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		switch (oper) {
		case '+':
//			sum = add(num1, num2);
			print(num1, oper, num2, add(num1,num2));
			break;
		case '-':
//			sum = min(num1, num2);
			print(num1, oper, num2, min(num1,num2));
			break;
		case '*':
//			sum = multi(num1, num2);
			print(num1, oper, num2, multi(num1,num2));
			break;
		case '/':
//			sum = div(num1, num2);
			print(num1, oper, num2, div(num1,num2));
			break;
		case '%':
//			sum = pert(num1, num2);
			print(num1, oper, num2, pert(num1,num2));
			break;
		default:
			break;
		}

//		print(num1, oper, num2, sum);
	}
}
