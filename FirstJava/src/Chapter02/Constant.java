package Chapter02;

public class Constant {
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;	//선언 후 반드시 초기값을 입력해야 한다.
//		MAX_NUM = 1000;	//final은 최종적으로 선언되기 때문에 값의 변경이 불가능하다.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}
}