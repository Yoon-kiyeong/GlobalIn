package com.my;

public class Practice {
	public static void main(String[] args) {
		int numOfAppels = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfAppels / sizeOfBucket +(numOfAppels % sizeOfBucket > 0 ? 1 : 0);
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
		
		int num = 10;
		System.out.println(num > 0 ? "���" : (num < 0 ? "����" : 0));
		
		int fahrenheit = 100;
		float celcius = (int)((5 / 9f * (fahrenheit -32)) * 100 + 0.5) / 100f;
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("celcius : " + celcius);
	}
}
