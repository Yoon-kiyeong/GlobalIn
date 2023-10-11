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
		Vector<MyData> v = new Vector<MyData>(); // ���� ����

		v.add(new MyData("���浿", 10)); // �����ڸ� �̿��Ͽ� ���Ϳ� ������ �߰�
		v.add(new MyData("���浿", 20)); 
		v.add(new MyData("�ٱ浿", 30)); 
		
		for(MyData ob : v)
			System.out.printf("�̸� : %s, ���� : %d%n", ob.name,ob.age);	//���ʸ��� ����Ͽ� ��ü�� �����
	}

}
