package HiddenChapter;

import java.util.Scanner;

public class StudentManager2 {
	static Scanner scan=new Scanner(System.in);
	final static int MAX=3; //학생의 전체 인원
	static String names[]=new String[MAX];
	static String major[]=new String[MAX];
	static String phoneNumber[]=new String[MAX];//int로 잡을 경우 앞자리 0을 입력하면 짤린다. 
	static int stuNumber[]=new int[MAX];
	static float avgScore[]=new float[MAX];
	
	public static int printMenu() {
		System.out.println("1.정보입력 2.정보출력 3.종료");
		System.out.println("========================================");
		System.out.print("선택 >");
		int selMenu=scan.nextInt();
		
		return selMenu;
	}
	public static void inputStuInfo() {
		System.out.println("학생을 등록해주세요!");
		for(int i=0;i<MAX;i++) {
			System.out.println("===================");
			System.out.print("이름 > ");
			names[i]=scan.next();
			System.out.print("전공 > ");
			major[i]=scan.next();
			System.out.print("학번 > ");
			stuNumber[i]=scan.nextInt();
			System.out.print("전화번호 > ");
			phoneNumber[i]=scan.next();
			System.out.print("학점 > ");
			avgScore[i]=scan.nextFloat();
		}
	}
	public static void printStuInfo() {
		for(int i=0;i<MAX;i++) {
			System.out.println("===============================");
			System.out.println((i+1)+"번 학생 정보");
			System.out.println(names[i]);
			System.out.println(major[i]);
			System.out.println(stuNumber[i]);
			System.out.println(phoneNumber[i]);
			System.out.println(avgScore[i]);
		}
	}
	public static void main(String[] args) {
		int selMenu=0;//메뉴 입력 값을 저장 할 변수
		
		System.out.println("학생 관리 프로그램");
		System.out.println("========================================");
		while(true) {
			selMenu=printMenu();
			
			//먼저 처리할 메뉴
			if(selMenu==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			switch(selMenu) {
			case 1: //입력 처리 메뉴
				inputStuInfo();
				break;
			case 2: //출력 처리 메뉴
				printStuInfo();
				
				break;
			default://잘못된 메뉴 입력   
				break;
			}
		}
	}//main()
}