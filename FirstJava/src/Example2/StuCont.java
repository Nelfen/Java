package Example2;

import java.util.ArrayList;
import java.util.Scanner;

public class StuCont{

	ArrayList<StuData> list;	//arraylist 생성 ( StuData 클래스가 배열에 담기게 된다 ) 
	Scanner sc;
	private String id,name;
	private int kor,eng, mat;
	StuData data;				//래퍼런스 변수 
	boolean flag;
	
	StuCont() {
		list = new ArrayList();
		sc = new Scanner(System.in);
		flag = true;	//중복된 학번입력 받을시 유효성 검사를 위한 변수
	}
	
	//입력
    void insert(){
    	int stu_Num;
    	System.out.println("몇명의 학생을 입력하시겠습니까?:");
    	stu_Num = sc.nextInt();	//값 입력 받음
		
    	for(int i=0;i<stu_Num;i++) {		//입력 받은 수만큼 반복문
    	
    		//값 입력 부분
		      System.out.println("학번을 입력하세요: ");	
		      id = sc.next();
		      System.out.println("이름을 입력하세요: ");
		      name = sc.next();
		      System.out.println("국어점수를 입력하세요: ");
		      kor = sc.nextInt();
		      System.out.println("영어점수를 입력하세요: ");
		      eng = sc.nextInt();
		      System.out.println("수학점수를 입력하세요: ");
		      mat = sc.nextInt();
			
		      
		    //list크기만큼 for문 실행  
	      	for(int j=0;j<list.size();j++) {
	      		
	      		//중복된 학번 잇으면 다시 입력
	      		if(list.get(j).getId().equals(id)) {
	      			System.out.println("이미 존재하는 학번입니다.다시 입력해주세요.");
					 flag = false;
					 break;
	      		}
	      	}
	      	
	      	//없으면 값 입력!
			if (flag == true) {
				list.add(new StuData(id,name,kor,eng,mat));
			}
    	}
}   
    
    //조회
    void serch(){
    	
    	String find;	//학번이나 이름 입력받을 변수
    	
    	System.out.println("검색할 학번 또는 이름을 입력하세요:");	
    	find = sc.next();

	      for(int i = 0; i<list.size();i++){			//list 크기만큼 for문 실행
	    	  
	    	  //학번이나 이름 둘다 조회 가능하게
	    	  if(find.equals(list.get(i).getId()) || find.equals(list.get(i).getName())) { 	
	    		  System.out.println("조회중입니다 잠시만 기다려 주세요");
	    		  
	    		  try {			//복습겸 있어보이는 Thread 사용 ㅋㅋ(없어도됨)
	    			  Thread.sleep(300);
	    		  }catch(InterruptedException e) {
	    			 
	    		  }
	    		  
	    		  System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
	    		  System.out.println(list.get(i).getId()+"\t" +list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+list.get(i).getMat()+"\t"+
	    				  list.get(i).getTotal()+"\t"+list.get(i).getAvg());
	    	  }
	    	  else {
	    		  System.out.println("학번 혹은 이름을 다시 확인해주세요.");
	    	  }
	    	  break;
	    }
    }
    
    //전체조회
    void serchAll() {
    	
    		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
    		for(int i=0;i<list.size();i++) {
	  		  	System.out.println(list.get(i).getId()+"\t" +list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+list.get(i).getMat()+"\t"+
					  list.get(i).getTotal()+"\t"+list.get(i).getAvg());
    		}
    }
    
