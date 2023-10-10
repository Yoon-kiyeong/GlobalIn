package com.vectorex;

import java.util.*;

class MyVector extends Vector {

	public MyVector() {
		super(1, 1);
	}

	public void addInt(int i) {
		addElement(i);
	}

	public void addFloat(float f) {
		addElement(f);
	}

	public void addString(String s) {
		addElement(s);
	}

	public void write() {
		Object o;
		int length = size();
		
		for(int i = 0; i <length; i++) {
			o = elementAt(i);
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[])o));
			} else {
				System.out.println(o.toString());
			}
		}
	}
	
	public void addChar(char a[]) {
		addElement(a);
	}
}

public class VectorEx02 {

	public static void main(String[] args) {
		MyVector v = new MyVector();
		
		int digit = 5;
		float real = 3.14f;
		char letters[] = {'a','b','c','d'};
		String s = new String("Hi there");
		v.addInt(digit);
		v.addFloat(real);
		v.addChar(letters);
		v.addString(s);
		v.write();
	
	}
}
