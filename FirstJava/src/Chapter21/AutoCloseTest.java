package Chapter21;

import java.util.Scanner;

public class AutoCloseTest {
	public static void main(String[] args) {
		try(
				AutoCloseObj obj = new AutoCloseObj();
				Scanner sc = new Scanner(System.in);
				){
			int[] arr = new int[3];
			arr[3] = 100;
		} catch(Exception e) {
			System.out.println("¿¹¿Ü ºÎºÐÀÔ´Ï´Ù.");
		}
	}
}