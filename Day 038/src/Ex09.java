public class Ex09 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("ÀÌ¸§ : " + s.name);
		System.out.println("ÃÑÁ¡ : " + s.getTotal());
		System.out.println("Æò±Õ : " + s.getAverage());
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	float average;

	public int getTotal() {
		total = kor + eng + math;
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAverage() {
		average = (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}
}
