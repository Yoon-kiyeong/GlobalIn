package com.my;

/*
 * char[] �迭�� ���޹޾� printcharArry() �޼ҵ�� �迭 ���� ���� ('') ���ڸ� ','�� ��ġ�ϴ� replaceSpace()�޼ҵ带 �����Ͻÿ�
 * 
 * char c[] = {'T', 'h','i','s','a','p','e','n,'c','i','l'};
 * 
 * 
 */
public class Ex02 {
	public static void main(String[] args) {
		char c[] = {'T','h','i','s', ' ','i','s', ' ', 'a', ' ','p','e','n','c','i','i','.'};

		printcharArry(c);
		System.out.println();
		System.out.println(replaceSpace(c));
	}

	static void printcharArry(char c[]) {
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}

	static char[] replaceSpace(char[] c) {
		char[] arr = new char[c.length];

		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				arr[i] = ',';
			} else {
				arr[i] = c[i];
			}
		}
		return arr;
	}
	


}
