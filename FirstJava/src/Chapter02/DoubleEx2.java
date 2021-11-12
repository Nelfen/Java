package Chapter02;

public class DoubleEx2 {
	public static void main(String[] args) {
		double value = (1.0e20 + 5.0) - 1.0e20; //연산을 하면 5.0이 나와야 한다.
		
		System.out.println(value);
	}
}