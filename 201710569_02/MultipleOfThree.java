import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("수를 입력하세요.");
		int num = a.nextInt();
		if (num % 3 == 0) {
			System.out.print("입력하신 수는 3의 배수입니다.");
		}
		else {
			System.out.print("입력하신 수는 3의 배수가 아닙니다.");
		
		}
	}

}
