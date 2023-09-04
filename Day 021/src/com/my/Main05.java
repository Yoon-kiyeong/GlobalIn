package com.my;

import java.io.*;
public class Main05 {
	public static void main(String[] args) throws IOException{
//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(is);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		String s = br.readLine();
		
		System.out.println("입력받은 문자열 : " + s);
		
		//숫자열(두 자리 이상 입력 받기)
		System.out.print("숫자 입력 : ");
		// "\r" = 13
		// jvm이 실행시 엔터카드 하나의 입력으로 받아들이기 때문
		
		int num = Integer.parseInt(br.readLine());
		System.out.println("입력받은 숫자 : " + num);
	}
}
