package Chapter20;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englisScore, int mathScore) {
		this.name = name;
		this.englishScore = englisScore;
		this.mathScore = mathScore;
	}
	
	public String getName() { return name; }
	public int getEnglishScore() { return englishScore; }
	public int getMathScore() { return mathScore; }
}