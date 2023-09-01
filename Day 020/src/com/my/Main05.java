package com.my;

/* 형변환 : casting
 * - 변수 또는 상수의 자료형을 다른 자료형으로 바꾸는 것을 의미함
 * 
 * 자동 형변환
 * - 더 큰 자료형으로 변환(자동) short a, b;
 * - 정보의 손실이 없음			    a = b = 10;
 * 								int c = a + b;
 * 
 * 강제 형변환
 * - 더 작은 형으로 자료형을 변환(명시) int c = 0;
 * - 정보의 손실을 가져옴			  short s = 10;
 * 							  c = s + (int)(3.5f);
 * 
 * boolean 형은 형변환이 불가능함
 * 형변환의 기준은 byte 기준임
 * 
 * 
 */
public class Main05 {
	public static void main(String[] args) {
		short a,b ;
		a = b = 10;
		a = 10; b = 20;
		int c = a + b;
		System.out.println(c);		
		
		///////////////////////////////////////
		int d = 0;
		short e = 10;
		d =(int)(e + 3.5f);		//강제 형변환
		System.out.println(d);
		
	}
}
