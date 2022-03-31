package Chapter20.Stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("È«±æµ¿", 10),
				new Student("½Å¿ë±Ç", 20),
				new Student("À¯¹Ì¼±", 30)
				);
		
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
	}
}