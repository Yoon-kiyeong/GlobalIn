package com.Generic;

public class EnumTest1 {
	private Color myColor = Color.Red;

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public static void main(String[] args) {
		EnumTest1 a1 = new EnumTest1();
		a1.setMyColor(Color.Green);
		Color color = a1.getMyColor();
		
		switch(color) {
		case Red:
			System.out.println("Red");
			break;
		case Green:
			System.out.println("Green");
			break;
		case Blue:
			System.out.println("Blue");
			break;
		}
	}
}
