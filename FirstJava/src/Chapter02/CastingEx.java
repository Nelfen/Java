package Chapter02;

public class CastingEx {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500L;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double dVal = 3.14;
		intValue = (int) dVal;
		System.out.println(intValue);	//소수점 뒷자리 손실
		
		int iNum = 103029770;
		byte bNum = (byte) iNum;
		System.out.println(bNum);
	}

}