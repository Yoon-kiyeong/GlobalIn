package com.my;

public class Main01 {
	
	public void argTest(String...n) {
		for(int i = 0; i < n.length; i++) {
			System.out.printf("n[d] :  %s\n",i, n[i]);
		}
	}
	
	public static void main(String[] args) {
		Main01 ma = new Main01();
		
		ma.argTest("Varargs", "test");
		ma.argTest("100","600","900","1000");
	}
}
