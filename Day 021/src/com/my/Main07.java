package com.my;
// ���迬���� : ==, !=, < , >, <=. >=
public class Main07 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean c = a > b;
		System.out.println("a > b : " + c);
		c = (a != b);
		System.out.println("a != b : " + c);
		
		/* �� ������
			&& || : ���� �͸����� �Ǵ� �����̸� �Ǵ���
			& | : �� ���� ���� ������ �Ǵ���
		 */
 		boolean q;
		boolean w;
		
		if((q = 4 > 3) | (w = 5 > 7)) {
			System.out.println(q);
			System.out.println(w);
		}
		
		/* ���� ������
		 * - ������ ? ��1(������ true�� ���) : ��2(������ false�� ���)
		 * - ������ ���� ��� �� 1�� ����
		 * - ������ ������ ��� �� 2�� ����
		 */
		
		int e = 20, r = 30, max;
		max = e > r? e++ : r++;
		System.out.println("max : " + max);
		System.out.println("e : " + e);
		System.out.println("r : " + r);
	}
}
