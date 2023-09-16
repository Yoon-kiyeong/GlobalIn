package Study;

public class Main06 extends Main03 {
	private String teacherID;
	private int monthSalary;
	private int workedYear;

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public int getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}

	public int getWorkedYear() {
		return workedYear;
	}

	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}

	public Main06(String name, int age, int weight, int height, String teacherID, int monthSalary, int workedYear) {
		super(name, age, weight, height);
		this.teacherID = teacherID;
		this.monthSalary = monthSalary;
		this.workedYear = workedYear;
	}
	
	public void shwo() {
		System.out.println("-----------------------");
		System.out.println("교사 이름 : " + getName());
		System.out.println("교사 나이 : " + getAge());
		System.out.println("교사 키 : " + getWeight());
		System.out.println("교사 몸무게 : " + getHeight());
		System.out.println("교직원 번호 : " + getTeacherID());
		System.out.println("교사 월급 : " + getMonthSalary());
		System.out.println("교사 연차 : " + getWorkedYear());
	}
}
