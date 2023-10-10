package com.Generic;

import java.util.*;

/*
 * 자료
 * 	현실 세계로부터 단순한 관찰이나 측정을 통해 수집된 사실이나 개념의 값들 또는 그 값들의 집합을 자료라고 함
 * 
 * 자료구조
 * 	자료처리를 위한 자료의 표현, 저장, 관계, 관리 및 이용에 관한 방법 등의 개념을 이해하여 프로그램에 사용하고 컴퓨터에 의해 처리될 때 적절한 자료의 표현, 구성, 저장 및 처리를 위한 알고리즘이 작성 및 선택과 이용방법을 알아보는 것을 의미함
 * 
 * 컬렉션 프레임워크
 *  컬렉션이 표현과 좆가을 위한 통일된 아키텍쳐로 컬렉션 프레임워크를 구성
 *  
 *  구성요소의 세가지
 *  1. 인터페이스
 *  	- 기본적으로 컬렉션에 필요한 데이터 관리 기능을 제공함
 *  	ex) list : 추가, 삭제, 검색 기능을 제공
 *  2. 구현
 *  	- 인터페이스를 구현한 클래스이고 각 컬렉션을 실제 어떤 자료구조를 이용하여 표현했는데 따라 컬렉션의 종류가 다르다.
 *  3. 알고리즘
 *  	-각 컬렉션마다 유일하게 사용할 수 있는 알고리즘이 다르다.
 *  
 */

public class StackEx {
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<>();
		
		//add(), push();
		String str1 = "1-aaa";
		String str2 = "2-aaa";
		String str3 = "3-aaa";
		String str4 = "4-aaa";
		
		// 스택에 데이터 저장
		myStack.push(str1);
		myStack.push(str2);
		myStack.push(str3);
		myStack.push(str4);

		String result1 = myStack.peek();
		System.out.println("result1 : " + result1);
		// myStack이라는 스택에 데이터가 있는지 없는지 판정
		while(!myStack.isEmpty()) {
			// pop() : 스택 맨 위의 객체 반환하는 메소드 또 제거하는 메소드
			result1 = myStack.pop();
			System.out.println("while result1 : " + result1);
		}
		
		// Last In First Out(후입선출) LIFO => 마지막에 들어간 데이터가 먼저 나온다
	}
}
