package Chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000; //컴퓨터는 언더바(_)를 인식하지 않습니다.
		short sNum2 = 10000;
		int iNum = 1_000_000_000;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum2);
		System.out.println(iNum);
		/*
		 * 주석처리 단축키
		 * 컨트롤 + 쉬프트 + C
		 * 컨트롤 + /
		 * 컨트롤 + 7
		 */
//		sNum = 40_000; // -32768 ~ 32767까지 사용 가능합니다.
		
//		iNum = 2_200_000_000; // int는 -2,147,483,648 ~ 2,147,483,647까지 사용 가능합니다.
		
		System.out.println(1_000_000_000); //10억 출력
		System.out.println(3_000_000_000L); //long형 자료는 영문자 L을 붙이는데 대문자를 사용해야 합니다.
		
		int result;
		result = sNum + bNum;
		System.out.println(result);
		
		long lNum = 3_000_000_000L;
		System.out.println(lNum);
	}

}