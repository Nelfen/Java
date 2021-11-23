package Chapter05;

public class FunctionTest5 {
	public static void main(String[] args) {
		Obj obj = new Obj();
		int res = obj.add(1, 2);
		System.out.println(res);
	}
}

class Obj {
	int add(int a, int b) {
		return a + b + c;
	}
	int c = 10;
}