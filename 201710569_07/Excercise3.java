import java.util.*;

public class Excercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student2> std=new ArrayList<Student2>();
		for(int i=0;i<5;i++) {
			System.out.println("이름, 학과, 학번, 학점평균을 차례로 입력하시오>>");
			std.add(new Student2(sc.next(), sc.next(), sc.next(), sc.nextDouble()));
		}
		for(int i=0;i<std.size();i++) {
			System.out.println("----------------------------");
			System.out.println(std.get(i).getInfo());
		}
	}
}
