package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
	
	public static String getString(String str) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(str + "");
		String imsi = br.readLine();
		return imsi;
	}
	public static void main(String[] args) throws IOException{
		String name = getString("�̸� �Է� : ");
		System.out.print(name + "�� �ȳ��ϼ���");
	}
}
