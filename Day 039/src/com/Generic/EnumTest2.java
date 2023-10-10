package com.Generic;

enum Operation {
	Plus {
		double eval(double x, double y) {
			return x + y;
		}
	},

	Minus {
		double eval(double x, double y) {
			return x - y;
		}
	},

	Multi {
		double eval(double x, double y) {
			return x * y;
		}
	},

	Divide {
		double eval(double x, double y) {
			return x / y;
		}
	};

	abstract double eval(double x, double y);
}

public class EnumTest2 {

	public static void main(String[] args) {
		double x = Double.parseDouble("10.5");
		double y = Double.parseDouble("20.0");
		
		System.out.println(Operation.Plus.eval(x, y));
		System.out.println(Operation.Minus.eval(x, y));
		System.out.println(Operation.Multi.eval(x, y));
		System.out.println(Operation.Divide.eval(x, y));
		System.out.println();
		
		for(Operation op : Operation.values())
			System.out.printf("%.2f %s %.2f = %.2f %n",x, op, y, op.eval(x, y));
	}
}
