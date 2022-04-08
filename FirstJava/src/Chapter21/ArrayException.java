package Chapter21;

public class ArrayException {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 100;
			System.out.println("정상실행했습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어나거나 산술연산에 문제가 발생했습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("파이널리는 무조건 실행하는 구간입니다.");
		}
	}
}