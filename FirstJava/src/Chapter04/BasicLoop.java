package Chapter04;

public class BasicLoop {

	public static void main(String[] args) {
		int num = 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;
		System.out.println("1부터 10까지의 합은 " + num + "입니다.");
		
		int cnt = 1; //count
		int res = 0; //result
		res += cnt++;	//1
		res += cnt++;	//2
		res += cnt++;	//3
		res += cnt++;	//4
		res += cnt++;	//5
		res += cnt++;	//6
		res += cnt++;	//7
		res += cnt++;	//8
		res += cnt++;	//9
		res += cnt++;	//10
		System.out.println("1부터 10까지의 합은 " + res + "입니다.");
		
		cnt = 1;
		res = 0;
		while (cnt <= 10) {
			res += cnt++;
		}
		
		System.out.println("1부터 10까지의 합은 " + res + "입니다.");
		
		}

}