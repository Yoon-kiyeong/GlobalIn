package com.test;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 가능");
		String str = sc.nextLine();
		for(int i = 0; i <= str.length(); i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0,i));
		}
	}
}
