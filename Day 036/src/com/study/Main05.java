package com.study;

public class Main05 {
	public static void main(String[] args) {
		Hero[] heros = new Hero[3];
		heros[0] = new Warrior("가렌");
		heros[1] = new Gunman("미스 포츈");
		heros[2] = new Wizard("럭스");

		for (int i = 0; i < heros.length; i++) {
			heros[i].attack();

			if (heros[i] instanceof Warrior) {
				// 전사라면 이쪽 실행
				Warrior temp = (Warrior) heros[i];
				temp.Skill();
			} else if (heros[i] instanceof Gunman) {
				// 총잡이라면 이쪽 실행
				Gunman temp = (Gunman) heros[i];
				temp.BulletTime();
			} else if (heros[i] instanceof Wizard) {
				// 마법사라면 이쪽 실행
				Wizard temp = (Wizard) heros[i];
				temp.Skill();
			}
		}

	}
}
