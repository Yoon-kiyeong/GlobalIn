package com.innerex;

import java.awt.*;
import java.awt.event.*;

public class WindowEventEx extends Frame{
	public WindowEventEx() {
		super("�͸� Ŭ���� �̺�Ʈ");
		addWindowListener(new WindowAdapter() {//WindowAdapter Ŭ������ �̿�
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
