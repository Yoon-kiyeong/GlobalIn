package com.my;

/* 화면에 내용을 출력
 * System.out : 출력하는 스트림 (console) : 모니터
 * System.in : 입력하는 스트림 (키보드)
 * - 표준 입출력
*/
public class Main06 {
	public static void main(String[] args) {
		System.out.println(); // 내용을 출력하고 행을 바꾼다
		System.out.print(55); // 괄호 안에 있는 내용을 출력하고 행을 바꾸지 않는다.
		System.out.printf(""); // 출력하고자 하는 형식을 지정해야 한다.(서식)
		System.out.println();
		
		int a, b;
		float c;
		a = 10; b = 20; c = b / a;
		System.out.printf("%d + %d = %d%n",a ,b, a + b);
		System.out.printf("%d + %d = %.1f%n",a ,b, c);
		
		char ch = 'A';
		String s = "ABCDE";
		System.out.println(ch);
		System.out.printf("%c%n", ch);
		System.out.printf("%s", s);
		
		
	}
}
