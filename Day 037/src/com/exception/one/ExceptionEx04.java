package com.exception.one;

/*	���� catch��
 * - ���� catch�������� ����Ŭ���� -> ���� Ŭ���� ������ ����ó���� ��(���⼺)
 */

public class ExceptionEx04 {
	public static void main(String[] args) {
			System.out.println(1);
			System.out.println(2);
			try {
				System.out.println(3);
				System.out.println(10 / 0);
			} catch(ArithmeticException ae) {
				if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
			} catch(Exception e) {
				System.out.println("Exception");
			}		
	}
}
