package Study;

public class Main03 {
	private String name;
	private int age;
	private int weight;
	private int height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Main03(String name, int age, int weight, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
}
