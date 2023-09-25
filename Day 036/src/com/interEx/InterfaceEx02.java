package com.interEx;

interface Ademo {
	public void write();
}

interface Bdemo {
	public void print();
}

//인터페이스는 2개 이상의 인터페이스를 상속할 수 있다.
class CdemoImpl implements Ademo, Bdemo {

	@Override
	public void print() {
		System.out.println("Bdemo의 인터페이스 메소드");
	}

	@Override
	public void write() {
		System.out.println("Ademo의 인터페이스 메소드");
	}

}

public class InterfaceEx02 {
	public static void main(String[] args) {
		CdemoImpl cd = new CdemoImpl();
		cd.print();
		cd.write();
		
		//업캐스팅
		Ademo a = new CdemoImpl();
		Bdemo b = new CdemoImpl();
		
		((Bdemo)a).print();
		a.write();
		
		b.print();
		((Ademo)b).write();	//다운 캐스팅
	}
}
