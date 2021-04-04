import java.util.Scanner;

public class Grade {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하세요.");
		String grade = sc.next();	
		switch (grade) {
		
		case "A":
		case "B":
		case "C":
			System.out.print("참 잘하셨습니다.");
			break;
		
		case "D":
		case "E":
			System.out.print("좀 더 노력하세요.");
			break;
			
		case "F":
			System.out.print("다음 학기에 다시 수강하세요.");
			break;
			
		}
	
	}

}
