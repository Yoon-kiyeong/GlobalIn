package com.mapex;

import java.util.*;

public class ScoreImpl implements Score {
	private Map<String, ScoreVO> map = new HashMap<String, ScoreVO>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("�ڷ��߰�...............");
		String hak;
		System.out.print("�й� �Է� : ");
		hak = sc.next();

//		ScoreVO temp = readScore(hak);
//		if (temp != null) {
//			System.out.println("�̹� ��ϵ� �й��Դϴ�");
//			return;
//		}

		if (map.containsKey(hak)) {
			System.out.println("�̹� ��ϵ� �й��Դϴ�");
			return;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
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

		map.put(hak, vo);
		System.out.println("�л� ���� �߰� �Ϸ�\n");
	}

	@Override
	public void update() {
		System.out.println("�ڷ� ����");

		String hak;
		System.out.print("������ �й� : ");
		hak = sc.next();

//		ScoreVO vo = readScore(hak);
//		if (vo == null) {
//			System.out.println("��ϵ� �ڷᰡ �����ϴ�");
//			return;
//		}

		if (!map.containsKey(hak)) {
			System.out.println("�̹� ��ϵ� �й��Դϴ�");
			return;
		}
		ScoreVO vo = map.get(hak);

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
		System.out.print("������ �й� �Է� ");
		hak = sc.next();

//		ScoreVO vo = readScore(hak);
//		if (vo == null) {
//			System.out.println("��ϵ� �ڷᰡ �����ϴ�");
//			return;
//		}

		map.remove(hak);
		System.out.println("���� �Ϸ�");
	}

	@Override
	public void listAll() {
		System.out.println("��ü ���");
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			System.out.println(vo);
		}
	}

	@Override
	public void searchHak() {
		System.out.println("�й� �˻�");
		String hak;
		System.out.print("�˻��� �й� �Է� ");
		hak = sc.next();

//		ScoreVO vo = readScore(hak);
//
//		if (vo != null) {
//			System.out.print(vo.getHak() + "\t");
//			System.out.print(vo.getName() + "\t");
//			System.out.print(vo.getBirth() + "\t");
//			System.out.print(vo.getKor() + "\t");
//			System.out.print(vo.getEng() + "\t");
//			System.out.print(vo.getMath() + "\t");
//		}
//		System.out.println();

		if (!map.containsKey(hak)) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�");
			return;
		}
		ScoreVO vo = map.get(hak);
		System.out.println(vo);

		System.out.println();
	}

	@Override
	public void searchName() {
		System.out.println("�̸� �˻�");
		String name;
		System.out.print("�˻��� �̸� : ");
		name = sc.next();

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);

			if (vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		System.out.println();
	}
}
