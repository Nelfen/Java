package Chapter20.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("홍길동", 10, Student2.Sex.MALE),
				new Student2("김수애", 6, Student2.Sex.FEMALE),
				new Student2("신용권", 10, Student2.Sex.MALE),
				new Student2("박수미", 6, Student2.Sex.FEMALE)
		);
		
		// 남학생들만 묶어 List 생성
		List<Student2> maleList = totalList.stream().filter(s -> s.getSex() == Student2.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		// 여학생들만 묶어 HashSet 생성
		Set<Student2> femaleSet = totalList.stream().filter(s -> s.getSex() == Student2.Sex.FEMALE)
				// .collect(Collectors.toCollection(HashSet :: new));
				// .collect(Collectors.toCollection(() -> {return new HashSet<Student>();}) );
				.collect(Collectors.toCollection(() -> new HashSet<Student2>()));
		femaleSet.stream().forEach(s -> System.out.println(s.getName()));
	}
}