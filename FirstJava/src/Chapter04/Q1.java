package Chapter04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		String oper;
		int res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		System.out.print(">");
		num1 = sc.nextInt();
		
		System.out.println("숫자2 입력");
		System.out.print(">");
		num2 = sc.nextInt();
		
		System.out.println("연산자 입력");
		System.out.print(">");
		oper = sc.next();
		
		System.out.println("계산 결과");
		switch(oper) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2 + " 나머지 " + num1 % num2);
			break;
		default:
			System.out.println("오류입니다.");
		}
		sc.close();
	}

}