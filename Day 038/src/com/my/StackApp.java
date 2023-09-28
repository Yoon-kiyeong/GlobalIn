package com.my;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("총 스택 저장 공간의 크기 입력 : ");
		int num = sc.nextInt();

		StringStack ss = new StringStack();
		ss.arrSet(num);

		String data = "";
		do {
			System.out.print("문자열 입력 : ");
			data = sc.next();
			if (!(data.equals("그만"))) {

				if (!ss.push(data)) {
					System.out.println("스택이 꽉차서 입력 불가");
				}
			}
		} while (!data.equals("그만"));

		System.out.print("스택에 저장된 문자열 : ");
		for (int i = 0; i < ss.capacity(); i++) {
			System.out.print(ss.pop() + " ");
		}
	}
}
