package com.my;

/* ���� ȣ��(Call by reference)
 * 
 * - �޼ҵ� ȣ��� �����Ϸ��� ���ڸ� ����(��ü) �ڷ����� ����� ��츦 �ǹ���
 * 	-�⺻�� �ڷ����� �ƴ� ��ü�� �迭���� ������ ���Ѵ�.
 * 
 */
public class Main03 {
	public void increase(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i]++;
		}
	}
	public static void main(String[] args) {
		int ref[] = {100,800,1000};
		Main03 ma = new Main03();
		ma.increase(ref);
		
		for(int i = 0; i < ref.length; i++) {
			System.out.println("Ref[" + i + "] : " + ref[i]);
		}
	}
}
