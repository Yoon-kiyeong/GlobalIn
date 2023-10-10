package com.Generic;

/*
 * ������(Enum)
 * 
 * ���� : ������ �ڵ������� �����Ͽ� ������� ����� ���̴� �������̴�
 * 		�ڹٿ����� �������� ����� �ϳ��� ��ü�� �ν��ϰ� �������� �����ü���� �� ���� ��Ƶ� �ϳ��� ��ü��� �� �� �ִ�.
 * ����
 * 	[����������] enum [�������̸�] {
 * 	���1, ���2, ���3, ...
 * }
 * 
 */
public class EnumEx01 {
	public enum Lesson {
		JAVA, XML, JSP, Spring
	}

	public static void main(String[] args) {
		Lesson l = Lesson.JSP;
		System.out.println(l);
		System.out.println(Lesson.Spring);
	}
}
