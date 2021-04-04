import java.util.Scanner;

public class MyExp {
	public int base, exp;
	public int getValue() {
		int num=1;
		for(int i=0;i<exp;i++) {
			num=num*base;
		}
		return num;
	}
	public static void main(String[] args) {
		int Exp;
		Scanner sc= new Scanner(System.in);
		MyExp solution = new MyExp();
		solution.base=sc.nextInt();
		solution.exp=sc.nextInt();
		Exp=solution.getValue();
		System.out.println(Exp);
	}

}
