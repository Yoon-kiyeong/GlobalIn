package com.my;

import java.io.*;

/* 표준 입 출력
 * import java.io.InputStreamReader;
 * 반드시 메소드 뒤에 throws IOException 처리를 해야 함
 */

public class Main04 {
	public static void main(String[] args) throws IOException {
		System.out.print("문자 입력 : ");
		int i = System.in.read();
		System.out.println("ASCII 코드 입력 : " + i);
		System.in.read();
		System.in.read();
//		System.out.println("입력받은 아스키 코드 값 : " + i);
		
		System.out.print("문자 입력 : ");
		char ch = (char)System.in.read(); //char형으로 형변환 시킴으로써 오류 방지
		System.in.read();
		System.in.read();
		System.out.println("입력받은 문자 : " + ch );
		
		System.out.print("숫자 하나 입력 : ");
		int num = System.in.read() - 48;
//		System.in.read();
//		System.in.read();
		System.in.skip(2);
		System.out.print("숫자 하나 입력 : ");
		int num2 = System.in.read() - 48;
		System.out.println("입력받은 숫자 : " + num);
		System.out.println("입력받은 숫자 : " + num2);
	}
}
