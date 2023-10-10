package com.Generic;

import java.util.*;

public class StackEx01 {

	// 문자 배열 및 초기화
	private static final String[] Colors = { "Black", "Yellow", "Green", "Blue", "Red", "YellowGreen" };

	public StackEx01() {
		// Stack 클래스의 인스턴스 생성
		Stack<String> st = new Stack<String>();

		// 스택에 데이터 저장
		for(String color : Colors) 
			st.push(color);	
		
		popStack(st);
	}

	public void popStack(Stack<String> st) {
		System.out.print("pop : ");
		while(!st.empty()) {
			System.out.println("st.pop() : " + st.pop());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new StackEx01();
	}
}
