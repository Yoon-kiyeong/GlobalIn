package com.setex;

import java.util.*;

public class HashTableTest {
	private static final String name[] = { "�̼���", "ȫ�浿", "�̱���", "���Ȱ�", "�ɽ���", "ȫ�浿" };
	private static final String tel[] = { "111-1111", "222-2222", "333-3333", "444-4444", "555-5555", "666-6666" };

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();

		// �ؽ� ���̺� Ű, ������ �Է�
		for (int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);

			// �ؽ� ���̺��� ���� Ű���� �̿��Ͽ� �˻�
			String str = ht.get("�̱���");
			if (str != null) {
				System.out.println("�̱����� ��ȭ��ȣ�� " + str + "�Դϴ�");
			}

			// Ű ���� �����ϴ��� �˻�
			if(ht.containsKey("�ɽ���")) {
				System.out.println("�ɽ��� ���� �����մϴ�");
			}
			
			// ������ ���� �����ϴ��� �˻�
			if(ht.containsValue("333-3333")) {
				System.out.println("333-3333 ���� �����մϴ�");
			}
			
			// Ű�� ����
			ht.remove("ȫ�浿");
			if(ht.containsKey("ȫ�浿")) {
				System.out.println("ȫ�浿 �ڷᰡ �����մϴ�");
			} else {
				System.out.println("ȫ�浿 �ڷᰡ �������� �ʽ��ϴ�.");
			}
		}
	}
}
