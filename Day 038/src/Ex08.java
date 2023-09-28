class Man {
	int age;
	String name;
	boolean isMarried;
	int child;
}

public class Ex08 {
	public static void main(String[] args) {
		Man man = new Man();
		man.name = "James";
		man.age = 40;
		man.isMarried = true;
		man.child = 3;

		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.isMarried);
		System.out.println(man.child);

	}
}
