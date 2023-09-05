package com.my;
/* 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 2의 배수인지, 3의 배수인지, 2와 3의 배수인지, 2와 3의 배수가 아닌지를 판정하는 프로그램을 구하시오
 * 
 */

import java.io.*;
public class Main03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자를 입력하세요 ");
		int num = Integer.parseInt(br.readLine());
		System.out.println(num);
		
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의 배수 입니다.");
		} else if (num % 2 == 0) {
			System.out.println("2의 배수 입니다.");
		} else if (num % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
		
	}
}
