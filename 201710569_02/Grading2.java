import java.util.Scanner;

public class Grading2 {
	public static void main (String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		System.out.print("점수를 입력하십시오.");
		while (a.hasNext()) {
			int score = a.nextInt();
			switch (score/10) {
				case 10:
				case 9:
					grade = 'A';
					break;
				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				case 6:
					grade = 'D';
					break;
				default:
					grade = 'F';
			}
			System.out.println("학점은 "+grade+"입니다");
		}
	}
}