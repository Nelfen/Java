package Chapter02;

public class CharEx {
	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);	//char 자료형은 1개의 문자만 입력 가능합니다.
		int num1 = ch1;
		System.out.println(num1);	//대문자 'A'는 숫자 65와 같습니다.
		
		char ch2 = 66;
		char ch3 = 67;
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = 'a';
		int num4 = ch4;
		System.out.println(num4);
		
		System.out.println('a' - 'A');
	}
}