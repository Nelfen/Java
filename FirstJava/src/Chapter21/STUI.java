package Chapter21;

import java.util.Scanner;

class studentinfo {
	int stuID;
	String name;
	String Address;

	public studentinfo(int stuID, String name, String Address) {
		this.stuID = stuID;
		this.name = name;
		this.Address = Address;
	}

	public void showstinfo() {
		System.out.println("학번: " + stuID);
		System.out.println("이름: " + name);
		System.out.println("주소: " + Address);
	}
}

class stuinfomanager {
	final int MAX_DB = 100;
	studentinfo[] stustorage = new studentinfo[MAX_DB];
	int curcnt = 0;
	int id = 2200000;

	public void inputData() {
		System.out.print("\n");
		System.out.println("학생 정보를 기입해주세요");

		System.out.println("학번생성중...");
		id = id + 1;
		int stuID = (id);
		System.out.println("당신의 학번은 " + stuID + "입니다.");
		System.out.print("이름: ");
		String name = STUDENT2000.sc.next();
		System.out.print("주소: ");
		String Address = STUDENT2000.sc.next();

		stustorage[curcnt++] = new studentinfo(stuID, name, Address);
		System.out.println("\n학생정보 입력이 완료되었습니다. \n");
	}

	public void searchData() {
		if (curcnt == 0) {
			System.out.print("\n");
			System.out.println("찾을 수 있는 학생의 정보가 없습니다.");
			System.out.print("\n");
		} else {
			System.out.print("\n");
			System.out.println("학생정보를 찾습니다");

			System.out.print("찾고 싶은 학생의 학번을 입력하시오: ");
			int stuID = STUDENT2000.sc.nextInt();

			int dataIdx = search(stuID);
			if (dataIdx < 0) {
				System.out.println("해당하는 학생의 정보가 존재하지 않습니다. \n");
			} else {
				stustorage[dataIdx].showstinfo();
				System.out.print("\n");
				System.out.println("학생정보검색이 완료되었습니다.");
				System.out.print("\n");
			}
		}
	}

	public void deleteData() {
		if (curcnt == 0) {
			System.out.print("\n");
			System.out.println("지울 수 있는 학생의 정보가 없습니다.");
			System.out.print("\n");
		} else {
			System.out.print("\n");
			System.out.println("학생 정보를 삭제합니다.");

			System.out.print("지울려고 하는 학생의 학번을 입력하시오: ");
			
			int stuID = STUDENT2000.sc.nextInt();

			int dataIdx = search(stuID);
			if (dataIdx < 0) {
				System.out.println("해당하는 학생데이터가 존재하지 않습니다. \n");
			} else {
				for (int idx = dataIdx; idx < (curcnt - 1); idx++)
					stustorage[idx] = stustorage[idx + 1];

				curcnt--;
				System.out.print("\n");
				System.out.println("학생데이터 삭제가 완료되었습니다.");
				System.out.print("\n");
			}
		}
	}

	public void allprint() {
		if (curcnt == 0) {
			System.out.print("\n");
			System.out.println("등록된 학생 정보가 없습니다.");
			System.out.print("\n");
		} else {
			for (int i = 0; i < curcnt; i++) {
				stustorage[i].showstinfo();
			}
			System.out.print("\n");
			System.out.println("입력된 데이터들을 전부다 출력하였습니다.");
			System.out.print("\n");
		}
	}

	private int search(int stuID) {
		for (int idx = 0; idx < curcnt; idx++) {
			studentinfo curinfo = stustorage[idx];
			if (stuID == (curinfo.stuID))
				return idx;
		}
		return -1;
	}

}

class STUDENT2000 {
	public static Scanner sc = new Scanner(System.in);

	public static void showMENU() {
		System.out.println("<<학생 정보 관리>>");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 검색");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 전체출력");
		System.out.println("5. 종료");
		System.out.print("> ");
	}
}

public class STUI {
	public static void main(String[] args) {
		stuinfomanager stmanager = new stuinfomanager();
		int choice;

		while (true) {
			STUDENT2000.showMENU();
			choice = STUDENT2000.sc.nextInt();
			// menuviwer.keyboard.next();

			if (choice > 5 || choice < 0) {
				System.out.print("\n");
				System.out.println("잘못된 번호 입니다. 1~5까지 숫자중에서 다시 입력 해주세요.");
				System.out.print("\n");
			} else {
				switch (choice) {

				case 1:
					stmanager.inputData();
					break;
				case 2:
					stmanager.searchData();
					break;
				case 3:
					stmanager.deleteData();
					break;
				case 4:
					stmanager.allprint();
					break;
				default:
					System.out.print("\n");
					System.out.println("프로그램을 종료합니다");
					return;
				}
			}
		}
	}
}
