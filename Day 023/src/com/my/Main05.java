package com.my;
/*
 * �� ����� �ϴ� ���� ���� �� ������ �����
 * ���� ö���� ����, ����, �� �� �ϳ��� ���ڿ��� �Է¹ް�
 * ���� ���������� �Է¹޴´�.
 * �Է¹��� ���ڿ��� ���Ͽ� ���� �̰������ �Ǻ��ϴ� ���α׷��� �����Ͻÿ�
 */
import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String chul;
		String yeong;
		
		System.out.print("ö�� : ");
		chul = sc.next();
		System.out.print("���� : ");
		yeong = sc.next();
		
		if((chul.equals("����") && yeong.equals("��")) || (chul.equals("����") && yeong.equals("����")) || (chul.equals("��") && yeong.equals("����"))) {
			System.out.println("ö���� �̰���ϴ�.");
		} else if((yeong.equals("����") && chul.equals("��")) || (yeong.equals("����") && chul.equals("����")) || (yeong.equals("��") && chul.equals("����"))) {
			System.out.println("���� �̰���ϴ�.");
		} else if((chul.equals("����") && yeong.equals("����")) || (chul.equals("����") && yeong.equals("����")) || (chul.equals("��") && yeong.equals("��"))) {
			System.out.println("�����ϴ�.");
		}
	}
}
