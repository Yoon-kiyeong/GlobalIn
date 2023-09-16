package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {

	// ����
	public static int add(int x, int y) {
		return x + y;
	}

	// ����
	public static int min(int x, int y) {
		return x - y;
	}

	// ����
	public static int multi(int x, int y) {
		return x * y;
	}

	// ������
	public static int div(int x, int y) {
		return x / y;
	}

	// ������
	public static int pert(int x, int y) {
		return x % y;
	}

	// ��� ���
	public static void print(int a, char b, int c, int d) {
		System.out.println();
		System.out.println(a + " " + b + " " + c + " = " + d);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, sum = 0;
		char oper = 0; // �ƽ�Ű�ڵ�� �ްڴ� �ǹ̷� 0

		System.out.print("ù��° �� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		do {
			System.out.print("������ �Է� : (+,-,*,/,%) ");
			oper = (char) System.in.read(); // ���ڷ� �ٲٱ� ���� char�� ����ȯ
			System.in.read();
			System.in.read();
//			System.in.skip(2);
		} while (oper != '+' && oper != '-' && oper != '*' && oper != '/' && oper != '%'); // �ش� �����ڰ� �ƴҶ� �ݺ��Ǵ� ���ǽ�

		System.out.print("�ι�° �� �Է� : ");
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
