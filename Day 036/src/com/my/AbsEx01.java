package com.my;

public abstract class AbsEx01 {
	// ��� ���� : ���, �Ϲ� ����, �Ϲ� �޼ҵ�, �߻� �޼ҵ� (�ݵ�� �ϳ��� �����ؾ� ��)
	int a = 100; // �Ϲ� ����
	final String str = "���� �ڹٸ� �����ϰ� ����մϴ�"; // final�� ���� �Ǿ����Ƿ� ���� ������ ����
	
	public String getStr() { // �Ϲ� �޼ҵ�
		return str;
	}
	
	//�߻� �޼ҵ�� ��ü�� ����.
	abstract public int getA();	// �߻� �޼ҵ�
	// {}(���̽�)�� ���� ������ ();�� ����
	
}
