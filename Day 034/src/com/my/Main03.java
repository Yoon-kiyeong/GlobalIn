package com.my;

import java.util.Scanner;

/*	�ΰ��� ���� �Է�
 * ������
 * 
 * ���� ó��
 * if, switch ~ case
 * 
 * ���
 * �Է�, ���, ����(double) : �޼ҵ�
 * 
 */

class SuperEx03 { // �θ�
	protected int num1, num2;
	protected String oper;

	public void write(double result) {
		System.out.println(num1 + oper + num2 + " = " + result);
	}

	public SuperEx03() {

	}

}

public class Main03 extends SuperEx03 {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� [3,4] ");
		String str = sc.nextLine();
		str = str.replaceAll("\s", "");

		System.out.print("������ : ");
		oper = sc.nextLine();
		oper = oper.trim(); // ���ڿ� ������ ������ �����ִ� �޼ҵ�

		String su[] = str.split(",");
		num1 = Integer.parseInt(su[0]);
		num2 = Integer.parseInt(su[1]);
	}

	public double calc() {
		double result = 0;

		if(oper.equals("+")) {
			result = (double)num1 + num2;
		} else if (oper.equals("-")) {
			result = (double)num1 - num2;
		} else if (oper.equals("*")) {
			result = (double)num1 * num2;
		} else if (oper.equals("/")) {
			result = (double)num1 / num2;
		}
		return result;

	}

	public static void main(String[] args) {
		Main03 ma = new Main03();
		ma.input();
		double result = ma.calc();
		ma.write(result);
	}
}