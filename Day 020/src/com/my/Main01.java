package com.my;

// 자바 프로그램을 시작할 때, class, main()을 기본적으로 입력해야 한다. ////
/* (*****) 클래스의 이름과 파일명은 무조건 동일해야 한다.
 
*/

public class Main01 { // 클래스명은 첫 글자가 대문자이어야 한다.
	// 실행 클래스 : main()함수를 포함하고 있는 클래스를 실행 클래스라고 함
	private int a = 10;
	public static void main(String[] args) {
		// 코딩 영역
		Main01 aa = new Main01();
		int a = 20;
		System.out.println(aa.a);
		System.out.println(a);
		
		System.out.println(a);
		// System.out.println(a);
		// 출력스트림을 통해서 프린트메소드를 이용하며 출력함
	}
}
