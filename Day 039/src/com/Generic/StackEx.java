package com.Generic;

import java.util.*;

/*
 * �ڷ�
 * 	���� ����κ��� �ܼ��� �����̳� ������ ���� ������ ����̳� ������ ���� �Ǵ� �� ������ ������ �ڷ��� ��
 * 
 * �ڷᱸ��
 * 	�ڷ�ó���� ���� �ڷ��� ǥ��, ����, ����, ���� �� �̿뿡 ���� ��� ���� ������ �����Ͽ� ���α׷��� ����ϰ� ��ǻ�Ϳ� ���� ó���� �� ������ �ڷ��� ǥ��, ����, ���� �� ó���� ���� �˰����� �ۼ� �� ���ð� �̿����� �˾ƺ��� ���� �ǹ���
 * 
 * �÷��� �����ӿ�ũ
 *  �÷����� ǥ���� ������ ���� ���ϵ� ��Ű���ķ� �÷��� �����ӿ�ũ�� ����
 *  
 *  ��������� ������
 *  1. �������̽�
 *  	- �⺻������ �÷��ǿ� �ʿ��� ������ ���� ����� ������
 *  	ex) list : �߰�, ����, �˻� ����� ����
 *  2. ����
 *  	- �������̽��� ������ Ŭ�����̰� �� �÷����� ���� � �ڷᱸ���� �̿��Ͽ� ǥ���ߴµ� ���� �÷����� ������ �ٸ���.
 *  3. �˰���
 *  	-�� �÷��Ǹ��� �����ϰ� ����� �� �ִ� �˰����� �ٸ���.
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
		
		// ���ÿ� ������ ����
		myStack.push(str1);
		myStack.push(str2);
		myStack.push(str3);
		myStack.push(str4);

		String result1 = myStack.peek();
		System.out.println("result1 : " + result1);
		// myStack�̶�� ���ÿ� �����Ͱ� �ִ��� ������ ����
		while(!myStack.isEmpty()) {
			// pop() : ���� �� ���� ��ü ��ȯ�ϴ� �޼ҵ� �� �����ϴ� �޼ҵ�
			result1 = myStack.pop();
			System.out.println("while result1 : " + result1);
		}
		
		// Last In First Out(���Լ���) LIFO => �������� �� �����Ͱ� ���� ���´�
	}
}
