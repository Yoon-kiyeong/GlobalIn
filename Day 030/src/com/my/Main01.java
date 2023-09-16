package com.my;

public class Main01 {
	public int sum(int i, int j) { // sum이라는 함수이며, 인자값은 i,j라는 변수를 통해서 전달받는다.
		System.out.println(i + j);
		return i + j; // 두개의 인자값을 가지고 수식을 수행 후 결괏값 리턴
		// sum이라는 메소드를 호출한 곳으로 결과를 리턴함
	}

	public void add(int i, int j) { // 인스턴스 메소드
		// add라는 함수이며, 인자값은 i,j라는 변수를 통해서 전달 받는다.
		System.out.println(i + j); // 두 개의 인자값을 가지고 수식을 수행 후 결과값 리턴
		// add라는 메소드를 호출한 곳으로 결과를 리턴함
	}

	public static void min(int i, int j) {
		int q = i - j;
		System.out.println(q);
	}
	
	public int mul(int i, int j) {
		return i * j;
	}

	public static void main(String[] args) {
		Main01 ma = new Main01(); // 객체 생성
		//메소드 호출
		ma.sum(10, 20);
		ma.add(20, 30);
		min(30, 20);
		System.out.println(ma.mul(3, 2));
	}
}
