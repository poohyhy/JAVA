import java.util.Scanner;

class Person {
	String name;
	Person(String name) {
		this.name=name;
	}
}
public class Gamble {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 플레이어의 이름을 입력해 주십시오.");
		Person p1=new Person(sc.next());
		System.out.println("두번째 플레이어의 이름을 입력해 주십시오.");
		Person p2=new Person(sc.next());
		
		System.out.println("<Enter> 키를 입력하면 3개의 수가 생성됩니다. 이 세 수가 모두 같으면 승리합니다.");
		System.out.println(p1.name+" 님 부터 시작하여 번갈아가며 진행됩니다.");
		System.out.println("<Enter>키를 입력해서 시작해 주십시오.");
		String enter=sc.nextLine();
		
		int p11, p12, p13, p21, p22, p23;
		for(;;) {
			enter=sc.nextLine();
			
			p11=(int)(Math.round(Math.random()*3));
			p12=(int)(Math.round(Math.random()*3));
			p13=(int)(Math.round(Math.random()*3));
			System.out.println(p1.name+" 의 차례>>"+p11+" "+p12+" "+p13);
			
			if (p11==p12 && p12==p13 && p11==p13) {
				System.out.println(p1.name+" 님의 승리입니다.");
				break;
			}
			
			enter=sc.nextLine();
			
			p21=(int)(Math.round(Math.random()*3));
			p22=(int)(Math.round(Math.random()*3));
			p23=(int)(Math.round(Math.random()*3));
			System.out.println(p2.name+" 의 차례>>"+p21+" "+p22+" "+p23);
			
			if (p21==p22 && p22==p23 && p21==p23) {
				System.out.println(p2.name+" 님의 승리입니다.");
				break;
			}
		}
		
		
	}

}
