package com.my;
// 관계연산자 : ==, !=, < , >, <=. >=
public class Main07 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean c = a > b;
		System.out.println("a > b : " + c);
		c = (a != b);
		System.out.println("a != b : " + c);
		
		/* 논리 연산자
			&& || : 앞의 것만으로 판단 가능이면 판단함
			& | : 두 개의 값을 가지고 판단함
		 */
 		boolean q;
		boolean w;
		
		if((q = 4 > 3) | (w = 5 > 7)) {
			System.out.println(q);
			System.out.println(w);
		}
		
		/* 삼항 연산자
		 * - 조건항 ? 행1(조건이 true일 경우) : 항2(조건이 false일 경우)
		 * - 조건이 참일 경우 항 1을 수행
		 * - 조건이 거짓일 경우 항 2를 수행
		 */
		
		int e = 20, r = 30, max;
		max = e > r? e++ : r++;
		System.out.println("max : " + max);
		System.out.println("e : " + e);
		System.out.println("r : " + r);
	}
}
