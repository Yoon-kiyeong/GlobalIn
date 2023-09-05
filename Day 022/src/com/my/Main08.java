package com.my;

import java.io.IOException;

/*
 * 사용자로부터 임의의 알파벳 한 문자를 입력받아 입력받은 알파벳이 모음일 경우에만 출력하는 프로그램을 구현하시오
 * 조건 : 대소문자를 모두 적용하고 이외의 문자가 들어오는 경우 입력오류 처리하시오
 * 
 */
public class Main08 {
	public static void main(String[] args) throws IOException {

		System.out.print("알파벳을 입력하세요 : ");
		char ch = (char) System.in.read();
		
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
				System.out.println("모음입니다.");
			} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U') {
				System.out.println("대문자 모음 입니다.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}
}
