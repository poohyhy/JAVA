import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요>>> ");
			String str=sc.next();
			a.add(str);
		}
		String longName=a.get(0);
		for(int i=0;i<a.size();i++ ) {
			if (longName.length()<a.get(i).length()) {
				longName=a.get(i);
			}
		}
		System.out.println("가장 긴 이름은: "+longName);
	}
}
