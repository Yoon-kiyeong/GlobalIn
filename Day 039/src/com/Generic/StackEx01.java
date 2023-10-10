package com.Generic;

import java.util.*;

public class StackEx01 {

	// ���� �迭 �� �ʱ�ȭ
	private static final String[] Colors = { "Black", "Yellow", "Green", "Blue", "Red", "YellowGreen" };

	public StackEx01() {
		// Stack Ŭ������ �ν��Ͻ� ����
		Stack<String> st = new Stack<String>();

		// ���ÿ� ������ ����
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
