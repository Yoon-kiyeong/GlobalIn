package com.my;

public class Main extends Player{
	public static void main(String[] args) {
		Main main = new Main();
		main.Play("Stevie Ray Vaughan - Lenny");
		main.pause();
		main.stop();
		System.out.println();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.crying();
		cat.crying();
		System.out.println();
		
		final int number = 10;
		System.out.println(number);
	}

	@Override
	void Play(String songName) {
		System.out.println(songName + " ���� ����մϴ�");
	}

	@Override
	void pause() {
		System.out.println("���� �Ͻ������մϴ�");
		
	}

	@Override
	void stop() {
		System.out.println("���� �����մϴ�");
		
	}

}
