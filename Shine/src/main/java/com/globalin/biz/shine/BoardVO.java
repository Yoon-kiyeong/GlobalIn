package com.globalin.biz.shine;

import java.util.Date;

// VO(Value Object) : (비지니스:model -> vo, dao)레이어와 (프레젠테이션: 화면 레이아웃--> jsp)레이어 사이에 관련된 데이터를 한꺼번에 주고받을 때 사용하는 클래스

public class BoardVO {
	private int seq;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int cnt;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {		
		return  "BoardVO [seq = "+ seq +", title = "+ title +", writer = "+ writer +", content = "+ content +", regDate = "+ regDate +", cnt = "+ cnt +"]";
	}
}
