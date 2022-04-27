package Example1;

import java.util.*;

class FriendInfoBook2
{
	public static void main(String[] args) 
	{
		FriendHandler handler = new FriendHandler(10);
		System.out.println(handler); // handler의 주소 출력 handler.toString()이 생략되어 있음.

		while (true)
		{
			System.out.println("******* 메뉴 선택 *******");
			System.out.println("1. 고교 친구 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");
			System.out.println("5. 친구 정보 검색");
			System.out.println("9. 프로그램 종료");

			System.out.print("선택 >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt(); // 메뉴번호 저장

			switch (choice)
			{
			case 1: case 2: // 1이나 2를 선택했을 경우
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4 :
				handler.showAllBasicInfo();
			case 5 :
				handler.searchData();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}