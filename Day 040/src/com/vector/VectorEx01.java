package com.vector;

import java.util.*;

public class VectorEx01 {

	private static final String[] Colors = { "Black", "Yellow", "Green", "Blue", "Red", "YellowGreen" };

	public static void main(String[] args) {

		// ���� �ν��Ͻ� ����
		Vector<String> v = new Vector<String>();
		System.out.println(v.size()); // for�� �ڿ� ���� ���, ���� �ȿ� Colors�� �����Ͱ� ���� ���̱� ������ 0���� ��� ��
		for (String str : Colors)
			v.add(str);

		System.out.println(v.size()); // for���� ����, ���� �ȿ� Colors�� �����͸� �־��� ������ Colors�� ũ�� ��ŭ ����� ��

		System.out.println("��ü��� ");
		for (String str : Colors)
			System.out.print(str + " ");
		System.out.println();

		// �˻�
		String s = "Yellow";
		if (v.contains(s)) {
			int i = v.indexOf(s) + 1;
			System.out.println(s + " -> ��ġ : " + i);
		}

		// ����
		v.remove(0); // �ε����� �̿��Ͽ� �����ϴ� ��� //0��° �����͸� ����
		v.remove("Green"); // ���� ���� �����͸� �Է��Ͽ� �����ϴ� ���
		System.out.println("���� �� ");
		for (String str : v)		// Colors�� �ƴ� v�� �����ؾ� ������ ��
			System.out.print(str + " ");
		System.out.println();
	}
}
