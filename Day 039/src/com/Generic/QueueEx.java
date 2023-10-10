package com.Generic;

/*
 * ť(Queue)
 * - ť�� FIFO(First In First Out) ������� �̷������
 * - ť �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�
 * 
 * - ť�� ������ �߰�
 * 		offer(E q)
 * 
 * - ť�� ����� ������ ����
 * 	poll(), remove()
 * 
 */

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		//Queue �ν��Ͻ� ����
		//Queue q = new Queue();
		Queue<Object> myQueue = new LinkedList<>();
		String str1 = "1-aaa";
		String str2 = "2-aaa";
		String str3 = "3-aaa";
		String str4 = "4-aaa";
		
		//Queue�� ������ �߰�
		myQueue.offer(str1);
		myQueue.offer(str2);
		myQueue.offer(str3);
		myQueue.offer(str4);
		
		String val;
//		while(!myQueue.isEmpty()) {	//ù��° ���
//		while(myQueue.peek() != null) {	//�ι�° ���
		while(true) {	//����° ���
			val = (String)myQueue.poll();
			if(val == null)
				break;
			else
			System.out.println("�� : " + val);
		}
	}
}
