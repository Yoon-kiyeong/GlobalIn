package com.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 3개의 정수를 입력받아 합계를 구하는 프로그램을 구현하시오
 * 단, 사용자가 정수가 아닌 문자를 입력했을 때 발생하는 InputMismatchException 예외를 처리하여 다시 입력받도록 구현하시오
 * 
 */
public class ExceptEx03 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		int sum = 0;
		int num = 0;
		System.out.println("정수 3개 입력");

		while (true) {
			try {
				for (int i = 0; i < arr.length; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.print((i + 1) + " : ");
					arr[i] = sc.nextInt();
					sum += arr[i];
				}
				System.out.println("합계 : " + sum);
				break;
			} catch (InputMismatchException ie) {
				System.out.println("정수가 아닙니다 다시 입력하세요");
				sum = 0;
				continue;
			}
		}
//		for (int i = 0; i < 3; i++) {
//		System.out.print(i + " : ");
//
//		try {
//			num = sc.nextInt();
//		} catch (InputMismatchException ie) {
//			System.out.println("정수가 아닙니다 다시 입력하세요");
//			sc.nextLine();
//			i--;
//			continue;
//		}
//		sum += num;
//	}
//	System.out.println("합계 : " + sum);	

	}
}
