import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int head;
		
		System.out.print("인원수>> ");
		head=sc.nextInt();
		Phone[] pb;
		pb=new Phone[head];
		for(int i=0;i<pb.length;i++ ) {
			System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸 없이 입력>> ");
			pb[i]=new Phone(sc.next(),sc.next());
		}
		System.out.println("저장되었습니다.");
		for(;;) {
			System.out.print("검색할 이름>> ");
			String input=sc.next();
			for(int j=0;j<pb.length;j++) {
				if (input.equals(pb[j].name)) {
					System.out.println(input+"의 번호는"+pb[j].tel+" 입니다.");
					break;
				}
				if (j==pb.length-1) {
					System.out.println(input+" 이 없습니다.");
					
				}
			}
			if(input.equals("그만")) {
				break;
			}
		}
	}

}
