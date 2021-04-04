import java.util.*;

public class Excercise4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Student2> dept=new HashMap<String, Student2>();
		for(int i=0;i<5;i++) {
			System.out.println("이름, 학과, 학번, 학점평균을 차례로 입력하시오>>");
			Student2 a=new Student2(sc.next(), sc.next(), sc.next(), sc.nextDouble());
			dept.put(a.id, a);
		}
		for(;;) {
			System.out.print("학번을 입력하여 학생정보 검색 (그만 을 입력하여 종료)>> ");
			String idSearch = sc.next();
			System.out.println(dept.get(idSearch).getInfo());
			if (idSearch.equals("그만")) {
				break;
			}
		}
	}
}
