package Chapter04;

import java.util.Scanner;

public class CoffeeShop {
	public static void main(String[] args) {
		System.out.println("메뉴를 주문해 주세요.");
		Scanner sc = new Scanner(System.in);
		String menu = "";
		System.out.println("A: 아메리카노, M: 카페모카, C: 바닐라라떼, T: 오늘의 커피");
		System.out.print("> ");
		menu = sc.next();
		
//		switch(menu.toUpperCase()) { //문자를 대문자로 변경
		//toLowerCase() 문자를 소문자로 변경
//		case "A" :
//			System.out.println("아메리카노를 주문하셨습니다.");
//			break;
//		case "M" :
//			System.out.println("카페모카를 주문하셨습니다.");
//			break;
//		case "C" :
//			System.out.println("바닐라라떼를 주문하셨습니다.");
//			break;
//		case "T" :
//			System.out.println("오늘의 커피를 주문하셨습니다.");
//			break;
//		default :
//			System.out.println("없는 메뉴입니다. 다시 실행해주세요.");
//		}
		
		switch(menu) {
		case "A" :
		case "a" :
			System.out.println("아메리카노를 주문하셨습니다.");
			break;
		case "M" :
		case "m" :
			System.out.println("카페모카를 주문하셨습니다.");
			break;
		case "C" :
		case "c" :
			System.out.println("바닐라라떼를 주문하셨습니다.");
			break;
		case "T" :
		case "t" :
			System.out.println("오늘의 커피를 주문하셨습니다.");
			break;
		default :
			System.out.println("없는 메뉴입니다. 다시 실행해주세요.");
		}
		sc.close();
	}
}