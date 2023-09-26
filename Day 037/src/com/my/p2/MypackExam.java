package com.my.p2;

import java.awt.*;
import java.awt.Event.*;

//패키지 내에 모든 클래스를 지정하는 방법
import com.my.*;

//각각 임포트 하는 방법
//import com.my.MypackOne;
//import com.my.MypackTwo;

public class MypackExam extends Frame{
	
	FileDialog fd = new FileDialog(this, "내꺼",FileDialog.SAVE);
	
	public MypackExam() {
		fd.setVisible(true);
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
	}
	
	public static void main(String[] args) {
//		MypackOne o1 = new MypackOne();
//		MypackTwo o2 = new MypackTwo();
		
		new MypackExam();
		Frame f = new Frame();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
