package com.my.p2;

import java.awt.*;
import java.awt.Event.*;

//��Ű�� ���� ��� Ŭ������ �����ϴ� ���
import com.my.*;

//���� ����Ʈ �ϴ� ���
//import com.my.MypackOne;
//import com.my.MypackTwo;

public class MypackExam extends Frame{
	
	FileDialog fd = new FileDialog(this, "����",FileDialog.SAVE);
	
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
