package com.vector;

import java.util.*;

class MyData {
	public String name;
	public int age;

	public MyData() {
		name = "";
		age = 0;
	}

	public MyData(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class VectorEx02 {

	public static void main(String[] args) {
		Vector<MyData> v = new Vector<MyData>(); // 벡터 생성

		v.add(new MyData("가길동", 10)); // 생성자를 이용하여 벡터에 데이터 추가
		v.add(new MyData("나길동", 20)); 
		v.add(new MyData("다길동", 30)); 
		
		for(MyData ob : v)
			System.out.printf("이름 : %s, 나이 : %d%n", ob.name,ob.age);	//제너릭을 사용하여 객체를 사용함
	}

}
