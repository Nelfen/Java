package Chapter04;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scan = new Scanner(System.in);
		String inputString;

		do {
			System.out.print("> ");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));	//입력 받은 값이 q가 아닐경우 계속 반복한다
			System.out.println();
			System.out.println("프로그램 종료");
			scan.close();
	}

}