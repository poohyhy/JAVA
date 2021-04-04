import java.util.Scanner;

public class Split {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		
		while(true) {
			s = sc.nextLine();
			
			if(s.equals("-1")) {
				break;
			}
			
			String a [] = s.split(" ");
			System.out.println("단어 개수는 " + a.length);
		}
	}
}