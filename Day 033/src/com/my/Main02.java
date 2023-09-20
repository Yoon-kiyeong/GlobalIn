package com.my;
/*
 * Dictionary Ŭ������ �ִ�. �Ʒ��� �������� ���� ������ �� �ֵ��� Ŭ������ kor2Eng()�޼ҵ�� DicApp Ŭ������ �����Ͻÿ�
 * 
 * ������
 * 
 * �ѿ� �ܾ� �˻� ���α׷��Դϴ�
 * �ѱ� �ܾ� : ���
 * ����� hope
 * �ѱ� �ܾ� : �ư�
 * �ư��� ���� ������ �����ϴ�
 * �ѱ� �ܾ� : �Ʊ�
 * �Ʊ�� baby
 * �ѱ� �ܾ�: �׸��� �Է��ϸ� ���α׷� ����
 */

import java.util.Scanner;

class Dictionary {
	private static String kor[] = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String eng[] = { "love", "baby", "money", "future", "hope" };

	public static String[] getKor() {
		return kor;
	}

	public static void setKor(String[] kor) {
		Dictionary.kor = kor;
	}

	public static String[] getEng() {
		return eng;
	}

	public static void setEng(String[] eng) {
		Dictionary.eng = eng;
	}

	public Dictionary(String kor[], String eng[]) {
		this.kor = kor;
		this.eng = eng;
	}

	public Dictionary() {
	}

	Scanner sc = new Scanner(System.in);

	public static String kor2Eng(String word) {
		int cnt = 0;
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				return eng[cnt];
			}
			cnt++;
		}
		return null;
	}

	public void run() {
		System.out.println("�ѱ� �ܾ� �˻� ���α׷��Դϴ�.");
		while (true) {
			System.out.print("�ѱ� �ܾ� : ");
			String word = sc.next();
			if (word.equals("�׸�")) {
				break;
			}
			if (kor2Eng(word) == null) {
				System.out.println(word + "�� �����ϴ�");
			} else {
				System.out.println(word + "��(��) " + kor2Eng(word));
			}
		}
	}
}

public class Main02 {
	public static void main(String[] args) {
		Dictionary d = new Dictionary();
		d.run();
	}

}
