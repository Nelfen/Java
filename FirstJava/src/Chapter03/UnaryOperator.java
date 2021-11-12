package Chapter03;

public class UnaryOperator {

	public static void main(String[] args) {
		int a = 10, b = 10; //같은 타입은 한 줄에 선언과 초기화를 할 수 있다
		
		int c = 100;
		
		System.out.println("a++ = " + (a++) + ", ++b = " + (++b)); //헷갈린다면 괄호를 써라.
		System.out.println("a = " + a + ", b = " + b);
		
		c++; //100
		c++; //101
		c++; //102
		System.out.println(c++); //103
		//104
		System.out.println(c);
		++c; //105
		c++; //105
		++c; //107
		++c; //108
		++c; //109
		c++; //109
		System.out.println(++c); //111
	}

}