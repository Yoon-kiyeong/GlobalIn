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
	public String toString() { // return 객체가 가지고 있는 메소드

		if (name == null)
			return null;

		String str = String.format("%s, 총점: %d ", name, kor + eng + mat);

		return str;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		Test ob = null;

		if (obj instanceof Test)
			ob = (Test) obj; // 다운캐스팅 (DownCasting)
		else
			return flag;

		if (this.name.equals(ob.name) && hak.equals(ob.hak))
			flag = true;
		return flag;

	}
}

public class Main01 {
	public static void main(String[] args) {
		Test ob1 = new Test("1111","가길동",60,80,90);
		Test ob2 = new Test("2222","나길동",100,100,100);
		System.out.println(ob1);
		System.out.println(ob2);
		
		if(ob1.equals(ob2)) {
			System.out.println("ob1과 ob2는 동일인물입니단");
		} else {
			System.out.println("ob1과 ob2는 다른 인물입니다");
		}
	}
}
