import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a, b;
		String c;
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.next();
		if (c.equals("+")) {
			int result;
			Add ADD = new Add();
			ADD.setValue(a,b);
			result=ADD.calculate();
			System.out.println(result);
		}
		if (c.equals("-")) {
			int result;
			Sub SUB = new Sub();
			SUB.setValue(a,b);
			result=SUB.calculate();
			System.out.println(result);
		}
		if (c.equals("*")) {
			int result;
			Mul MUL = new Mul();
			MUL.setValue(a,b);
			result=MUL.calculate();
			System.out.println(result);
		}
		if (c.equals("/")) {
			int result;
			Div DIV = new Div();
			DIV.setValue(a,b);
			result=DIV.calculate();
			System.out.println(result);
		}
	}

}
