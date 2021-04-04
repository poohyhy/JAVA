import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int intArray[] = new int[10];
		System.out.println("정수를 10개 입력하십시오.");
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=sc.nextInt();
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}

}
