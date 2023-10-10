package com.innerex;

import java.awt.*;
import java.awt.event.*;

public class WindowEventEx extends Frame{
	public WindowEventEx() {
		super("익명 클래스 이벤트");
		addWindowListener(new WindowAdapter() {//WindowAdapter 클래스를 이용
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {

	}
}
