import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		int max=0;
		
		
		System.out.println("정수를 5개 입력하십시오.");
		
		for (int i=0;i<5;i++) {
			intArray[i]=sc.nextInt();
			if (intArray[i]>max)
				max=intArray[i];
		}
		System.out.println("입력된 정수 중 가장 큰 정수는 "+max+"입니다.");
	}

}
