package com.exception.one;


/* RuntimeException과 그 외의 Exception
 * - Runtime : 컴파일 시 에러를 발생시키지 않음
 * 			       프로그램이 실행하는 도중에 에러가 발생
 * 
 * 예외를 강제적으로 발생시키는 경우
 * 	throw 예약어로 발생시킴
 * 형식 : throw new 발생시킬 예외 객체의 생성자 / throw 예약 객체
 * 
 * 
 * 
 * 
 * 
 */

public class ExceptionEx03 {
	public static void main(String[] args) throws Exception {
		Exception ee = new Exception();
		throw ee;
//		throw new Exception();
	}
}
