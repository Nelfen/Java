package Chapter04;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("Hello!" + i);
			if(i==1) {
				continue; //이후의 문장을 수행하지 않고 증감식으로 넘어감. 현재의 반복을 중단하고 다음 반복 시작.
			}
			System.out.println("출력..");
		}
		int cnt = 0;
		while(true) {
			System.out.println("while" + cnt++);
			if(cnt == 5) {
				continue;
			}
			System.out.println("출력..");
			if(cnt == 10) {
				break;
			}
		}
	}

}