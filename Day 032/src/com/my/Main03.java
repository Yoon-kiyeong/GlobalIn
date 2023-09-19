package com.my;
/*
 * �뷡 �Ѱ��� ��Ÿ���� Song Ŭ������ �ۼ��ֿ�
 * 
 * �뷡�� ������ ��Ÿ���� title
 * ������ ��Ÿ���� artist
 * �뷡�� ��ǥ�� ������ ��Ÿ���� year
 * ������ ��Ÿ���� country
 * 
 * ���� �����ڿ� �޼ҵ� �ۼ�
 * 
 * ������ 2�� : �⺻ �����ڿ� �Ű������� ��� �ʵ带 �ʱ�ȭ�ϴ� ������
 * �뷡 ������ ����ϴ� show() �޼ҵ�
 * main() �޼ҵ忡���� 1978��, ������ ������ ABBA�� �θ� "Dancing Queen"�� Song ��ü�� �����ϰ� show()�� �̿��Ͽ� �뷡�� ������ ����Ͻÿ�
 */

class Song{
	private String title;
	private String artist;
	private int year;
	private String country;

	public Song() {}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		char quotes = '\u0022';
		System.out.println(year + "��, " + country + "������ " + artist + "�� �θ� " + quotes +title + quotes);
	}
	
}


public class Main03 {
	public static void main(String[] args) {
		Song s = new Song("Dansing Queen", "ABBA", 1978,"������");
		s.show();
		
	}
}
