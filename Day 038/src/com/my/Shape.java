package com.my;

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}

/*
 * �׷��� ���� ���α׷��� �����Ͻÿ�
 * �߻� Ŭ���� Shape�� ����Ͽ� �� Ŭ���� Line, Rect, Circle �ڵ带 �ϼ��ϰ�,
 * ����, ����, ��� ����, ���� 4�ڱ� �޴��� �����ϴ� GraphicEditorŬ������ �ϼ��Ͻÿ�
 * ��, ������ Ŭ������ �и��Ͽ� ����
 */
