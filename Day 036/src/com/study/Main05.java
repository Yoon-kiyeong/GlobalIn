package com.study;

public class Main05 {
	public static void main(String[] args) {
		Hero[] heros = new Hero[3];
		heros[0] = new Warrior("����");
		heros[1] = new Gunman("�̽� ����");
		heros[2] = new Wizard("����");

		for (int i = 0; i < heros.length; i++) {
			heros[i].attack();

			if (heros[i] instanceof Warrior) {
				// ������ ���� ����
				Warrior temp = (Warrior) heros[i];
				temp.Skill();
			} else if (heros[i] instanceof Gunman) {
				// �����̶�� ���� ����
				Gunman temp = (Gunman) heros[i];
				temp.BulletTime();
			} else if (heros[i] instanceof Wizard) {
				// �������� ���� ����
				Wizard temp = (Wizard) heros[i];
				temp.Skill();
			}
		}

	}
}
