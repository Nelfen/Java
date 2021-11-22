package Chapter05;

public class Student {
	/* 필드 - 멤버 변수 */
	int studentID;
	String studentName;
	int grade;
	String address;

	/* 생성자 - 객체를 생성할 때 실행하는 블록 */
	Student(int num1, long num2) {
		System.out.println("Student 객체를 생성합니다.");
	}
	Student(int num1, int num2) {
		System.out.println("Student 객체를 생성합니다.");
	}
	Student(long num1, int num2) {
		System.out.println("Student 객체를 생성합니다.");
	}
	Student(int num) {
		System.out.println("Student 객체를 생성합니다." + num);
	}Student(long num) {
		System.out.println("Student 객체를 생성합니다." + num);
	}
	Student() {
		System.out.println("디폴트 생성자로 Student 객체를 생성합니다.");
	}
	
	/* 메소드 - 멤버 함수 */
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // 이름, 주소 출력
	}
}