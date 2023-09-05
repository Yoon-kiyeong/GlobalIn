package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("알파벳 한 문자 입력 : ");
		int n = System.in.read();
		
		if(n >= 65 && n <= 90) {
			n+=32;
			System.out.println((char)n);
		} else if(n >= 97 && n <= 122) {
			n -= 32;
			System.out.println((char)n);
		} else {
			System.out.println("입력 오류");
		}
	}
}
