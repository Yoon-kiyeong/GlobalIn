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
		System.out.println("���� �̸� : " + getName());
		System.out.println("���� ���� : " + getAge());
		System.out.println("���� Ű : " + getWeight());
		System.out.println("���� ������ : " + getHeight());
		System.out.println("������ ��ȣ : " + getTeacherID());
		System.out.println("���� ���� : " + getMonthSalary());
		System.out.println("���� ���� : " + getWorkedYear());
	}
}
