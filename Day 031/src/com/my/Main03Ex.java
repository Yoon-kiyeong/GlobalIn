package com.my;

public class Main03Ex {
	public static void main(String[] args) {
		Main03 ma1 = new Main03();
		Main03 ma2 = new Main03("�ɽ�");
		Main03 ma3 = new Main03("������", 36);
		Main03 ma4 = new Main03(29, "��⿵");
		
		System.out.println(ma1.getName() + ", " + ma1.getAge());
		System.out.println(ma2.getName() + ", " + ma2.getAge());
		System.out.println(ma3.getName() + ", " + ma3.getAge());
		System.out.println(ma4.getName() + ", " + ma4.getAge());
	}
}
