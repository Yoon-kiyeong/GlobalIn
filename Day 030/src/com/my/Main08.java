package com.my;

public class Main08 {
// 대문자 --> 소문자
	public char lower(char ch) {
		if (ch >= 'A' && ch <= 'z')
			return (char) (ch + 32);
		return ch;
	}

// 소문자 --> 대문자
	public char upper(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return (char) (ch - 32);
		return ch;
	}

// 문자 --> ASCII 코드
	public int ascii(char ch) {
		return (int) ch;
	}

// ASCII --> 문자
	public char character(int ch) {
		return (char) ch;
	}

// 검증 대문자
	public boolean isUpper(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			return true;
		return false;
	}

// 소문자 검증
	public boolean isLower(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return true;
		return false;
	}

//알파벳 검증
	public boolean isAlpha(char ch) {
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
			return true;
		return false;
	}

//숫자 검증
	public boolean isNumber(char ch) {
		if(ch >= '0' && ch <= '9')
			return true;
		return false;
	}
}
