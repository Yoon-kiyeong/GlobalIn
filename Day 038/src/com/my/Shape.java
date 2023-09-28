package com.my;

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}

/*
 * 그래픽 편집 프로그램을 구현하시오
 * 추상 클래스 Shape를 상속하여 각 클래스 Line, Rect, Circle 코드를 완성하고,
 * 삽입, 삭제, 모두 보기, 종류 4자기 메뉴를 구성하는 GraphicEditor클래스를 완성하시오
 * 단, 각각의 클래스를 분리하여 구현
 */
