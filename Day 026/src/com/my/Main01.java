package com.my;
/*	배열의 개념
 * - 배열은 같은 자료형들끼리 모아둔 하나의 묶음으로 다루는 것
 * - 배열은 같은 타입의 여러변수를 하나의 묶음으로 나누는 것
 * - 자바에서 하나의 배열은 하나의 객체로 인식함
 * - 동일한 자료형이 여러 개 반복될 때 하나의 변수명으로 관리하며, 각각의 구분은 순차적인 첨자(인덱스)를 사용함
 * - 인덱스의 시작은 0부터 시작함
 * - 객체 자료형의 크기는 4바이트임
 * 
 * 	1차원 배열
 * 	배열 선언 : int[] 배열명; 또는 int 배열명[];
 * 
 *  배열의 초기화
 *  배열명 = new 자료형[개수];
 *  배열명 = {값1,값2,값3,...};
 *  		배열의 크기는 초기화된 값에 의해서 크기가 결정된다.
 * 	new에 의해서 할당되면 자동으로 초기화됨
 *  ex) int a[] = new int[3];
 *  	a[0] = 0, a[1] = 0, a[2] = 0
 *  
 *  	배열을 활욜할 때
 *  for(int temp : a) {
 *  }
 */

public class Main01 {
	public static void main(String[] args) {
		char[] ch; // 배열 선언
		ch = new char[4]; // 배열의 초기화

		// 값의 할당 (값에 배열을 저장했다)
		ch[0] = 'J';
		ch[1] = 'O';
		ch[2] = 'H';
		ch[3] = 'N';

		// 배열에 저장되어 있는 값 출력
		for (int i = 0; i < 4; i++) { // 배열의 크기만큼
			System.out.println("ch : " + ch[i]);
		}
		
		for (int i = 0; i < ch.length; i++) { // 배열의 크기를 자동으로 함
			System.out.println("ch : " + ch[i]);
		}
	}
}
