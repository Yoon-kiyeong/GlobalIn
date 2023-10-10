package com.Generic;

import java.util.*;

public class QueueEx01 {

	private static final String[] Colors = { "Black", "Yellow", "Green", "Blue", "Red", "YellowGreen" };
	
	public static void main(String[] args) {

		Queue<String> qu = new LinkedList<>();
	
		for(String str : Colors) {
			qu.offer(str);
		}
		
		while(qu.peek() != null) {
			System.out.println(qu.poll());
		}
	}
}
