package com.my;
/* ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ 2�� �������, 3�� �������, 2�� 3�� �������, 2�� 3�� ����� �ƴ����� �����ϴ� ���α׷��� ���Ͻÿ�
 * 
 */

import java.io.*;
public class Main03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���ڸ� �Է��ϼ��� ");
		int num = Integer.parseInt(br.readLine());
		System.out.println(num);
		
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2�� 3�� ��� �Դϴ�.");
		} else if (num % 2 == 0) {
			System.out.println("2�� ��� �Դϴ�.");
		} else if (num % 3 == 0) {
			System.out.println("3�� ��� �Դϴ�.");
		} else {
			System.out.println("2�� 3�� ����� �ƴմϴ�.");
		}
		
	}
}
