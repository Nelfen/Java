package Chapter04;

public class PracticeQ {

	public static void main(String[] args) {
//		for(int i=2;i<10;i++) {
//			for(int j=1;j<10;j++) {
//				if(j%2!=0) {
//					continue;
//				}
//				System.out.println(i + "X" + j + "=" + i*j);
//			}
//		}
//		for(int i=2;i<10;i++) {
//			for(int j=1;j<10;j++) {
//				if(i<j) {
//					break;
//				}
//				System.out.println(i + "X" + j + "=" + i*j);
//			}
//		}
//		int lineCount = 4;  
//		int spaceCount = lineCount/2 +1;
//		int starCount = 1;
//		
//		for(int i = 0; i<lineCount; i++) {
//			for(int j = 0; j<spaceCount; j++) {
//				System.out.print(' ');
//			}
//			for(int j=0; j<starCount; j++) {
//				System.out.print('*');
//			}
//			for(int j = 0; j<spaceCount; j++) {
//				System.out.print(' ');
//			}
//			spaceCount-=1;
//			starCount+=2;
//			System.out.println();
//		}
		
		int lineCount = 9;  //다른 홀수 값을 넣어보세요
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i < lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			}
			else {
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
	}

}