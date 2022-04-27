package Example214;

import java.util.Scanner;

import Example214.student;
//DAO = Data Access Object
public class Daoclass {
    Scanner sc = new Scanner(System.in);
    private student _student[]; //데이터 저장.. 관리하기위한 배열
    private int memberCount;
     
    public Daoclass() {
        _student = new student[10];
        memberCount = 0;
    }
     
    public void insert() {
        System.out.print("이름:");
        String name = sc.next();
        System.out.print("나이:");
        int age = sc.nextInt();
        System.out.print("국어:");
        int kor = sc.nextInt();
        System.out.print("영어:");
        int eng = sc.nextInt();
        System.out.print("수학:");
        int math = sc.nextInt();
         
        student stu = new student(name, age, kor, eng, math);
        _student[memberCount] = stu;
        memberCount++;
        System.out.println("학생번호:" + memberCount);
    }
     
    public void delete() {  //빈칸으로 만들기
        System.out.print("삭제할 이름을 입력하세요 >> ");
        String name = sc.next();
         
        //데이터를 검색
        int findnum = -1;
        for (int i = 0; i < _student.length; i++) {
            student s = _student[i];
            String n = s.getName();
            if (n.equals(name)) {
                findnum = i;
                break;
            }
        }
         
        if (findnum == -1) {
            System.out.println("이름을 찾을 수 없습니다.");
            return;
        }
        _student[findnum].setName("");
        _student[findnum].setAge(0);
        _student[findnum].setKor(0);
        _student[findnum].setEng(0);
        _student[findnum].setMath(0);
        System.out.println("삭제되었습니다.");
    }
     
    public void select() {  //이름으로 찾기
        System.out.print("검색할 이름을 입력하세요 >> ");
        String name = sc.next();
         
        int findnum = -1;
        for (int i = 0; i < _student.length; i++) {
            student s = _student[i];
            String n = s.getName();
            if (n.equals(name)) {
                findnum = i;
                break;
            }
        }
        if (findnum == -1) {
            System.out.println("이름을 찾을수 없습니다.");
            return;
        }
        System.out.println(_student[findnum].toString());
    }
     
    public void update() {  //점수만!! kor, eng, math만
        System.out.print("수정할 이름을 입력하세요 >> ");
        String name = sc.next();
         
        int findnum = -1;
        for (int i = 0; i < _student.length; i++) {
            student s = _student[i];
            String n = s.getName();
            if (n.equals(name)) {
                findnum = i;
                break;
            }
        }
         
        if (findnum == -1) {
            System.out.println("이름을 찾을 수 없습니다.");
            return;
        }
         
        System.out.println("수정할 데이터를 입력해주세요");
        System.out.print("국어 >> ");
        int newkor = sc.nextInt();
        System.out.print("영어 >> ");
        int neweng = sc.nextInt();
        System.out.print("수학 >> ");
        int newmath = sc.nextInt();
         
        _student[findnum].setKor(newkor);
        _student[findnum].setEng(neweng);
        _student[findnum].setMath(newmath);
         
        System.out.println("수정에 성공하였습니다.");
    }
     
    public void allprint() {
        for (int i = 0; i < _student.length; i++) {
            student s = _student[i];
            if (s != null && !s.getName().equals("")) {
                System.out.println( s.toString() );
            }
        }
    }
     
}