package Chapter22;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
				for (byte b:bs) {
					System.out.print((char)b);
				}
				System.out.println(": " + i + "¹ÙÀÌÆ® ÀÐÀ½");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}