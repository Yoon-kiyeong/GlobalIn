package com.my;

import java.io.*;
public class Main05 {
	public static void main(String[] args) throws IOException{
//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(is);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ڿ� �Է� : ");
		String s = br.readLine();
		
		System.out.println("�Է¹��� ���ڿ� : " + s);
		
		//���ڿ�(�� �ڸ� �̻� �Է� �ޱ�)
		System.out.print("���� �Է� : ");
		// "\r" = 13
		// jvm�� ����� ����ī�� �ϳ��� �Է����� �޾Ƶ��̱� ����
		
		int num = Integer.parseInt(br.readLine());
		System.out.println("�Է¹��� ���� : " + num);
	}
}
