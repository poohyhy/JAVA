import java.util.Scanner;

public class Triangle {
	public static void main (String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("정수 3개를 공백으로 구분하여 입력하시오.");
		int leng1 = a.nextInt();
		int leng2 = a.nextInt();
		int leng3 = a.nextInt();
		
		if ((leng1+leng2 > leng3) && (leng2+leng3 > leng1) && (leng1+leng3 > leng2)) {
			System.out.println("삼각형을 만들 수 있습니다.");
		}
		else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
		
	}

}
