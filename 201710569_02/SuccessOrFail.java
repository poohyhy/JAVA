import java.util.Scanner;

public class SuccessOrFail {
	public static void main (String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("점수를 입력하십시오.");
		int score = a.nextInt();
		
		if (score>=80) {
			System.out.print("축하합니다! 합격입니다.");
			
		}
	}

}
