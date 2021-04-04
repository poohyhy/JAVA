import java.util.Scanner;

public class GradeSwitch {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.print("등급을 입력하세요.");
		String grade = a.next();	
		switch (grade) {
		case "A":
		case "B":
			System.out.print("참 잘하셨습니다.");
			break;
		case "C":
		case "D":
			System.out.print("좀더 노력하세요.");
			break;
		case "F":
			System.out.print("다음 학기에 다시 수강하세요.");
			break;
		default:
			System.out.print("잘못된 값을 입력하셨습니다.");
		}
	
	}

}
