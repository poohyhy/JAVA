import java.util.Scanner;

public class BreakExample {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true) {
			if (sc.nextInt()==-1)
				break;
			sum++;
		}
		System.out.println("입력된 수의 개수는 "+sum+" 개 입니다.");
	}

}
