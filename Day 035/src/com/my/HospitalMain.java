package com.my;

public class HospitalMain {
	public static void main(String[] args) {
		Hospital h = new Hospital();
		
		Animal animal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal Tiger = new Tiger();
		
		h.inject(dog);
		h.inject(cat);
		h.inject(Tiger);
		
	}
}
