package com.lscore;

import java.util.*;

public class ScoreImpl implements Score {

	public List<ScoreVO> list = new ArrayList<ScoreVO>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("자료추가...............");
		String hak;
		System.out.print("학번 입력 : ");
		hak = sc.next();

		ScoreVO temp = readScore(hak);
		if (temp != null) {
			System.out.println("이미 등록된 학번입니다");
			return;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 입력 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어 점수 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 점수 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 점수 : ");
		vo.setMath(sc.nextInt());
		
		
		list.add(vo);
		System.out.println("학생 정보 추가 완료\n");
	}

	@Override
	public void update() {
		System.out.println("자료 수정");
		
		String hak;
		System.out.print("수정할 학번 : ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo == null) {
			System.out.println("등록된 자료가 없습니다");
			return;
		}
		
		System.out.print("이름 입력 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어 점수 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 점수 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 점수 : ");
		vo.setMath(sc.nextInt());
		
		System.out.println("학생정보 수정 완료!! \n");
	}

	@Override
	public void delete() {
		System.out.println("자료 삭제");
		String hak;
		System.out.print("삭제할 학번 입력 ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo == null) {
			System.out.println("등록된 자료가 없습니다");
			return;
		}
		
		list.remove(vo);
		System.out.println("삭제 완료");
	}

	@Override
	public void listAll() {
		System.out.println("전체 출력");
		Iterator<ScoreVO> it = list.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
	}

	@Override
	public void searchHak() {
		System.out.println("학번 검색");
		String hak;
		System.out.print("검색할 학번 입력 ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo != null) {
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
		System.out.println("이름 검색");
		String name;
		System.out.print("검색할 이름 : ");
		name = sc.next();
		
		for(ScoreVO vo : list)
			if(vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		System.out.println();
	}

	// 학번이 리스트에 있는지를 판정하는 메소드
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
