package com.Generic;

/*
 * 큐(Queue)
 * - 큐는 FIFO(First In First Out) 방식으로 이루어진다
 * - 큐 인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다
 * 
 * - 큐에 데이터 추가
 * 		offer(E q)
 * 
 * - 큐에 저장된 데이터 삭제
 * 	poll(), remove()
 * 
 */

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		//Queue 인스턴스 생성
		//Queue q = new Queue();
		Queue<Object> myQueue = new LinkedList<>();
		String str1 = "1-aaa";
		String str2 = "2-aaa";
		String str3 = "3-aaa";
		String str4 = "4-aaa";
		
		//Queue에 데이터 추가
		myQueue.offer(str1);
		myQueue.offer(str2);
		myQueue.offer(str3);
		myQueue.offer(str4);
		
		String val;
//		while(!myQueue.isEmpty()) {	//첫번째 방법
//		while(myQueue.peek() != null) {	//두번째 방법
		while(true) {	//세번째 방법
			val = (String)myQueue.poll();
			if(val == null)
				break;
			else
			System.out.println("값 : " + val);
		}
	}
}
