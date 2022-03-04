package Chapter20;

public class ImplNumber implements MyNumber {

	@Override
	public int getMax(int num1, int num2) {
		return (num1 >= num2) ? num1 : num2;
	}
	
}