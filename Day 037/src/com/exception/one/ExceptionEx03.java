package com.exception.one;


/* RuntimeException�� �� ���� Exception
 * - Runtime : ������ �� ������ �߻���Ű�� ����
 * 			       ���α׷��� �����ϴ� ���߿� ������ �߻�
 * 
 * ���ܸ� ���������� �߻���Ű�� ���
 * 	throw ������ �߻���Ŵ
 * ���� : throw new �߻���ų ���� ��ü�� ������ / throw ���� ��ü
 * 
 * 
 * 
 * 
 * 
 */

public class ExceptionEx03 {
	public static void main(String[] args) throws Exception {
		Exception ee = new Exception();
		throw ee;
//		throw new Exception();
	}
}
