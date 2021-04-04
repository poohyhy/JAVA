import java.util.Scanner;

public class ChangeMoney {
	public static void main (String args[]) {
		int money;
		int won1;
		int won10;
		int won100;
		int won500;
		int won1000;
		int won10000;
		int won50000;
		Scanner a = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		
		money = a.nextInt();
		won1 = money % 10;
		won10 = (money % 100) / 10;
		won100 = (money % 500) / 100;
		won500 = (money % 1000) / 500;
		won1000 = (money % 10000) / 1000;
		won10000 = (money % 50000) / 10000;
		won50000 = money / 50000;
		
		System.out.print("5만원권" + won50000 + "매, ");
		System.out.print("만원권" + won10000 + "매, ");
		System.out.print("천원권" + won1000 + "매, ");
		System.out.print("5백원짜리" + won500 + "개, ");
		System.out.print("백원짜리" + won100 + "개, ");
		System.out.print("십원짜리" + won10 + "개, ");
		System.out.println("1원짜리" + won1 + "개 입니다.");
	}

}
