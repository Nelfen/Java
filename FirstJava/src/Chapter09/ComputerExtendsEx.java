package Chapter09;

public class ComputerExtendsEx {

	public static void main(String[] args) {
		int r = 10;
		
		CalculatorExtends calc = new CalculatorExtends();
		System.out.println("¿ø¸éÀû: " + calc.areaCircle(r));
		System.out.println();
		
		ComputerExtends com = new ComputerExtends();
		System.out.println("¿ø¸éÀû: " + com.areaCircle(r));
	}

}