    //수정
    void modify() {
    	String mod_Stu;
    	System.out.println("수정할 학번 또는 이름을 입력하세요:");
    	mod_Stu = sc.next();
    	int select;
    	
    	for (int i=0;i<list.size();i++) {	
    		if(mod_Stu.equals(list.get(i).getId()) || mod_Stu.equals(list.get(i).getName())) { 
    		System.out.println("수정할 부분을 선택해주세요 1.일괄수정 2.학번 3.이름 4.국어 5.수학 6.영어 0.취소:");
    		select = sc.nextInt();
    		
	    		if(select == 1) {
					System.out.println("변경할 학번을 입력하세요:");
					list.get(i).setId(sc.next());
					System.out.println("변경할 이름을 입력하세요:");
					list.get(i).setId(sc.next());
					System.out.println("변경할 국어점수를 입력하세요:");
					list.get(i).setId(sc.next());
					System.out.println("변경할 수학점수를 입력하세요:");
					list.get(i).setId(sc.next());
					System.out.println("변경할 영어점수를 입력하세요:");
					list.get(i).setId(sc.next());
					
					System.out.println("수정이 완료되었습니다.\n");
		    		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		    		System.out.println(
		    				list.get(i).getId()+"\t" +list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+
		    				list.get(i).getEng()+"\t"+list.get(i).getMat()+"\t"+
		    				list.get(i).getTotal()+"\t"+list.get(i).getAvg()+"\n\n");
		    		break;
		    	  }
	    		else if(select == 2) {
	    			String previous;
	    			previous = list.get(i).getId(); 
    				System.out.println("변경할 학번을 입력하세요:");
    				list.get(i).setId(sc.next()); 
    				System.out.println("학번이"+previous+"에서"+list.get(i).getId()+"로 변경되었습니다");
    				break;
    			}
	    		else if(select == 3) {
	    			String previous;
	    			previous = list.get(i).getId(); 
    				System.out.println("변경할 이름을 입력하세요:");
    				list.get(i).setName(sc.next()); 
    				System.out.println("이름이"+previous+"에서"+list.get(i).getName()+"로 변경되었습니다");
    				break;
    			}	    		
	    		else if(select == 4) {
	    			int previous;
	    			previous = list.get(i).getKor(); 
    				System.out.println("변경할 국어점수를 입력하세요:");
    				list.get(i).setKor(sc.nextInt()); 
    				System.out.println("국어점수가"+previous+"에서"+list.get(i).getKor()+"로 변경되었습니다");
    				break;
    			}	    	
	    		else if(select == 5) {
	    			int previous;
	    			previous = list.get(i).getEng(); 
    				System.out.println("변경할 영어점수를 입력하세요:");
    				list.get(i).setEng(sc.nextInt()); 
    				System.out.println("영어점수가"+previous+"에서"+list.get(i).getEng()+"로 변경되었습니다");
    				break;
    			}	    
	    		else if(select == 6) {
	    			int previous;
	    			previous = list.get(i).getMat(); 
    				System.out.println("변경할 수학점수를 입력하세요:");
    				list.get(i).setMat(sc.nextInt()); 
    				System.out.println("수학점수가"+previous+"에서"+list.get(i).getMat()+"로 변경되었습니다");
    				break;
    			}
	    		else if(select == 0) {
	    			break;
	    		}
	    		else {
	    			System.out.println("제대로 입력해주세요.");
	    		}
    		}
    	}
    }
    
    //삭제
    void delete() {
    	String del_Stu;
    	int select,stu_Num;
    	
    	System.out.println("1.전체삭제 2.부분삭제");
    	select = sc.nextInt();
    	
    	//전체삭제
    	if(select==1) {
     			list.clear();	//clear()라는 메소드를 사용하면 배열에 담겨잇는 전체 객체를 날려버린다.
    			System.out.println("전체삭제가 완료 되었습니다.");
       	}
    	
    	//부분삭제
    	else if(select==2) {
    		System.out.println("몇명의 학생을 삭제하시겠습니까?:");
    		stu_Num = sc.nextInt();
    		
    		for(int i=0;i<stu_Num;i++) {
    			System.out.println("삭제할 학생의 학번을 입력해주세요:");
    			del_Stu = sc.next();
    			for (StuData data : list) {
    				if(data.getId().equals(del_Stu)) {
    					list.remove(data);
    					break;
    				}   				
    			}
    		}
    	}
    }
}