package com.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("���ϰ��� �ϴ� �� �� �Է� : ");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n + " * " + m + " = " + n * m);
				break;
			} catch (InputMismatchException ie) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�");
				sc.nextLine();
				continue;
			}
		} while (true);
		sc.close();
	}
}
