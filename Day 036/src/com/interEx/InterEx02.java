package com.interEx;

public class InterEx02 implements Inter3 {
	int A = 100;
	
	public static void main(String[] args) {
		InterEx02 ie = new InterEx02();
		
//		Inter1 it1 = new Inter1();
//		Inter1 it1 = new InterEx02();
//		Inter2 it2 = new InterEx02();
//		Inter3 it3 = new InterEx02();
		
		Inter1 it1 = ie;
		Inter2 it2 = ie;
		Inter3 it3 = ie;
		System.out.println(it1.getA());
		System.out.println(it3.getA());
		System.out.println(it3.getData());
	}
	
	@Override
	public int getA() {
		return A;
	}
	
	@Override
	public int getData() {
		return A + 10;
	}
}