package com.AbsEx;

public class UseGame {
	public static void main(String[] args) {
		Unit unit[] = new Unit[3];
		
		unit[0] = new Marine();
		unit[1] = new SiegeTank();
		unit[2] = new Dropship();
		
		for(int i = 0 ; i < unit.length; i++) {
			System.out.println("----------------------");
			unit[i].move(100, 200);
			unit[i].message();
			System.out.println("----------------------");
		}
		
		
	}
}
