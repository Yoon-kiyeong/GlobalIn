package com.my;

/*	추상 클래스 간의 상속관계
 *  
 *  - 추상 클래스 간의 상속이 가능하다.
 *  - 일반 클래스 간의 상속과 유사하지만, 추상 클래스간의 삭송에서는 상속받은 추상메소드들을 반드시 재정의 할 필요는 없다.
 *  - 추상 메소드는 상속받아 두었다가 일반 클래스와의 상속관계가 이루어질 때 재정의하지 못한 추상 메소드를 재정의 하면 됨
 *  
 * 
 */

public abstract class AbsEx02 extends AbsEx01{
	
	@Override
	public int getA() {
		return a;
	}
	
	
	public abstract String getStr();
}
