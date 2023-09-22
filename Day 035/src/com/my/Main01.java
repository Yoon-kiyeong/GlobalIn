package com.my;

class Test {
	private String hak, name;
	private int kor, eng, mat;

	public Test() {
	}

	public Test(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public void set(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	@Override
	public String toString() { // return ��ü�� ������ �ִ� �޼ҵ�

		if (name == null)
			return null;

		String str = String.format("%s, ����: %d ", name, kor + eng + mat);

		return str;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		Test ob = null;

		if (obj instanceof Test)
			ob = (Test) obj; // �ٿ�ĳ���� (DownCasting)
		else
			return flag;

		if (this.name.equals(ob.name) && hak.equals(ob.hak))
			flag = true;
		return flag;

	}
}

public class Main01 {
	public static void main(String[] args) {
		Test ob1 = new Test("1111","���浿",60,80,90);
		Test ob2 = new Test("2222","���浿",100,100,100);
		System.out.println(ob1);
		System.out.println(ob2);
		
		if(ob1.equals(ob2)) {
			System.out.println("ob1�� ob2�� �����ι��Դϴ�");
		} else {
			System.out.println("ob1�� ob2�� �ٸ� �ι��Դϴ�");
		}
	}
}
