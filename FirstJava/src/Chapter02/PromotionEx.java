package Chapter02;

public class PromotionEx {
	public static void main(String[] args) {
		byte bVal = 10;
		int iVal = bVal;
		System.out.println(iVal);
		
		char cVal = '가';
		iVal = cVal;
		System.out.println("가 : " + iVal);

		iVal = 200;
		double dVal = iVal;
		System.out.println(dVal);

		int result = iVal + bVal;
		System.out.println(result);
		
		short sVal = 100;
		int res = bVal + sVal;
		System.out.println(res);
		
		long lVal = 10000L;
		long res2 = iVal + lVal;
		System.out.println(res2);
	}
}