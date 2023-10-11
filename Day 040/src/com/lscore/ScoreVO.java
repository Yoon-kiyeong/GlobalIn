package com.lscore;


public class ScoreVO {
	private String name;
	private String birth;
	private String hak;
	private int kor;
	private int eng;
	private int math;
	private int sum;

	public String getName() {
		return name;
	}

	public String getBirth() {
		return birth;
	}

	public String getHak() {
		return hak;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		sum = kor + eng + math;
		return sum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		String str = String.format("%7s %10s %8s %5d%5d%5d%5d%6.1f", hak, name, birth, kor, eng, math, getSum(),
				(float) getSum() / 3);
		return str;
	}
	
}
