package com.score;

import java.util.*;

public class ScoreImpl implements Score {

	private Vector<ScoreVO> list = new Vector<ScoreVO>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("�ڷ� �߰�............");
		String hak;
		System.out.print("�й� �Է� : ");
		hak = sc.next();

		ScoreVO temp = readScore(hak);

		if (temp != null) {
			System.out.println("�̹� ��ϵ� �й��Դϴ�");
			return;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("�̸� �Է� : ");
		vo.setName(sc.next());
		System.out.print("������� : ");
		vo.setBirth(sc.next());
		System.out.print("��������  : ");
		vo.setKor(sc.nextInt());
		System.out.print("��������  : ");
		vo.setEng(sc.nextInt());
		System.out.print("��������  : ");
		vo.setMath(sc.nextInt());

		list.add(vo);
		System.out.println("�л� ���� �߰� �Ϸ� \n");
	}

	@Override
	public void update() { // ����
		System.out.println("�ڷ� ����");
		String hak;
		System.out.println("������ �й� �Է� : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�");
			return;
		}

		// �й��� null�� �ƴ� ���
		// ������ ����

		System.out.print("�̸� �Է� : ");
		vo.setName(sc.next());
		System.out.print("������� : ");
		vo.setBirth(sc.next());
		System.out.print("���� ���� : ");
		vo.setKor(sc.nextInt());
		System.out.print("���� ���� : ");
		vo.setEng(sc.nextInt());
		System.out.print("���� ���� : ");
		vo.setMath(sc.nextInt());

		System.out.println("�л����� ���� �Ϸ�!! \n");
	}

	@Override
	public void delete() {
		System.out.println("�ڷ� ����");
		String hak;
		System.out.println("������ �й� �Է�");
		hak = sc.next();

		ScoreVO vo = readScore(hak); // readScore �޼ҵ��ǿ��� ������ vo�� ����
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�");
			return;
		}

		list.remove(vo); // ���� list���� vo���� �����ϴ� �޼ҵ�
		System.out.println("���� �Ϸ�");
	}

	@Override
	public void listAll() {
		System.out.println("��ü ���");
		Iterator<ScoreVO> it = list.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
	}

	@Override
	public void searchHak() {
		System.out.println("�й� �˻�");
		String hak;
		System.out.print("�˻��� �й� �Է� ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);

		if (vo != null) {
//			System.out.println(vo);
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getBirth() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
		}
		System.out.println();
	}

	@Override
	public void searchName() {
		System.out.println("�̸� �˻�");
		String name;
		System.out.print("�˻��� �̸� �Է� : ");
		name = sc.next();

		for (ScoreVO vo : list) {
			if (vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		System.out.println();
	}

	// �й��� ����Ʈ�� �ִ����� �����ϴ� �޼ҵ�
	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;

		for (ScoreVO temp : list) {
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo;
	}
}