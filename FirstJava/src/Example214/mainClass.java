package Example214;

import java.util.Scanner;

import Example214.Daoclass;
 
public class mainClass {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int choice;
        //학생관리 프로그램
        Daoclass dao = new Daoclass();
         
        //menu
        while(true) {
            System.out.println("1.추가");
            System.out.println("2.삭제");
            System.out.println("3.검색");
            System.out.println("4.수정");
            System.out.println("5.모두출력");
            System.out.print("메뉴번호를 입력하세요 >> ");
            choice = sc.nextInt();
             
            switch (choice) {
                case 1: //추가
                    dao.insert();
                    break;
                case 2: //삭제
                    dao.delete();
                    break;
                case 3: //검색
                    dao.select();
                    break;
                case 4: //수정
                    dao.update();
                    break;
                case 5: //모두출력
                    dao.allprint();
                    break;
            }
        }
 
    }//main end
 
}//mainClass end