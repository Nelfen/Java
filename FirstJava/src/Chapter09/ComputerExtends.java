package Chapter09;

public class ComputerExtends extends CalculatorExtends {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´ĂźŔÇ areaCircle()");
		return Math.PI * r * r;
	}
}