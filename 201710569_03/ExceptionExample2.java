import java.util.Scanner;
public class ExceptionExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		System.out.print("나뉘어질 수를 입력하시오. : ");
		a=sc.nextInt();
		System.out.print("나눌 수를 입력하시오. : ");
		b=sc.nextInt();
		try {
			System.out.println(a+" (을)를 "+b+" (으)로 나누면 몫은 "+a/b+"입니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌수는 없습니다.");
		}
	}

}
