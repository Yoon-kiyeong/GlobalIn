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

	public void cancel() { // 예약 취소;
		name = null;
	}

	// 좌석이 에약되어 있는지를 판별하여 예약되어 있으면 true 반환
	// 에약되어 있지 않으면 false 반환

	public boolean isOccupied() {
		// 예약이 이름으로 예약되어 있어서 이름이 존재하는지 안하는지 판별
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
