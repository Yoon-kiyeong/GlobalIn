package com.my;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("도시 : ");
		String city = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("체중 : ");
		double weight = sc.nextDouble();
		
		System.out.print("독신 여부 : ");
		boolean isSingle = sc.nextBoolean();
		
		System.out.printf("이름 : %s%n", name);
		System.out.printf("도시 : %s%n", city);
		System.out.printf("나이  : %d%n", age);
		System.out.printf("체중 : %.2f%n", weight);
		System.out.printf("독신여부 : %b%n", isSingle);
			
		sc.close();
	}
}
