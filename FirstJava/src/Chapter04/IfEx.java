package Chapter04;

public class IfEx {

	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
		} else {	//else 구문은 if문에서 false일때 실행되는 영역
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다.");
		}
		
//		if (score < 90) {
//			System.out.println("점수가 90보다 작습니다");
//			System.out.println("등급은 B입니다.");
//		}
		
		System.out.println("마지막 줄입니다.");
	}

}