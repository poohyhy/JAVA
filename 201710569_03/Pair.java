import java.util.Scanner;
public class Pair {
	public static void main(String[] args) {
		
		String course[] = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		Scanner sc= new Scanner(System.in);
		
		for(;;) {
			System.out.println("과목이름>>");
			String courseName=sc.next();
			if (courseName.equals("그만")) {
				break;
			}
			for (int i=0;i<(score.length+1);i++) {
				try {
					if (course[i].equals(courseName)) {
						System.out.println(course[i]+"의 점수는 : "+score[i]);
						break;
					}
					
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("없는 과목입니다!");
				}
				
			}
		}
		
		
		
	}

}
