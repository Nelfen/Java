package Chapter04;

public class NestedLoop {

	public static void main(String[] args) {
//		int dan;
//		int times;
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i * j);
			}
			System.out.println();
		}
	}

}