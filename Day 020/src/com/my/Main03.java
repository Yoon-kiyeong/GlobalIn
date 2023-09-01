package com.my;

/* 클래스를 정의하는 규칙
 * 1. 클래스의 이름은 첫글자가 항상 대문자로 한다.
 *    변수와 메소드(함수)의 이름은 첫글자가 소문자로 한다.
 * 2. 여러 단어로 이루어진 이름은 단어의 첫글자를 대문자로 한다.
 * 3. 클래스의 이름을 정의할 때는 반드시 파일이름과 같아야 한다. (실행 클래스)
 * 
 * 변수명을 정의하는 규칙
 * 1. 대소문자가 구분되며 길이에는 제한이 없다.
 * 2. 예약어는 사용 불가
 * 3. 숫자로 시작할 수 없다.
 * 4. 특수문자는 '_', '$'만을 허용함
 * 
 * 변수의 타입(자료형)
 * 기본형  실제 값을 저장함
 * ex) 논리형, 문자형, 정수형, 실수형
 * 참조형 : 주소값을 저장함
 * ex) 객체, 배열로 기본 자료형을 제외한 나머지
 * 
 * boolean : 유일한 논리 자료형
 * 			  크기 1byte 이지만, 사용은 1비트만 사용함 가지는 결과 값은 true, false
 * 
 * byte : 1byte 정수형
 * 범위 : -128 ~ 127
 * 
 * short : 2byte 크기의 정수형
 * 범위 : -32,768 ~ 32767 ==> 65535
 * 
 * char : 2byte 문자형 데이터
 * - 아스키 코드 : 1 바이트 문자를 표현, 범위 : 0 ~ 255
 * - 유니코드(세계문자표준) : 2 바이트 문자표현, 0 ~ 65535 세계 여러 국가의 문자들까지 표현하기에 부족해서 1바이트를 추가해서 표현하는 방식(영어를 제외한 비영어권 문자는 2byte로 표현)
 * 
 * 실수형 : float, double --> 소수점을 포함
 * 		   실수형의 기본형 --> double
 */

public class Main03 {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println("변수의 b 값은 : " + b);
		
		byte bb = 127;
		bb++;
		System.out.println("bb의 값은 : " + bb);
		
		short s = 1; //초기화를 하지 않을 시 에러 발생
		System.out.println("short s : " + s);
		
		char ch = 'A';		
		char ch2 = '\u0041';
		System.out.println(ch);
		System.out.println(ch2);
		
		final float f1, f2; // 변수를 상수로 만드는 방법 (변수 앞에 final 키워드를 사용하면 됨)
		f1 = 3.4f; // 잘형이 float인 경우 마지막에 f를 붙여주어야 한다.
		f2 = 55.55f;

		final double PI = 3.1415;
		
		System.out.println(f1);
		System.out.println(f2);
		
	}
}
