package Chapter04;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		System.out.print("> ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " 짝수입니다.");
		} else {
			System.out.println(num + " 홀수입니다.");
		}
		
		sc.close();
	}
}