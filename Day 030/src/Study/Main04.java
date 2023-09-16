package Study;

//extends : 상속을 하겠다
public class Main04 extends Main03 {
	private String studentID;
	private int grade;
	private double GPA;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Main04(String name, int age, int weight, int height, String studentID, int grade, double gPA) {
		super(name, age, weight, height);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}

	public void show() {
		System.out.println("------------------------------");
		System.out.println("학생 이름 : " + getName());
		System.out.println("학생 나이 : " + getAge());
		System.out.println("학생 몸무게 : " + getHeight());
		System.out.println("학생 키 : " + getWeight());
		System.out.println("학번 : " + getStudentID());
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getGPA());
	}
}
