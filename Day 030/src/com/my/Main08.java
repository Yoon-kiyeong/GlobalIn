package com.my;

public class Main08 {
// �빮�� --> �ҹ���
	public char lower(char ch) {
		if (ch >= 'A' && ch <= 'z')
			return (char) (ch + 32);
		return ch;
	}

// �ҹ��� --> �빮��
	public char upper(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return (char) (ch - 32);
		return ch;
	}

// ���� --> ASCII �ڵ�
	public int ascii(char ch) {
		return (int) ch;
	}

// ASCII --> ����
	public char character(int ch) {
		return (char) ch;
	}

// ���� �빮��
	public boolean isUpper(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			return true;
		return false;
	}

// �ҹ��� ����
	public boolean isLower(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return true;
		return false;
	}

//���ĺ� ����
	public boolean isAlpha(char ch) {
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
			return true;
		return false;
	}

//���� ����
	public boolean isNumber(char ch) {
		if(ch >= '0' && ch <= '9')
			return true;
		return false;
	}
}
