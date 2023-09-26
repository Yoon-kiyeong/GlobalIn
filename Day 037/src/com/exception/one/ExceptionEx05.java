package com.exception.one;

public class ExceptionEx05 {
	int[] ss;

	public ExceptionEx05() {
		ss = new int[3];
	}

	public void program() {
		for (int i = 0; i <= ss.length; i++) {
			System.out.println("for문의 시작 " + i + "번째");
			try {
				System.out.println(ss[i]);
			} catch (Exception e) {
//				e.printStackTrace(); --> 에러가 발생했을 때 메소드의 정보와 예외 메시지를 화면에 출력
//				e.getMessage();		 --> 발생한 예외클래스의 객체에 저장된 예외 메시지를 얻을 수 있음
				System.out.println("catch 영역");
				System.out.println("Exception 발생 " + e);
				return;
			} finally {
				System.out.println("finally 영역");
			}
			System.out.println("for문의 끝 " + i + "번째");
		}
	}
	

	public static void main(String[] args) {
		ExceptionEx05 ee = new ExceptionEx05();
		ee.program();

		System.out.println("프로그램의 끝");
	}
}
