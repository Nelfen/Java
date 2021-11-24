package Chapter05;

public class Person {
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	public Person(String name, int height, double weight, char gender, boolean married) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.married = married;
	}
	public Person() {
		this.name = "홍길동";
		this.height = 180;
		this.weight = 75.5;
		this.gender = 'M';
		this.married = false;
	}	
	
	void printName() {
		System.out.println(this.name);
	}
	void printHeight() {
		System.out.println(height);
	}
	void info() {
		printName();
		printHeight();
	}
}