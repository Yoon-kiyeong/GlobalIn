package com.my;

/* ȭ�鿡 ������ ���
 * System.out : ����ϴ� ��Ʈ�� (console) : �����
 * System.in : �Է��ϴ� ��Ʈ�� (Ű����)
 * - ǥ�� �����
*/
public class Main06 {
	public static void main(String[] args) {
		System.out.println(); // ������ ����ϰ� ���� �ٲ۴�
		System.out.print(55); // ��ȣ �ȿ� �ִ� ������ ����ϰ� ���� �ٲ��� �ʴ´�.
		System.out.printf(""); // ����ϰ��� �ϴ� ������ �����ؾ� �Ѵ�.(����)
		System.out.println();
		
		int a, b;
		float c;
		a = 10; b = 20; c = b / a;
		System.out.printf("%d + %d = %d%n",a ,b, a + b);
		System.out.printf("%d + %d = %.1f%n",a ,b, c);
		
		char ch = 'A';
		String s = "ABCDE";
		System.out.println(ch);
		System.out.printf("%c%n", ch);
		System.out.printf("%s", s);
		
		
	}
}
