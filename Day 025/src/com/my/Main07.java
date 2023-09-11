package com.my;
/** 반복문을 이용해서 A ~ Z까지 출력하는 프로그램을 작성하시오
 * 
 * 
 *
 */
public class Main07 {
	public static void main(String[] args) {
		for(char i='A'; i<='Z'; i++) {
			System.out.println("영문 : "+i);
		} System.out.println();
		for(char i=65; i<=90 ; i++) {
			System.out.println("영문 : "+i);
		}
	}
}
