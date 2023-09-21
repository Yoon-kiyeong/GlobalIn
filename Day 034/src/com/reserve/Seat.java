package com.reserve;

public class Seat {
	private String name;

	public String getName() {
		return name;
	}

	public Seat() {
		name = null;
	}

	public void reserve(String name) {
		this.name = name;
	}

	public void cancel() { // ���� ���;
		name = null;
	}

	// �¼��� ����Ǿ� �ִ����� �Ǻ��Ͽ� ����Ǿ� ������ true ��ȯ
	// ����Ǿ� ���� ������ false ��ȯ

	public boolean isOccupied() {
		// ������ �̸����� ����Ǿ� �־ �̸��� �����ϴ��� ���ϴ��� �Ǻ�
		if (name == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean match(String name) {
		return name.equals(this.name);
	}
}
