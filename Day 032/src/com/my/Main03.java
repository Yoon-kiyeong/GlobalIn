package com.my;
/*
 * 노래 한곡을 나타내는 Song 클래스를 작성핫오
 * 
 * 노래의 제목을 나타내는 title
 * 가수를 나타내는 artist
 * 노래가 발표된 연도를 나타내는 year
 * 국적을 나타내는 country
 * 
 * 또한 생성자와 메소드 작성
 * 
 * 생성자 2개 : 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
 * 노래 정보를 출력하는 show() 메소드
 * main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을 Song 객체로 생성하고 show()를 이용하여 노래의 정보를 출력하시오
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
		System.out.println(year + "년, " + country + "국적의 " + artist + "가 부른 " + quotes +title + quotes);
	}
	
}


public class Main03 {
	public static void main(String[] args) {
		Song s = new Song("Dansing Queen", "ABBA", 1978,"스웨덴");
		s.show();
		
	}
}
