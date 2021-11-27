package Chapter07;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}
		System.out.println(sum1);
		int[] arr2 = new int[5]; // 배열은 한 번 정해지면 길이 변경 불가. 중괄호는 최초 초기화 때만 사용 가능.
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		System.out.println();

		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

		arr1 = new int[] { 1, 2, 3, 4, 5 };
	}

}
