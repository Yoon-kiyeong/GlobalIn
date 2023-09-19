package com.my;

/*
 * this와 this()
 * 
 * this
 * 	- 특정 객채 내에서 자신이 생성되었을 때의 주소값 변수를 의미함
 * 	- 객체의 주소는 객체가 생성되기 전까지는 모르기 때문에 객체 생성 후 자신의 주소 대체됨
 * 
 * this()
 *  - 현재 객체의 생성자 함수를 의미함
 *  - 생성자 안에서 오버로딩 된 다른 생성자를 호출할 경우 this()라는 키워드로 호출함
 */
public class Main05 {
	String name;
	String Serial;
	String tel;

	public Main05() {
		this.name = "윤기영";
		this.Serial = "000000-0000000";
		this.tel = "010-0000-0000";
	}

	public Main05(String name) { // 기본 생성자
		this();
		this.name = name;
	}

	public Main05(String name, String Serial) {
		this(name);
		this.Serial = Serial;
	}

	public Main05(String name, String Serial, String tel) {
		this(name);
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerial() {
		return Serial;
	}

	public void setSerial(String serial) {
		Serial = serial;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public static void main(String[] args) {
		Main05 ma = new Main05();
		System.out.println("이름 : " + ma.getName());
		System.out.println("주민번호 : " + ma.getSerial());
		System.out.println("전화번호 : " + ma.getTel());
	}
}
