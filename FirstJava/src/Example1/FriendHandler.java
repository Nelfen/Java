package Example1;

import java.util.*;

class FriendHandler //정보저장용 클래스들을 이용하여 각종 작업(친구추가, 친구검색 등)을 처리하는 클래스
{
	private Friend[] friends; // Friend형 배열 friends 선언
	// HighFriend와 UnivFriend의 상위클래스인 Friend로 만든 배열에는 두 종류의 친구정보가 모두 저장될 수 있음
	private int idx; // friends배열의 인덱스번호 및 저장한 정보 개수를 위한 변수
	
	public FriendHandler(int num){
		friends = new Friend[num];
		// 친구 정보들을 저장할 배열 생성
		idx = 0; // friends배열에 저장할 위치 인덱스를 지정
	}
	private void addFriendInfo(Friend fren){
		// 친구 정보를 배열에 저장하는 메소드
		// 현 메소드는 현 클래스에서만 사용해야 하므로 private으로 지정
		// fren을 상위클래스인 Friend로 선언해야 HightFriend와 UnivFriend 두가지 종류의 인스턴스를 받을 수 있음.
		friends[idx] = fren; // 배열에 받아온 친구정보 인스턴스를 저장
		idx++; // 다음에 저장할 친구정보의 위치를 지정, 현재 저장된 친구 정보의 개수를 의미하기도 함
	}
	public void addFriend(int choice){
		// 추가할 친구정보를 입력받는 메소드
		String name, phone, addr, job, major; // 받아올 정보를 저장할 변수들
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : "); name = sc.nextLine();
		System.out.print("전화 : "); phone = sc.nextLine();
		System.out.print("주소 : "); addr = sc.nextLine();
		// Friend클래스의 기본정보들을 입력받음

		if (choice == 1) // 고교친구 등록시
		{
			System.out.print("직업 : "); job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phone, addr, job));
			// 이름없이 HighFriend의 인스턴스를 만들어 addFriendInfo()메소드로 보내어 배열에 저장(고교친구등록)
		}else{ // 대학친구 등록시
			System.out.print("전공 : "); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}
		System.out.println("입력 완료! \n");
	}
	public void showAllData(){ // 저장된 모든 정보들을 보여주는 메소드
		for (int i = 0 ; i < idx ; i++)
		{// friends.length가 아닌 idx를 이용하여 루프를 돌려야 함
			friends[i].showData();
			// friends배열의 i 인덱스에 들어있는 인스턴스에서 showData()메소드를 실행하여 정보를 보여주기
			// friends 배열에 들어있는 인스턴스는 하위클래스형이나 넣을 때 상위클래스로 넣었기 때문에 메소드 호출시 상위클래스의 메소드만 호출이 가능함
			// 단, 오버라이딩 된 메소드는 하위클래스에서 실행됨
			System.out.println();
		}
	}
	public void showAllBasicInfo(){ // 저장된 모든 친구들의 기본정보들을 보여주는 메소드
		for (int i = 0 ; i < idx ; i++)
		{// friends.length가 아닌 idx를 이용하여 루프를 돌려야 함
			friends[i].showBasicInfo();
			// friends배열의 i인덱스에 들어있는 인스턴스에서 showBasicInfo()메소드를 실행하여 정보를 보여주기
			System.out.println();
		}
	}
	public void findFriend(){
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : "); name = sc.nextLine();
		for (int i = 0; i < idx ; i++ )
		{
			if (friends[i].name.equals(name)) // private일 경우 사용 불가능
			{
				friends[i].showData();
			}else{
				System.out.println("입력된 정보가 없습니다.");
			}
		}
	}

	public void searchData(){
		// 이름으로 친구 정보를 검색하는 메소드
		if (idx == 0) // 등록된 정보가 없을 경우
		{
			System.out.println("등록된 정보가 없습니다. \n");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 >> ");
		String keyword = sc.nextLine();

		for (int i = 0; i < idx ; i++)
		{
			if (friends[i].getName().indexOf(keyword) >= 0)
			{
				friends[i].showData();
				System.out.println();
				return;
			}
		}
		System.out.println("검색결과가 없습니다. \n");
	}
}