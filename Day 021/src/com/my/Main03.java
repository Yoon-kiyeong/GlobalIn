package com.my;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		String city = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("ü�� : ");
		double weight = sc.nextDouble();
		
		System.out.print("���� ���� : ");
		boolean isSingle = sc.nextBoolean();
		
		System.out.printf("�̸� : %s%n", name);
		System.out.printf("���� : %s%n", city);
		System.out.printf("����  : %d%n", age);
		System.out.printf("ü�� : %.2f%n", weight);
		System.out.printf("���ſ��� : %b%n", isSingle);
			
		sc.close();
	}
}
