package com.exception.one;

public class ExceptionEx05 {
	int[] ss;

	public ExceptionEx05() {
		ss = new int[3];
	}

	public void program() {
		for (int i = 0; i <= ss.length; i++) {
			System.out.println("for���� ���� " + i + "��°");
			try {
				System.out.println(ss[i]);
			} catch (Exception e) {
//				e.printStackTrace(); --> ������ �߻����� �� �޼ҵ��� ������ ���� �޽����� ȭ�鿡 ���
//				e.getMessage();		 --> �߻��� ����Ŭ������ ��ü�� ����� ���� �޽����� ���� �� ����
				System.out.println("catch ����");
				System.out.println("Exception �߻� " + e);
				return;
			} finally {
				System.out.println("finally ����");
			}
			System.out.println("for���� �� " + i + "��°");
		}
	}
	

	public static void main(String[] args) {
		ExceptionEx05 ee = new ExceptionEx05();
		ee.program();

		System.out.println("���α׷��� ��");
	}
}
