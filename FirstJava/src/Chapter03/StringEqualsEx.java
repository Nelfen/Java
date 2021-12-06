package Chapter03;

public class StringEqualsEx {

	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바");
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	}

}