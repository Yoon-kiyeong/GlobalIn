package Study.Class;

public class Taxi {
	int money;
	int taxiNumber;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public void take(int money) {
		this.money += 10000;
	}
	
	public void showInfo() {
		System.out.println("택시 요금은  " + money + "원 입니다.");
	}
}
