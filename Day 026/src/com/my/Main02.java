package com.my;
/* 배열이란
 * 크기와 성격이 같은 일련의 원소들이 모여 공동의 집합 구조를 갖는 자료의 집합체를 의미
 * 개별적으로 자료형을 부여하지 않고 하나의 이름을 가지고 처리할 목적으로 사용함
 * 
 * 자바에서의 배열은 다음과 같은 순서에 의해서 사용된다.
 * 배열선언 -> 배열에 메모리할당(저장할 공간) -> 배열의 오소(첨자)를 이용함
 * 
 * 형식 및 구조
 * 자료형[] 변수명;
 * 변수명 = new 자료형[요소의 크기];
 * 변수명[인덱스] = 값 저장;
 * 
 */
public class Main02 {
	public static void main(String[] args) {
		int arr[];	//배열 선언
		
		arr = new int[10];	//메모리 할당
		
		int v = 1;
		for(int i = 0; i <arr.length; i++) {
			arr[i] = v;
			v++;
		}
		
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%3d", arr[i]);
		}
	}
}
