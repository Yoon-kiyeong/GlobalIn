package com.my;

public class Main04 {
	private int n;

	public Main04() {
		
	}
	
	public Main04(int nn) {
		n = nn;
	}

	public void write() {
		System.out.println("n : " + n);
	}

	public static void main(String[] args) {
		Main04 ma = new Main04(); //�⺻ �����ڰ� ��� ���� �߻�
		Main04 ma1 = new Main04(100);
		ma.write();
		ma1.write();
	}
}
