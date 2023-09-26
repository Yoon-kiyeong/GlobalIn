package com.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("곱하고자 하는 두 수 입력 : ");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n + " * " + m + " = " + n * m);
				break;
			} catch (InputMismatchException ie) {
				System.out.println("실수는 입력하면 안됩니다");
				sc.nextLine();
				continue;
			}
		} while (true);
		sc.close();
	}
}
