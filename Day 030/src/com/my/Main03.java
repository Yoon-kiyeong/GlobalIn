package com.my;

/* 참조 호출(Call by reference)
 * 
 * - 메소드 호출시 전달하려는 인자를 참조(객체) 자료형을 사용할 경우를 의미함
 * 	-기본형 자료형이 아닌 객체나 배열들이 참조에 속한다.
 * 
 */
public class Main03 {
	public void increase(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i]++;
		}
	}
	public static void main(String[] args) {
		int ref[] = {100,800,1000};
		Main03 ma = new Main03();
		ma.increase(ref);
		
		for(int i = 0; i < ref.length; i++) {
			System.out.println("Ref[" + i + "] : " + ref[i]);
		}
	}
}
