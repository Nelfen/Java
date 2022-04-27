package HiddenChapter;

import java.util.Scanner;

public class KeepingBook {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		final int MAX=3;
		
		String inOutDate[]=new String[MAX];
		String inOutSort[]=new String[MAX];
		int inOutMoney[]=new int[MAX];
		
		int totalMoney=1517;//총 잔액
		int inMon=0;//수입 총 합
		int outMon=0;//지출 총 합

		int select=0;
		
		System.out.println("가계부 프로그램");
		while(true) {
			System.out.println("==================================================");
			System.out.println("1.내용 등록 2.전체 출력 3.수입 출력 4.지출 출력 5.종료");
			System.out.println("==================================================");
			System.out.print("선택 > ");
			select=scan.nextInt();
			
			if(select==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			switch(select) {
			case 1: //내용 등록
				for(int i=0;i<MAX;i++) {
					scan.nextLine();
					System.out.println("(지출 or 수입)"); 
					inOutSort[i]=scan.nextLine();
					System.out.println("날짜를 입력해주세요 > ");
					inOutDate[i]=scan.nextLine();
					System.out.println("금액을 입력해주세요");
					inOutMoney[i]=scan.nextInt();
					if(inOutSort[i].equals("in")) {
						totalMoney+=inOutMoney[i];
						inMon+=inOutMoney[i];
					}else if(inOutSort[i].equals("out")) {
						totalMoney-=inOutMoney[i];
						outMon-=inOutMoney[i];
					}
				}
				break;
			case 2: //전체 출력
				System.out.printf("날짜\t\t금액\t\t수입/지출\n");
				for(int i=0;i<MAX;i++) {
					System.out.printf("%s\t\t%d\t\t%s\n",inOutDate[i],inOutMoney[i],inOutSort[i]);
				}
				System.out.println("잔액 : "+totalMoney);
				break;
			case 3: //수입 출력
				System.out.printf("날짜\t\t금액\t\t수입\n");
				for(int i=0;i<MAX;i++) {
					if(inOutSort[i].equals("in")) {
						System.out.printf("%s\t\t+%d\t\t%s\n",inOutDate[i],inOutMoney[i],inOutSort[i]);
					}
				}
				System.out.println("수입 총 합 : "+inMon);
				break;
			case 4: //지출 출력
				System.out.printf("날짜\t\t금액\t\t지출\n");
				for(int i=0;i<MAX;i++) {
					if(inOutSort[i].equals("out")) {
						System.out.printf("%s\t\t-%d\t\t%s\n",inOutDate[i],inOutMoney[i],inOutSort[i]);
					}
				}
				System.out.println("지출 총 합 : "+outMon);
				break;
			}
		}
	}
}