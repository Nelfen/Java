package Chapter04;

public class ForEx {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num <= 10) {
			sum += num++;
		}
		System.out.println(sum);

		int i = 0;
		int res = 0;
		for(i = 1; i <= 10; i = i * 2) {
			res += i;
		}
		System.out.println(res);
		
	}

}

/*
 * 증감식은 식이 들어가는 공간입니다.
 * i++ -> i += 1 -> i = i + 1
 */