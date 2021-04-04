import java.util.Scanner;

public class Rectangle {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("좌표 (x1, y1), (x2, y2)의 값을 순서대로 공백으로 구분하여 입력하십시오.");
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		int x2 = a.nextInt();
		int y2 = a.nextInt();
		
		if (((x1>=50 && x1<=100) || (x2>=50 && x2<=100)) && ((y1>=50 && y1<=100) || (y2>=50 && y2<=100))) {
			System.out.print("사각형들이 충돌합니다.");
		}
		else {
			System.out.print("사각형들이 충돌하지 않습니다.");
		}
	
	}

}
