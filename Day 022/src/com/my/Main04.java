package com.my;

import java.util.Scanner;

/*
 * ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾� ����ϴ� ���α׷��� �����Ͻÿ�
 * ��, ���ǹ� if�� �������� ��� ����ó���Ͻÿ�
 */
public class Main04 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 	 
		 System.out.print("ù��° ���� �Է� : ");
		 int num1 = sc.nextInt();
		 System.out.print("������ �Է� : ");
		 char operator = sc.next().charAt(0); //char���� Scanner�� �޴� �޼ҵ�
		 System.out.print("�ι�° �����Է� : ");
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
