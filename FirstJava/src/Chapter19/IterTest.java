package Chapter19;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IterTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50); // asList로 생성된 list는 추가 삭제가 불가합니다.
		System.out.println(list.size());
		Iterator<Integer> ir = list.iterator();
		
		System.out.println("이터레이터");
		while(ir.hasNext()) {
			int number = ir.next();
			System.out.println(number);
		}
		
		System.out.println("for문");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("향상된 for문");
		for(int num:list) {
			System.out.println(num);
		}
	}
}