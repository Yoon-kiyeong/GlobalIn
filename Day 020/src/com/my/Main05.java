package com.my;

/* ����ȯ : casting
 * - ���� �Ǵ� ����� �ڷ����� �ٸ� �ڷ������� �ٲٴ� ���� �ǹ���
 * 
 * �ڵ� ����ȯ
 * - �� ū �ڷ������� ��ȯ(�ڵ�) short a, b;
 * - ������ �ս��� ����			    a = b = 10;
 * 								int c = a + b;
 * 
 * ���� ����ȯ
 * - �� ���� ������ �ڷ����� ��ȯ(���) int c = 0;
 * - ������ �ս��� ������			  short s = 10;
 * 							  c = s + (int)(3.5f);
 * 
 * boolean ���� ����ȯ�� �Ұ�����
 * ����ȯ�� ������ byte ������
 * 
 * 
 */
public class Main05 {
	public static void main(String[] args) {
		short a,b ;
		a = b = 10;
		a = 10; b = 20;
		int c = a + b;
		System.out.println(c);		
		
		///////////////////////////////////////
		int d = 0;
		short e = 10;
		d =(int)(e + 3.5f);		//���� ����ȯ
		System.out.println(d);
		
	}
}
